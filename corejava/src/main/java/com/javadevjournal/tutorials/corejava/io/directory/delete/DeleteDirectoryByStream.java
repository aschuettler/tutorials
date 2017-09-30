package com.javadevjournal.tutorials.corejava.io.directory.delete;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;

/**
 * Created by umesh on 5/17/17.
 */
public class DeleteDirectoryByStream {

    public static void main(String[] args) throws IOException {

        Path rootDirectory = Paths.get("/Users/umesh/personal/tutorials/stream");
        Files.walk(rootDirectory, FileVisitOption.FOLLOW_LINKS)
                .sorted(Comparator.reverseOrder())
                .map(Path::toFile)
                .forEach(File::delete);
     }
}
