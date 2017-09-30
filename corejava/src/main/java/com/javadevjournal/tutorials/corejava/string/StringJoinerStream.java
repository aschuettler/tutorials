package com.javadevjournal.tutorials.corejava.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringJoinerStream {

    public static void main(String[] args) {

        List<Customer> customers = Arrays.asList(
                new Customer("John", "Smith"),
                new Customer("Umesh", "Awasthi"),
                new Customer("Andy", "Flower")
        );

        final String customerJoin = customers.stream()
                .map(Customer::getFirstName)
                .collect(Collectors.joining(";"));

        System.out.println(customerJoin);
        compareStringJoiner();
    }

    public static void compareStringJoiner(){

        List<String> list = Arrays.asList("Foo","Bar");

        //join string using StringJoiner
        String output = list.stream().collect(Collectors.joining(","));

        //using SpringBuilder

        String collectoutput =
                list.stream().collect(Collector.of(StringBuilder::new,
                        (stringBuilder, str) -> stringBuilder.append(str).append(", "),
                        StringBuilder::append,
                        StringBuilder::toString));

        System.out.println(collectoutput);
    }
}
