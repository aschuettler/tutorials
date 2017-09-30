package com.javadevjournal.tutorials.corejava.io.directory.size;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by umesh on 6/5/17.
 */
public class DirectorySizeJava8 {

    public static void main(String[] args) throws IOException {

        Path rootDirectory = Paths.get("/Users/umesh/personal/tutorials/source/bootstrap");

        long directorySize = Files.walk(rootDirectory)
                .map(f -> f.toFile())
                .filter(f -> f.isFile())
                .mapToLong(f -> f.length()).sum();

        System.out.println("size of the directory is ::"+directorySize);
    }
}
