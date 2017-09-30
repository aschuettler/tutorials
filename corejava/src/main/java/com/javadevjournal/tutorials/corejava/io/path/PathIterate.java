package com.javadevjournal.tutorials.corejava.io.path;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * Created by umesh on 6/1/17.
 */
public class PathIterate {

    public static void main(String[] args) {

        Path paths= Paths.get("/Users/umesh/personal/tutorials/source/bootstrap",
                "/Users/umesh/personal/tutorials/source/build",
                "/Users/umesh/personal/tutorials/source/dist");

        for (Path path :paths){
            System.out.println(path.toAbsolutePath());
        }

        Arrays.asList("1", "2","3");
    }
}
