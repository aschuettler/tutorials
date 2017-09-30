package com.javadevjournal.tutorials.corejava.string;

import java.util.StringJoiner;

public class StringJoinerExample {

    public static void main(String[] args) {

        joinerWithDelimiter();
        joinerWithDelimiterWithPrefixAndSuffix();
        useMultipleStringJoiner();
    }

    public static void joinerWithDelimiter() {
        StringJoiner joiner = new StringJoiner(",");
        joiner.add("Sunday");
        joiner.add("Monday");
        joiner.add("Tuesday");

        System.out.println(joiner.toString());
    }

    public static void joinerWithDelimiterWithPrefixAndSuffix() {
        StringJoiner joiner = new StringJoiner(",", "Prefix-", "-Suffix");
        joiner.add("Sunday");
        System.out.println(joiner.toString());
    }


    public static void useMultipleStringJoiner() {
        StringJoiner joiner1 = new StringJoiner("|");
        StringJoiner joiner2 = new StringJoiner(";");
        StringJoiner joiner3 = new StringJoiner(";");

        joiner2.add("one");
        joiner2.add("two");
        joiner1.merge(joiner2);

        joiner3.add("three");
        joiner3.add("four");
        joiner1.merge(joiner3);

        System.out.println(joiner1.toString());
    }

}
