package com.javadevjournal.tutorials.corejava.io.writefile;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by umesh on 5/10/17.
 */
public class WriteFileByBufferedWriter {

    public static void main(String[] args) throws IOException {

        String fileContent = "We will demo as how to write using Java BufferWriter";
        String fileLocation = "/tutorials/filewrite/";

        writeFileByOutputStream(fileContent, fileLocation + "file1.txt");
        writeFileUsingFilesBufferedWriter(fileContent, fileLocation + "file2.txt");
    }


    public static void writeFileByOutputStream(final String fileContent, final String fileLocation) throws IOException {

        try (BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(fileLocation), "UTF-8"))) {
            out.write(fileContent);
        }

    }

    public static void writeFileUsingFilesBufferedWriter(final String fileContent, final String fileLocation) throws IOException {
        Path filePath = Paths.get(fileLocation);
        try (BufferedWriter writer = Files.newBufferedWriter(filePath, StandardCharsets.UTF_8)) {
            writer.write(fileContent);

        }
    }
}
