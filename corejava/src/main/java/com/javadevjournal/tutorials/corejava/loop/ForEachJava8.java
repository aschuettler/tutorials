package com.javadevjournal.tutorials.corejava.loop;

import java.util.Arrays;
import java.util.List;

public class ForEachJava8 {

    public static void main(String[] args) {

        List<String> stringList= Arrays.asList("One", "Two","Three", "Four");

        //Before Java 8

        for(String value : stringList){

            //work will be done here
        }

        // With Java 8 and Lambda Expressions

        stringList.forEach(name -> System.out.println(name));

    }
}
