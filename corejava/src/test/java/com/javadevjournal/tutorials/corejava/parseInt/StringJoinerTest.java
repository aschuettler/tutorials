package com.javadevjournal.tutorials.corejava.parseInt;

import org.junit.Test;

import java.util.StringJoiner;

import static org.junit.Assert.assertEquals;

public class StringJoinerTest {

    @Test
    public void stringJoinerTest(){

        StringJoiner joiner = new StringJoiner(",");
        joiner.add("Sunday");
        joiner.add("Monday");
        joiner.add("Tuesday");

        assertEquals("Sunday,Monday,Tuesday", joiner.toString());
    }
}
