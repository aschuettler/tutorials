package com.javadevjournal.tutorials.corejava.io.trywithresources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by umesh on 5/4/17.
 */
public class FIleIOPreJDK7 {

    public static void main(String[] args) throws FileNotFoundException {

        String fileName = "/tutorials/fileread/SampleFile.txt";
        String fileContent;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName)); //it's throwing
        try {

            while ((fileContent = bufferedReader.readLine()) != null) {
                //business logic for file processing
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();   // we need to close it to avoid memory leak.
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }

    }
}
