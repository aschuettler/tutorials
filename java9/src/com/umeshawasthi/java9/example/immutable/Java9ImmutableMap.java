package com.umeshawasthi.java9.example.immutable;

import java.util.Map;

public class Java9ImmutableMap {

    public static void main(String[] args) {

        Map<String, Integer> immutableMap = Map.of("one",1, "two", 2);
    }

    public static void useMapEntries(){

        Map<String, Integer> map = Map.ofEntries(
                Map.entry("one", 1),
                Map.entry("two", 2),
                Map.entry("three", 3)
        );
    }
}
