package com.javadevjournal.tutorials.corejava.io.writefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by umesh on 5/10/17.
 */
public class WriteFile {

    public static void main(String[] args) throws IOException {

        String fileContent = "We will demo as how to write using Java 7 File API";

        Path path = Paths.get("/filewrite/testFile.txt");
        byte[] fileByteContent = fileContent.getBytes();  //getBytes will use default charset

        Files.write(Paths.get("/filewrite/testFile.txt"), fileByteContent);

        //to validate our data
        String readFile = Files.readAllLines(path).get(0); //we will just read first line
        System.out.println(readFile.equals(fileContent));
    }
}
