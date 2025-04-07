package chapter7;

import java.time.Duration;
import java.time.LocalTime;

public class DurationDemo {
    public static void main(String[] args) {
        LocalTime startTime = LocalTime.of(9, 0);
        LocalTime endTime = LocalTime.of(17, 30);

        Duration duration = Duration.between(startTime, endTime);
        System.out.println("Duration: " + duration); //Duration: PT8H30M

        System.out.println("Hours: "+duration.toHours()); //Hours: 8
        System.out.println("Minutes: "+duration.toMinutes());//Minutes: 510
    }
}
