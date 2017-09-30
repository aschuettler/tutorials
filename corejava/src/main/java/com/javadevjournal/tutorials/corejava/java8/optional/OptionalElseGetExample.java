package com.javadevjournal.tutorials.corejava.java8.optional;

import java.util.Optional;

/**
 * Created by umesh on 6/7/17.
 */
public class OptionalElseGetExample {

    public static void main(String[] args) {

        //checkOrElse();
        checkOrElseGet();
    }


    public static void checkOrElse() {
        Optional<String> testingOrElse = Optional.of("Testing orElse method");
        String finalOutput = testingOrElse.orElse(printHelloWorld());
        System.out.println("optional result:: " + finalOutput);

        Optional<String> testingOrElseGet = Optional.of("Testing orElse method");
        String finalOrElseOutput = testingOrElseGet.orElseGet(() -> printHelloWorld());
        System.out.println("optional result:: " + finalOrElseOutput);
    }

    public static void checkOrElseGet() {

        Optional<String> testingOrElse = Optional.ofNullable(null);
        String finalOutput = testingOrElse.orElse(printHelloWorld());
        System.out.println("optional result:: " + finalOutput);

        Optional<String> testingOrElseGet = Optional.ofNullable(null);
        String finalOrElseOutput = testingOrElseGet.orElseGet(() -> printHelloWorld());
        System.out.println("optional result:: " + finalOrElseOutput);
    }

    public static String printHelloWorld() {
        System.out.println("Hello World");
        return "Say Hello";
    }
}
