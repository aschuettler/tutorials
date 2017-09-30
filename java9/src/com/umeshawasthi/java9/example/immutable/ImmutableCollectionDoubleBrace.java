package com.umeshawasthi.java9.example.immutable;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableCollectionDoubleBrace {

    public static void main(String[] args) {

        Set<String> immutableSet = Collections.unmodifiableSet(new HashSet<>() {{
            add("one");
            add("two");
            add("three");
        }});
    }
}
