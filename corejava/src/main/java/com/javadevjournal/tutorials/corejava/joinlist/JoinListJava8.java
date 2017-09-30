package com.javadevjournal.tutorials.corejava.joinlist;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

/**
 * Created by umesh on 8/1/17.
 */
public class JoinListJava8 {

    public static void main(String[] args) {

        List<String> listA= asList("A", "B","C");
        List<String> listB=asList("C","D","E","F");

        flatMap(listA,listB);
    }


    public static void concactStream(List<String> listA, List<String> listB){

        List<String> newList= Stream.concat(listA.stream(),listB.stream()).collect(Collectors.toList());
        newList.forEach(item-> System.out.println(item));
    }


    public static void flatMap(List<String> listA, List<String> listB){

        List<String> newList= Stream.of(listA,listB).flatMap(Collection::stream).collect(Collectors.toList());
        newList.forEach(item-> System.out.println(item));
    }

}
