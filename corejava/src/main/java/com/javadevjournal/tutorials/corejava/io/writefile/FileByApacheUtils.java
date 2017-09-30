package com.javadevjournal.tutorials.corejava.io.writefile;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Created by umesh on 5/11/17.
 */
public class FileByApacheUtils {

    public static void main(String[] args) throws IOException {

        String fileContent = "We will demo as how to write using Java Apache Commons IO Utils";
        FileUtils.write(new File("/Users/umesh/personal/tutorials/filewrite/apacheIO.txt"),fileContent, StandardCharsets.UTF_8);
     }
}
