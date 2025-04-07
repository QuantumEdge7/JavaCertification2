package chapter7;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        //2025-02-17T19:17:30.646363

        LocalDateTime specificDateTime = LocalDateTime.of
                (2024, 2, 14, 12, 0);
        System.out.println(specificDateTime);
        //2024-02-14T12:00

        LocalDateTime nextWeek = now.plusWeeks(1);
        System.out.println(nextWeek);
        //2025-02-24T19:17:30.646363

        System.out.println("Date: "+ now.toLocalDate());
        //Date: 2025-02-17
        System.out.println("Time: "+ now.toLocalTime());
        //Time: 19:17:30.646363
    }
}
