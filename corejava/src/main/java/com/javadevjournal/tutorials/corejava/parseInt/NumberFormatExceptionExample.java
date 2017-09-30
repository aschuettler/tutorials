package com.javadevjournal.tutorials.corejava.parseInt;

/**
 * Created by umesh on 4/29/17.
 */
public class NumberFormatExceptionExample {

    public static void main(String[] args) {
        String invalidNumber = "abc";
        parseIntNFException(invalidNumber);

    }

    public static void parseIntNFException(String number) {
        Integer result = Integer.parseInt(number);
        System.out.println(result);
    }

    public static void valueOfNFException(String number) {
        Integer result = Integer.valueOf(number);
        System.out.println(result);
    }
}