package chapter7;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2022, 1, 1);
        LocalDate endDate = LocalDate.of(2025, 2, 17);

        Period period = Period.between(startDate, endDate);
        System.out.println("Period: " + period);//Period: P3Y1M16D
        System.out.println("Years: " + period.getYears());//Years: 3
        System.out.println("Months: " + period.getMonths());//Months: 1
        System.out.println("Days: " + period.getDays());//Days: 16

        LocalDate today = LocalDate.now();
        System.out.println(today);//2025-02-20
        LocalDate birthDay = LocalDate.of(1990, 5, 15);
        Period age = Period.between(birthDay, today);
        System.out.println(age);//P34Y9M5D
        System.out.println(age.getYears()); //34
        System.out.println(age.getMonths());//9
        System.out.println(age.getDays());//5

        Period twoMonths = Period.ofMonths(2);
        LocalDate futureDate = today.plus(twoMonths);
        System.out.println(futureDate); //2025-04-20
    }
}
