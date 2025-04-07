package chapter7;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZoneDemo {
    public static void main(String[] args) {
        ZonedDateTime utcNow = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println("Current UTC time: " + utcNow);
        //Current UTC time: 2025-02-20T19:38:11.784907Z[UTC]
        //1:38 pm CST

        ZonedDateTime myTime = utcNow.withZoneSameInstant(ZoneId.of("Asia/Katmandu"));
        System.out.println("Time in nepal: " + myTime);
        //Time in nepal: 2025-02-21T01:23:11.784907+05:45[Asia/Katmandu]

        ZonedDateTime losAngelsTime = utcNow.withZoneSameInstant(ZoneId.
                of("America/Los_Angeles"));
        System.out.println("Time in los angels: " + losAngelsTime);
        //Time in los angels: 2025-02-20T11:38:11.784907-08:00[America/Los_Angeles]

        ZonedDateTime beforeDST = ZonedDateTime.of(
                2025, 3, 9, 1, 30, 0, 0,
                ZoneId.of("America/New_York"));
        System.out.println("Before DST change: " + beforeDST);
        //Before DST change: 2025-03-09T01:30-05:00[America/New_York]

        ZonedDateTime afterDSt = beforeDST.plusHours(2);
        System.out.println("After DST change: " + afterDSt);
        //After DST change: 2025-03-09T04:30-04:00[America/New_York]
    }
}
