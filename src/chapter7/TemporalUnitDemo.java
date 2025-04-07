package chapter7;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TemporalUnitDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);//2025-02-20T16:43:33.864376400

        LocalDateTime twoDaySLater = now.plus(2, ChronoUnit.DAYS);
        System.out.println(twoDaySLater);//2025-02-22T16:43:33.864376400

        LocalDateTime fiveHourEarlier = now.minus(5, ChronoUnit.HOURS);
        System.out.println(fiveHourEarlier);//2025-02-20T11:43:33.864376400

        long daysBetween = ChronoUnit.DAYS.between(now, twoDaySLater);
        System.out.println(daysBetween);//2
    }
}
