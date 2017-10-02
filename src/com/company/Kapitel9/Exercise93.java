package com.company.Kapitel9;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise93 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.of(2017, 9, 19, 14, 5, 0);

        System.out.println(now.format(DateTimeFormatter.ofPattern("E-dd, yyyy")));
        System.out.println(now.format(DateTimeFormatter.ofPattern("MMMM-dd, yyyy")));
        System.out.println(now.format(DateTimeFormatter.ofPattern("dd-MMMM, yyyy")));
        System.out.println(now.format(DateTimeFormatter.ofPattern("HH:MM a")));
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy/dd/m")));
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy/dd/mm")));


    }
}
