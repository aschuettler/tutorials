package com.javadevjournal.tutorials.corejava.io.trywithresources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by umesh on 5/4/17.
 */
public class MultipleResouces {

    public static void main(String[] args) {

        String fileName = "/tutorials/fileread/SampleFile.txt";
        String fileName1 = "/tutorials/fileread/SampleFile1.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
             Scanner scanner = new Scanner(new File(fileName1))) {
            String content;
            while ((content = bufferedReader.readLine()) != null) {
                //you logic here
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
