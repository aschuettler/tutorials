package com.javadevjournal.tutorials.corejava.io.directory.move;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by umesh on 5/22/17.
 */
public class MoveFile {

    public static void main(String[] args) throws IOException {
        Path source = Paths.get("/Users/umesh/personal/tutorials/source/store.html");
        Path target = Paths.get("/Users/umesh/personal/tutorials/target");

        Files.move(source,target.resolve(source.getFileName()));

    }
}
