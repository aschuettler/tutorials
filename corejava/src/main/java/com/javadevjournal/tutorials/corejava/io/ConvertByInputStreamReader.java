package com.javadevjournal.tutorials.corejava.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

/**
 * Created by umesh on 5/1/17.
 */
public class ConvertByInputStreamReader {

    public static void main(String[] args) {
        String sampleTestString = "Converting input stream to String using JDK Input Stream Reader";
        InputStream inputStream = new ByteArrayInputStream(sampleTestString.getBytes());
        System.out.println(inputStream);

    }

    private static String getStringByInputStreamReader(final InputStream inputStream) throws IOException {
        final int bufferSize = 1024;
        final char[] buffer = new char[bufferSize];
        final StringBuilder output = new StringBuilder();

        Reader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        int character = 0;
        while ((character = streamReader.read(buffer, 0, buffer.length)) > 0) {
            output.append(buffer, 0, character);
        }
        return output.toString();
    }
}
