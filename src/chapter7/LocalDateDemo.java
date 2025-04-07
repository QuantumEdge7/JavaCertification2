package chapter7;

import java.time.LocalDate;

public class LocalDateDemo {
    public static void main(String[] args) {
        //current date
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);
        //Today's date: 2025-02-17

        //specific date
        LocalDate localDate = LocalDate.of(2020, 2, 14);
        System.out.println("Local date is: " + localDate);
       //Local date is: 2020-02-14

        //Add/subtract days
        LocalDate tomorrow = today.plusDays(1);
        LocalDate lastWeek = today.minusWeeks(1);
        System.out.println("Tomorrow: " + tomorrow);//Tomorrow: 2025-02-18
        System.out.println("Last week: " + lastWeek);//Last week: 2025-02-10

        //checking leap year
        System.out.println("Is leap year: " + today.isLeapYear());
        //Is leap year: false


        System.out.println(today.getYear());//2025
        System.out.println(today.getMonth());//FEBRUARY
        System.out.println(today.getMonthValue());//2
        System.out.println(today.getDayOfYear());//48
        System.out.println(today.getDayOfWeek());//MONDAY
        System.out.println(today.getDayOfMonth());//17

    }
}
