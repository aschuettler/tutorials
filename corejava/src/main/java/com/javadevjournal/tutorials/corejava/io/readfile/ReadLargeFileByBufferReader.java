package com.javadevjournal.tutorials.corejava.io.readfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by umesh on 5/3/17.
 */
public class ReadLargeFileByBufferReader {

    public static void main(String[] args) throws IOException {

        String fileName = "/Users/umesh/personal/tutorials/fileread/file.txt"; //this path is on my local
        try (BufferedReader fileBufferReader = new BufferedReader(new FileReader(fileName))) {
            String fileLineContent;
            while ((fileLineContent = fileBufferReader.readLine()) != null) {
                // process the line.
            }
        }
    }
}
