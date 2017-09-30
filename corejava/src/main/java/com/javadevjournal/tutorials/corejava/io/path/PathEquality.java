package com.javadevjournal.tutorials.corejava.io.path;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by umesh on 6/1/17.
 */
public class PathEquality {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("/Users/umesh/personal/tutorials/source");
        Path path1 = Paths.get("/Users/umesh/personal/tutorials/source1");

        System.out.println(path.equals(path1));
        System.out.println(path.startsWith(path1));
    }
}
