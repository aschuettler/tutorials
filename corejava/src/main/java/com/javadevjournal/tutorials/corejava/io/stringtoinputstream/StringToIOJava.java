package com.javadevjournal.tutorials.corejava.io.stringtoinputstream;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * Created by umesh on 5/9/17.
 */
public class StringToIOJava {

    public static void main(String[] args) throws IOException {

        String inputString = "This is a String to demo as how to convert it to input stream using Core Java API";

        //String to input stream
        try (InputStream inputStream = new ByteArrayInputStream(inputString.getBytes(StandardCharsets.UTF_8));
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))
        ) {
            String content;

            while ((content = bufferedReader.readLine()) != null) {
                //work with file
            }

        }
    }
}
