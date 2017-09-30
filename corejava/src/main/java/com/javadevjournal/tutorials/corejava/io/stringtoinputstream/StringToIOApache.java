package com.javadevjournal.tutorials.corejava.io.stringtoinputstream;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * Created by umesh on 5/9/17.
 */
public class StringToIOApache {

    public static void main(String[] args) throws IOException {

        String inputString = "This is a String to demo as how to convert it to input stream using Apache Commons IO";

        InputStream inputStream = IOUtils.toInputStream(inputString, StandardCharsets.UTF_8);

    }

}
