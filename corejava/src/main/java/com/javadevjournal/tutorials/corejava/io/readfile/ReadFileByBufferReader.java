package com.javadevjournal.tutorials.corejava.io.readfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by umesh on 5/2/17.
 */
public class ReadFileByBufferReader {

    public static void main(String[] args){

        String fileName = "/fileread/SampleFile.text";

        try(BufferedReader bufferReader = new BufferedReader(new FileReader(fileName))) {
            StringBuilder fileContent = new StringBuilder();
            String line = bufferReader.readLine();

            while (line != null) {
                fileContent.append(line);
                fileContent.append(System.lineSeparator());
                line = bufferReader.readLine();
            }

            String fileInformation = fileContent.toString();
            System.out.println(fileInformation);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
