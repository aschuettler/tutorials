package com.javadevjournal.tutorials.corejava.io.directory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by umesh on 5/15/17.
 */
public class CreateDirectories {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/umesh/personal/tutorials_new/newDirectory");
        Files.createDirectories(path);
    }
}
