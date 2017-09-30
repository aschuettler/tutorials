package com.javadevjournal.tutorials.corejava.io.readfile;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Created by umesh on 5/3/17.
 */
public class ReadFileByApacheIO {

    public static void main(String[] args) throws IOException {

        String fileName = "/tutorials/fileread/SampleFile.txt";
        try(FileInputStream inputStream = new FileInputStream(fileName)){

            String fileContent = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
            System.out.println(fileContent);
        }
    }
}
