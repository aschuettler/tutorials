package com.javadevjournal.tutorials.corejava.joinlist;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by umesh on 8/1/17.
 */
public class JoinListJava7 {

    public static void main(String[] args) {

        List<String> listA= asList("A", "B","C");
        List<String> listB=asList("C","D","E","F");

        List<String> listC = new ArrayList<String>();
        listC.addAll(listA);
        listC.addAll(listB);

        //print results

        for(String output: listC){
            System.out.println(output);
        }
    }
}
