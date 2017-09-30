package com.umeshawasthi.java9.example.immutable;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by umesh on 6/4/17.
 */
public class ImmutableCollection {

    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();
        set.add("one");
        set.add("two");
        set.add("three");

        Set<String> immutableSet = Collections.unmodifiableSet(set);
    }
}
