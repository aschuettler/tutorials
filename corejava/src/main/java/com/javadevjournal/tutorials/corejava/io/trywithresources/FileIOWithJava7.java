package com.javadevjournal.tutorials.corejava.io.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by umesh on 5/4/17.
 */
public class FileIOWithJava7 {

    public static void main(String[] args) {

        String fileName = "/tutorials/fileread/SampleFile.txt";

        try( BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            String content;
            while((content = bufferedReader.readLine() )!=null){
                //you logic here
            }
        }
        catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
