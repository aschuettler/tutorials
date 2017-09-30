package com.javadevjournal.tutorials.corejava.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class StringJoin {

    public static void main(String[] args) {

        joinExample();
        joinList();

       String s= "TRUCK_FREIGHT;[Z48260, TB25012]|UPS_NEXT_DAY_AIR_EARLY;[TB25011]";
       String [] firstSplit= s.split(Pattern.quote("|"));

        //System.out.println(firstSplit.length);

            for(int i =0; i<firstSplit.length;i++){
                String [] splitData= firstSplit[i].split(Pattern.quote(";"));


                    String finalData= splitData[1].replace("[", "").replace("]", "");
                System.out.println(finalData);
                    List<String> myList = new ArrayList<String>(Arrays.asList(finalData.split(",")));
                   // System.out.println(myList);

            }


    }

    public static void joinExample(){
        String output= String.join("-", "2017","09","30");
        System.out.println(output);
    }

    public static void joinList(){

        List<String> list= Arrays.asList("one","two","three");
        String output = String.join("-", list);

        System.out.println(output);
    }
}
