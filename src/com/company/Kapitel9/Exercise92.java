package com.company.Kapitel9;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Exercise92 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.of(2017, 10,2);
        LocalDate christmasNextYear = LocalDate.of(2018,12,24);
        Period p = Period.between(today, christmasNextYear);
        long p2 = ChronoUnit.DAYS.between(today,christmasNextYear);

        System.out.println("Next years Christmas is in " + p.getYears() +
        " years " + p.getMonths() + " months and " + p.getDays() + " days");
        System.out.println("It is a total of " + p2 + " days left");
    }
}
