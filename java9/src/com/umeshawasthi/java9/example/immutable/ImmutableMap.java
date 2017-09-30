package com.umeshawasthi.java9.example.immutable;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableMap {

    public static void main(String[] args) {

        Set<String> immutableSet = Collections.unmodifiableSet(new HashSet<String>(Arrays.asList("one", "two","three")));
    }
}
