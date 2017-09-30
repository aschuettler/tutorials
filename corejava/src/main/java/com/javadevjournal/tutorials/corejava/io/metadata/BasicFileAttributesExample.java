package com.javadevjournal.tutorials.corejava.io.metadata;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileOwnerAttributeView;

/**
 * Created by umesh on 6/27/17.
 */
public class BasicFileAttributesExample {

    static final long size = 1024;

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("/Users/umesh/personal/tutorials/source");

        printFileBasicAttributes(path);
        printFileOwnerAttributes(path);
        printFileStore(path);
    }

    private static void printFileBasicAttributes(Path path) throws IOException {

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        BasicFileAttributes basicFileAttributes = fileAttributeView.readAttributes();

        System.out.println("creationTime: " + basicFileAttributes.creationTime());
        System.out.println("lastAccessTime: " + basicFileAttributes.lastAccessTime());
        System.out.println("lastModifiedTime: " + basicFileAttributes.lastModifiedTime());

        System.out.println("isDirectory: " + basicFileAttributes.isDirectory());
        System.out.println("isOther: " + basicFileAttributes.isOther());
        System.out.println("isRegularFile: " + basicFileAttributes.isRegularFile());
        System.out.println("isSymbolicLink: " + basicFileAttributes.isSymbolicLink());
        System.out.println("size: " + basicFileAttributes.size());
    }


    private static void printFileOwnerAttributes(Path path) throws IOException {

        FileOwnerAttributeView fileOwner=Files.getFileAttributeView(path, FileOwnerAttributeView.class);
        System.out.println("File Owner Name " +fileOwner.getOwner());
    }

    private static void printFileStore(Path path) throws IOException {

        FileStore store = Files.getFileStore(path);

        long total = store.getTotalSpace() / size;
        long used = (store.getTotalSpace() - store.getUnallocatedSpace()) / size;
        long available = store.getUsableSpace() / size;

        System.out.println("Total Space used : "+total);
        System.out.println("Total used space : "+used);
        System.out.println("Total available space :"+available);

    }
}
