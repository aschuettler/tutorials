package com.javadevjournal.tutorials.corejava.io.directory.copy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by umesh on 5/21/17.
 */
public class CopyFilesRecursively {

    public static void main(String[] args) throws IOException {

        Path sourceLocation= Paths.get("/Users/umesh/personal/tutorials/source");
        Path targetLocation =Paths.get("/Users/umesh/personal/tutorials/target");

        CustomFileVisitor fileVisitor = new CustomFileVisitor(sourceLocation, targetLocation);
        //You can specify your own FileVisitOption
        Files.walkFileTree(sourceLocation, fileVisitor);
    }
}
