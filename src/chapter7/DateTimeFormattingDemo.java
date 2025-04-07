package chapter7;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormattingDemo {

    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Default format: " + zonedDateTime);
        //Default format: 2025-02-20T21:20:21.793218300+01:00[Europe/Paris]

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        String formattedDate  = zonedDateTime.format(formatter);
        System.out.println(formattedDate);
        //2025-02-20 21:20:21 CET

        String dateString = "2025-02-18 02:29:19 CET";
        ZonedDateTime parsedDate = ZonedDateTime.parse(dateString, formatter);
        System.out.println(parsedDate);
//        2025-02-18T02:29:19+01:00[CET]
    }
}
