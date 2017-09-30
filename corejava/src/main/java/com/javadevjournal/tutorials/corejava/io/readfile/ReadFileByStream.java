package com.javadevjournal.tutorials.corejava.io.readfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by umesh on 5/2/17.
 */
public class ReadFileByStream {

    public static void main(String[] args) {

       String fileName = "/tutorials/fileread/SampleFile.text"; //this path is on my local
        try {
            List<String> readStream=Files.lines(Paths.get(fileName)).collect(Collectors.toList());
            readStream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
