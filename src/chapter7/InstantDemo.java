package chapter7;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantDemo {
    public static void main(String[] args) {
        Instant now = Instant.now(); // get the current time
        System.out.println("Current time: " + now);
        //Current time: 2025-02-20T17:20:33.310397100Z

        Instant later = now.plusSeconds(3600);
        System.out.println("later: " + later);
        //Current time: 2025-02-20T17:20:33.310397100Z

        Instant pastInstant = now.minusSeconds(3600);
        System.out.println("Past instant: " + pastInstant );
        //Past instant: 2025-02-20T16:20:33.310397100Z

        long epochMilli = now.toEpochMilli();
        System.out.println("epoch milli: " + epochMilli);
        //epoch milli: 1740072033310

        ZonedDateTime zonedDateTime = now.atZone(ZoneId.of("America/New_York"));
        System.out.println("New york time: " + zonedDateTime);
        //New york time: 2025-02-20T12:20:33.310397100-05:00[America/New_York]

        Instant specificInstant = Instant.ofEpochSecond(1625504400);
        System.out.println("Specific instant: "+specificInstant);
        //Specific instant: 2021-07-05T17:00:00Z
    }
}
