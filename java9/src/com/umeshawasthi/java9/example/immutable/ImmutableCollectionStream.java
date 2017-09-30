package com.umeshawasthi.java9.example.immutable;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImmutableCollectionStream {

    public static void main(String[] args) {

        Set<String> unmodifiableSet= Collections.unmodifiableSet(Stream.of("one","two","three").collect(Collectors.toSet()));

    }
}
