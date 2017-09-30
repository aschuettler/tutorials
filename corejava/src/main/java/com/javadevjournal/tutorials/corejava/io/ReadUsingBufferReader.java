package com.javadevjournal.tutorials.corejava.io;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by umesh on 5/1/17.
 */
public class ReadUsingBufferReader {

    public static void main(String[] args) {
        String sampleTestString = "Converting input stream to String using JDK Buffer Reader";

        InputStream inputStream = new ByteArrayInputStream(sampleTestString.getBytes());
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder outStream = new StringBuilder();
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                outStream.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(outStream.toString());
    }

}
