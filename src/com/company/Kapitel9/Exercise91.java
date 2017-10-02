package com.company.Kapitel9;

import java.time.LocalDate;

public class Exercise91 {
    public static void main(String[] args) {
        LocalDate lastRunDate = LocalDate.of(2016, 11, 11);
        LocalDate today = LocalDate.of(2016, 11, 16);

        LocalDate diff = lastRunDate.plusDays(7);



        if (diff.isAfter(today)){
            System.out.println("Dags att springa igen");
        } else
        {
            System.out.println("Inte dags än");
        }


    }

}
