package com.javadevjournal.tutorials.corejava.io.readfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by umesh on 5/2/17.
 */
public class ReadFileByScanner {

    public static void main(String[] args) throws FileNotFoundException {

        String fileName = "/tutorials/fileread/SampleFile.txt";
        File inputFile = new File(fileName);

        useScannerByLoop(inputFile);
        useScannerWithoutLoop(inputFile);

    }

    private static void useScannerByLoop(final File file) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(file);
        while(fileScanner.hasNextLine()){
            System.out.println(fileScanner.nextLine());
        }
        fileScanner.close();
    }

    private static void useScannerWithoutLoop(final File file) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(file);
        fileScanner.useDelimiter("\\Z");
        System.out.println(fileScanner.next());

    }
}
