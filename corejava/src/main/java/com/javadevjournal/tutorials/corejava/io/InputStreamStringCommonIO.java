package com.javadevjournal.tutorials.corejava.io;

import org.apache.commons.io.IOUtils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * Created by umesh on 5/1/17.
 */
public class InputStreamStringCommonIO {

    public static void main(String[] args) throws IOException {

        String sampleTestString = "Converting input stream to String using Apache Common IO";
        InputStream inputStream = new ByteArrayInputStream(sampleTestString.getBytes());

        convertUsingCopy(inputStream, StandardCharsets.UTF_8);
        convertUsingToString(inputStream, StandardCharsets.UTF_8);
    }

    public static void convertUsingCopy(final InputStream inputStream, final Charset inputEncoding) throws IOException {
        StringWriter writer = new StringWriter();
        IOUtils.copy(inputStream, writer, inputEncoding);
        System.out.println(writer.toString());
    }

    public static void convertUsingToString(final InputStream inputStream, final Charset inputEncoding) throws IOException {
        String output = IOUtils.toString(inputStream, inputEncoding);
        System.out.println(output);
        IOUtils.closeQuietly(inputStream);
    }
}
