package com.javadevjournal.tutorials.corejava.io;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Created by umesh on 5/1/17.
 */
public class ReadUsingScanner {

    public static void main(String[] args) {

        String sampleTestString = "Converting input stream to String using JDK Using Scanner";
        InputStream inputStream = new ByteArrayInputStream(sampleTestString.getBytes());

        Scanner inputScanner = new Scanner(inputStream, StandardCharsets.UTF_8.name()).useDelimiter("\\A");
        String output = inputScanner.hasNext() ? inputScanner.next() : "";
        System.out.println(output);
        inputScanner.close();
    }
}
