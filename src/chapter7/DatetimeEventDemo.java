package chapter7;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DatetimeEventDemo {
    public static void main(String[] args) {
        Instant start = Instant.now();
        System.out.println("start instant: " + start);
        //start instant: 2025-02-20T22:58:41.307573500Z

        LocalDate today = LocalDate.now();
        Period oneMonth = Period.ofMonths(1);
        LocalDate eventDate = today.plus(oneMonth);
        System.out.println("Event date: " + eventDate);
        //Event date: 2025-03-20


        try { // Pausing Execution for 1 Second
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Instant end = Instant.now();//2025-02-20T22:58:41.307573500Z
        Duration elapsed = Duration.between(start, end);
        System.out.println(elapsed.toMillis());//1050

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime oneWeekLater = localDateTime.plus(1, ChronoUnit.WEEKS);
        System.out.println(oneWeekLater);
        //2025-02-27T16:58:42.357769700

        long daysToEvent = ChronoUnit.DAYS.between(today, eventDate);
        System.out.println(daysToEvent);//28
    }
}
