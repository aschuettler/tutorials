package com.javadevjournal.tutorials.corejava.io.directory.size;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by umesh on 6/5/17.
 */
public class DirectorySizeJava7 {

    public static void main(String[] args) throws IOException {

        Path rootDirectory= Paths.get("/Users/umesh/personal/tutorials/source/bootstrap");
        AtomicLong size= new AtomicLong(0);

        Files.walkFileTree(rootDirectory, new SimpleFileVisitor<Path>(){

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
                    throws IOException{

                 size.addAndGet(attrs.size());
                return  FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exception)
                    throws IOException
            {
               //log exception
                throw exception;
            }

            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exception) {

                //log exception for error in reading file if exception is not null
                return FileVisitResult.CONTINUE;
            }

        });

        System.out.println("size of the folder is :: " + size);
    }

}
