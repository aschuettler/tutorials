package com.javadevjournal.tutorials.corejava.exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by umesh on 5/8/17.
 */
public class StackTraceToStringJava {

    public static void main(String[] args) {

        try {
            throwDummyException();
        } catch (FileNotFoundException exception) {

            StringWriter writer = new StringWriter();
            PrintWriter printWriter= new PrintWriter(writer);
            exception.printStackTrace(printWriter);
            System.out.println("Exception in String is :: " + writer.toString());
        }
    }

    public static void throwDummyException() throws FileNotFoundException {
        throw new FileNotFoundException("Throwing file not found exception for demo purpose");
    }
}
