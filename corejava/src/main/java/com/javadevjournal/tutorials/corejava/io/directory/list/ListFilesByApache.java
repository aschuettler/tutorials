package com.javadevjournal.tutorials.corejava.io.directory.list;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by umesh on 5/23/17.
 */
public class ListFilesByApache {

    public static void main(String[] args) throws IOException {

        File source = new File("/Users/umesh/personal/tutorials/source");
        List<File> files = (List<File>) FileUtils.listFiles(source, TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE);
        for (File file : files) {
            // work on the files
        }

        int i =00000;
        System.out.println(Integer.toHexString(99999));
    }
}
