package com.javadevjournal.tutorials.corejava.io.directory.delete;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by umesh on 5/17/17.
 */
public class DeleteDirectoryByApache {

    public static void main(String[] args) throws IOException {

        FileUtils.deleteDirectory(new File("/Users/umesh/personal/tutorials/apachecommons123"));
    }
}
