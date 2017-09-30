package com.javadevjournal.tutorials.corejava.util.archive;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by umesh on 5/25/17.
 */
public class ZipDirectoryFilesWalk {

    public static void main(String[] args) throws IOException {

        Path sourceDirectoryPath = Paths.get("/Users/umesh/personal/tutorials/source");
        Path zipFilePath = Paths.get("/Users/umesh/personal/tutorials/source.zip");

        zipDirectory(sourceDirectoryPath, zipFilePath);
    }

    public static void zipDirectory(Path sourceDirectory, Path zipFilePath) throws IOException {

        try (FileOutputStream fileOutputStream = new FileOutputStream(zipFilePath.toFile());
             ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream)
        ) {
            Files.walkFileTree(sourceDirectory, new SimpleFileVisitor<Path>() {

                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
                        throws IOException {
                    zipOutputStream.putNextEntry(new ZipEntry(sourceDirectory.relativize(file).toString()));
                    Files.copy(file, zipOutputStream);
                    zipOutputStream.closeEntry();
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
                        throws IOException {
                    zipOutputStream.putNextEntry(new ZipEntry(sourceDirectory.relativize(dir).toString() + "/"));
                    zipOutputStream.closeEntry();
                    return FileVisitResult.CONTINUE;
                }

            });
        }
    }
}
