package chapter7;

import java.time.Duration;
import java.time.Instant;

public class DurationDemo2 {
    public static void main(String[] args) {
        Instant start = Instant.now();
        System.out.println(start);
        //2025-02-20T20:46:12.841792400Z

        try {
            Thread.sleep(2000); //2 sec
            //puts program in sleep mode for respective time
        } catch (InterruptedException e) {
           e.printStackTrace();
        }

        Instant end = Instant.now();
        System.out.println(end);
        //2025-02-20T20:46:14.858737700Z

        Duration timeElapsed = Duration.between(start, end);
        System.out.println(timeElapsed.getSeconds()); //2
        System.out.println(timeElapsed.toMillis()); //2009

        Duration twoHours = Duration.ofHours(2);
        Instant twoHourLater = start.plus(twoHours);
        System.out.println(twoHourLater);//2025-02-20T22:44:53.671304Z
    }
}
