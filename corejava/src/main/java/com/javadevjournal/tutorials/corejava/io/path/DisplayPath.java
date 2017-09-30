package com.javadevjournal.tutorials.corejava.io.path;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by umesh on 6/1/17.
 */
public class DisplayPath {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("/Users/umesh/personal/tutorials/source");

        System.out.format("toURI: %s%n", path.toUri());
        System.out.format("toAbsolutePath: %s%n", path.toAbsolutePath());
        System.out.format("toRealPath: %s%n", path.toRealPath());
    }
}
