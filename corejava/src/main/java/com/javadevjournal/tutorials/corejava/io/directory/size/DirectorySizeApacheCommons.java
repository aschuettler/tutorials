package com.javadevjournal.tutorials.corejava.io.directory.size;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.text.DecimalFormat;

/**
 * Created by umesh on 6/5/17.
 */
public class DirectorySizeApacheCommons {

    public static void main(String[] args) {

        File rootDirectory = new File("/Users/umesh/personal/tutorials/source/bootstrap");
        long size= FileUtils.sizeOfDirectory(rootDirectory);
        readableFileSize(size);
    }

    public static void readableFileSize(long size){
        final String[] units = new String[] { "B", "kB", "MB", "GB", "TB" };
        int unitGroups = (int) (Math.log10(size)/Math.log10(1024));
        System.out.println(new DecimalFormat("#,##0.#").format(size/Math.pow(1024, unitGroups)) + " " + units[unitGroups]);
    }

}
