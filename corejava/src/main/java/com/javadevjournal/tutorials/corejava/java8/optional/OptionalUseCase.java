package com.javadevjournal.tutorials.corejava.java8.optional;

import java.util.Optional;

/**
 * Created by umesh on 6/8/17.
 */
public class OptionalUseCase {

    public static Optional<Integer> parseInt(String value) {

        try {
            return Optional.of(Integer.parseInt(value));
        } catch (NumberFormatException nfe) {
            return Optional.empty();
        }
    }
}
