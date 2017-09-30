package com.javadevjournal.tutorials.corejava.io.directory;

import org.apache.commons.io.FileUtils;

import java.io.IOException;

/**
 * Created by umesh on 5/15/17.
 */
public class CreateDirectoryByFileUtils {

    public static void main(String[] args) throws IOException {
        FileUtils.forceMkdir(new java.io.File("/Users/umesh/personal/tutorials/directory"));
    }
}
