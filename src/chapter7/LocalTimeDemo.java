package chapter7;

import java.time.LocalTime;

public class LocalTimeDemo {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);
        //19:00:31.975059

        LocalTime specificTime = LocalTime.of(10, 30);
        System.out.println(specificTime);//10:30

        LocalTime later = now.plusHours(2);
        System.out.println(later); //21:00:31.975059

        boolean isBefore = now.isBefore(specificTime);
        System.out.println(isBefore); //false
    }
}
