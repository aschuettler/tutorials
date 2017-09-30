package com.javadevjournal.tutorials.corejava.io.readfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Created by umesh on 5/4/17.
 */
public class ReadLargeFileByScanner {

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "/Users/umesh/personal/tutorials/fileread/file.txt"; //this path is on my local
        InputStream inputStream = new FileInputStream(fileName);

        try(Scanner fileScanner = new Scanner(inputStream, StandardCharsets.UTF_8.name())){
            while (fileScanner.hasNextLine()){
                System.out.println(fileScanner.nextLine());
            }
        }
    }
}
