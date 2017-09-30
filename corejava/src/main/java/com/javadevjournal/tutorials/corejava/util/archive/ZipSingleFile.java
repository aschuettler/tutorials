package com.javadevjournal.tutorials.corejava.util.archive;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by umesh on 5/24/17.
 */
public class ZipSingleFile {

    public static void main(String[] args) throws IOException {

        String sourceFile = "/Users/umesh/personal/tutorials/source/index.html";
        String zipName="/Users/umesh/personal/tutorials/source/testzip.zip";

        File targetFile = new File(sourceFile);

        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(zipName));
        zipOutputStream.putNextEntry(new ZipEntry(targetFile.getName()));
        FileInputStream inputStream = new FileInputStream(targetFile);

        final byte[] buffer = new byte[1024];
        int length;
        while((length = inputStream.read(buffer)) >= 0) {
            zipOutputStream.write(buffer, 0, length);
        }
        zipOutputStream.close();
        inputStream.close();
    }

}
