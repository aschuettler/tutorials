package com.javadevjournal.tutorials.corejava.exception;

import org.apache.commons.lang3.exception.ExceptionUtils;

import java.io.FileNotFoundException;

/**
 * Created by umesh on 5/8/17.
 */
public class StackTraceToStringApache {

    public static void main(String[] args) {

        try {
            throwDummyException();
        } catch (FileNotFoundException exception) {
            String stackTraceAsString= ExceptionUtils.getStackTrace(exception);
            System.out.println("Strack Trace using Apache Commons :" + stackTraceAsString);
        }
    }

    public static void throwDummyException() throws FileNotFoundException {
        throw new FileNotFoundException("Throwing file not found exception for demo purpose Apache Commons Lang");
    }
}
