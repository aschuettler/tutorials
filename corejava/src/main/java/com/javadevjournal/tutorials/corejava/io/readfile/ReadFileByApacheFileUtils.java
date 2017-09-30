package com.javadevjournal.tutorials.corejava.io.readfile;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * Created by umesh on 5/3/17.
 */
public class ReadFileByApacheFileUtils {

    public static void main(String[] args) throws IOException {

        String fileName = "/tutorials/fileread/SampleFile.txt";
        List<String> fileContent= FileUtils.readLines(new File(fileName), StandardCharsets.UTF_8);

        for(String line : fileContent){
            System.out.println(line);
        }
    }
}
