package com.javadevjournal.tutorials.corejava.java8.date;

import java.time.LocalDate;
import java.util.Date;

public class JavaDateExample {

    public static void main(String[] args) {

        Date date = new Date(117, 11,5);

        System.out.println(date.toString());

        LocalDate currentDate=LocalDate.of(2017, 12,03);
        System.out.println(currentDate.getDayOfWeek());
    }
}
