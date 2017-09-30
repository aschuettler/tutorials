package com.javadevjournal.tutorials.corejava.io.directory.copy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by umesh on 5/21/17.
 */
public class CopyFIle {

    public static void main(String[] args) throws IOException {

        Path sourceDirectory = Paths.get("/Users/umesh/personal/tutorials/source/Variation_Relations.csv");
        Path targetDirectory = Paths.get("/Users/umesh/personal/tutorials/target1/Variation_Relations.csv");

        //copy source to target using Files Class
        Files.copy(sourceDirectory, targetDirectory);

    }
}
