package com.javadevjournal.tutorials.corejava.io.directory.copy;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemLoopException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

import static java.nio.file.FileVisitResult.CONTINUE;
import static java.nio.file.FileVisitResult.SKIP_SUBTREE;

/**
 * Created by umesh on 5/21/17.
 */
public class CustomFileVisitor extends SimpleFileVisitor<Path> {

    final Path source;
    final Path target;

    public CustomFileVisitor(Path source, Path target) {
        this.source = source;
        this.target = target;
    }



    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
            throws IOException
    {
        /**
         * <p>
         * Before visiting entries in a directory we copy the directory.Resolve will resolve given path against this path.
         * Constructs a relative path between this path and a given path.</p>
         */
        Path newDirectory= target.resolve(source.relativize(dir));
        try{
            Files.copy(dir,newDirectory);
        }
        catch (FileAlreadyExistsException ioException){
            //log it and move
            return SKIP_SUBTREE; // skip processing
        }

        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

       Path newFile = target.resolve(source.relativize(file));

        try{
            Files.copy(file,newFile);
        }
        catch (IOException ioException){
            //log it and move
        }

        return FileVisitResult.CONTINUE;

    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {

        /* Leaving this out, you can always use this to fix modified time of the directory
        when copy is done
        Hint use  Files.getLastModifiedTime(...) and Files.setLastModifiedTime(...)
        */
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) {
        if (exc instanceof FileSystemLoopException) {
            //log error
        } else {
            //log error
        }
        return CONTINUE;
    }
}
