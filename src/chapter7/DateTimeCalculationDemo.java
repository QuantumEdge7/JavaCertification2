package chapter7;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeCalculationDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today: "+today);
        //Today: 2025-02-20

        LocalDate futureDate = today.plusDays(10);
        System.out.println("10 days later: "+ futureDate);
        //10 days later: 2025-03-02

        LocalDate pastDate = today.minusMonths(1);
        System.out.println("1 month earlier: "+pastDate);
       // 1 month earlier: 2025-01-20

        LocalTime startTime = LocalTime.of(10, 0);
        LocalTime endTime = LocalTime.of(14, 30);
        Duration  duration = Duration.between(startTime, endTime);
        System.out.println(duration.toHours());//4
        System.out.println(duration.toMinutes());//270
    }
}
