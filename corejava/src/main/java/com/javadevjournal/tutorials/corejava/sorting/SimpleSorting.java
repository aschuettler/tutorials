package com.javadevjournal.tutorials.corejava.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by umesh on 4/30/17.
 */
public class SimpleSorting {

    public static void main(String[] args) {

        List<String> locationList = new ArrayList<String>();
        locationList.add("California");
        locationList.add("Texas");
        locationList.add("Seattle");
        locationList.add("New Delhi");

        Collections.sort(locationList);

        for (String location : locationList) {
            System.out.println("Location is: " + location);
        }
    }
}
