package com.javadevjournal.tutorials.corejava.io.nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by umesh on 5/30/17.
 */
public class NIOIntroduction {

    public static void main(String[] args) {

        Path path = Paths.get("/Users/umesh/personal/tutorials/source");
        Path filePath = Paths.get("/Users/umesh/personal/tutorials/source/changelog.md");

        checkIfFileDirExist(path);
        checkIfFileDirNotExist(path);
        checkIfReadable(path);
        checkIfWritable(path);

        checkIfDirectory(filePath);

    }


    public static void checkIfFileDirExist(final Path location){
        System.out.println(Files.exists(location));
    }


    public static void checkIfFileDirNotExist(final Path location){
        System.out.println(Files.notExists(location));
    }

    public static void checkIfReadable(final Path location){
        System.out.println(Files.isReadable(location));
    }

    public static void checkIfWritable(final Path location){
        System.out.println(Files.isWritable(location));
    }

    public static void checkIfDirectory(final Path fileLocation){
        System.out.println(Files.isDirectory(fileLocation));
    }

}
