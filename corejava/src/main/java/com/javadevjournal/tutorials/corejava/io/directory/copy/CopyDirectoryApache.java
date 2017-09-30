package com.javadevjournal.tutorials.corejava.io.directory.copy;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by umesh on 5/21/17.
 */
public class CopyDirectoryApache {

    public static void main(String[] args) throws IOException {

        File sourceLocation = new File("/Users/umesh/personal/tutorials/source");
        File targetLocation = new File("/Users/umesh/personal/tutorials/target");

        FileUtils.copyDirectory(sourceLocation, targetLocation);
    }
}
