package com.javadevjournal.tutorials.corejava.misc;

import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Created by umesh on 7/13/17.
 */
public class SplitString {

    public static void main(String[] args) {
        //split();
        //splitWithLimit();
        //splitStringJava8();
        apacheStringUtils();
    }

    public static void split(){
        String input = "This-is-a-sample-input";
        String[] parts= input.split("-");
        for(int i =0; i< parts.length;i++){
            System.out.println(parts[i]);
        }
    }

    public static void splitWithLimit(){
        String input = "This-is-a-sample-input";
        String[] parts= input.split("-", 2);
        for(int i =0; i< parts.length;i++){
            System.out.println(parts[i]);
        }
    }

    public static void splitStringJava8(){
        String input = "This-is-a-sample-input";

        List<String> parts = Pattern.compile("-")
                             .splitAsStream(input)
                             .collect(Collectors.toList());
        parts.forEach(s-> System.out.println(s));
    }

    public static void apacheStringUtils(){
        String input = "This-is-a-sample-input";
        String[] parts =StringUtils.split(input ,"-");
        for(int i =0; i< parts.length;i++){
            System.out.println(parts[i]);
        }
    }
}
