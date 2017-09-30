package com.javadevjournal.tutorials.corejava.io.readfile;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Created by umesh on 5/3/17.
 */
public class ReadLargeFileUsingApacheCommonIO {

    public static void main(String[] args) throws IOException {
        String fileName = "/Users/umesh/personal/tutorials/fileread/file.txt"; //this path is on my local

        LineIterator fileContents= FileUtils.lineIterator(new File(fileName), StandardCharsets.UTF_8.name());
        while(fileContents.hasNext()){
            System.out.println(fileContents.nextLine());
        }
    }
}
