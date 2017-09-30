package com.javadevjournal.tutorials.corejava.io.writefile;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by umesh on 5/10/17.
 */
public class BufferWriterAppend {

    public static void main(String[] args) throws IOException {

        String fileContent = "This is a demo to show BufferWriter";
        String fileContent1 = " In Append Mode";
        String fileLocation = "/filewrite/sampleFiletxt";

        Path filePath = Paths.get(fileLocation);
        try (BufferedWriter writer = Files.newBufferedWriter(filePath, StandardCharsets.UTF_8, StandardOpenOption.APPEND)) {
            writer.append(fileContent);
            writer.append(fileContent1);
        }
    }
}
