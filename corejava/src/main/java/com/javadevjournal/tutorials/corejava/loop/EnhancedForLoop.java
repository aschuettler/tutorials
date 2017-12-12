package com.javadevjournal.tutorials.corejava.loop;

import java.util.Arrays;
import java.util.List;

public class EnhancedForLoop {

    public static void main(String[] args) {

        List<String> stringList= Arrays.asList("One", "Two","Three");

        //in old for loop
        for(int i =0 ; i<= stringList.size() ; i++){
            System.out.println("List Value is "+stringList.get(i));
        }

        //with enhanced for loop
        for(String value : stringList){
            System.out.println("List Value is "+value);
        }
    }
}
