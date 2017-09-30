package com.javadevjournal.tutorials.corejava.io.path;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by umesh on 5/31/17.
 */
public class CreatePath {

    public static void main(String[] args) {

        Path path = Paths.get("/Users/umesh/personal/tutorials/source");
        pathMethod(path);
    }

    public static void pathMethod(Path path) {

        System.out.println("toString method :: " + path.toString());
        System.out.println("getFileName :: " + path.getFileName());
        System.out.println("getFileSystem :: " + path.getFileSystem());
        System.out.println("Get Root Name :: " + path.getRoot());
        System.out.println("Get Parent ::" + path.getParent());
        System.out.println("get count :: " + path.getNameCount());
    }
}
