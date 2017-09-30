package com.javadevjournal.tutorials.corejava.io.directory.list;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by umesh on 5/23/17.
 */
public class ListFilesByStream {

    public static void main(String[] args) throws IOException {

        Path source = Paths.get("/Users/umesh/personal/tutorials/source");
        Files.walk(source).filter(Files::isRegularFile).forEach(System.out::println);
    }
}
