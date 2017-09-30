package com.javadevjournal.tutorials.corejava.io.directory.move;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by umesh on 5/22/17.
 */
public class MoveDirectoryApache {

    public static void main(String[] args) throws IOException {

        File source =  FileUtils.getFile("/Users/umesh/personal/tutorials/source");
        File target =  FileUtils.getFile("/Users/umesh/personal/tutorials/target");

        FileUtils.moveDirectory(source, target);
    }
}
