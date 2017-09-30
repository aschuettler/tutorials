package com.javadevjournal.tutorials.corejava.io.readfile;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by umesh on 5/3/17.
 */
public class ReadLargeFIleUsingStream {

    public static void main(String[] args) throws IOException {

        String fileName = "/Users/umesh/personal/tutorials/fileread/file.txt"; //this path is on my local
        // lines(Path path, Charset cs)
        try (Stream<String> inputStream = Files.lines(Paths.get(fileName), StandardCharsets.ISO_8859_1)) {
            inputStream.forEach(System.out::println);
        }
    }
}
