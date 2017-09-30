package com.javadevjournal.tutorials.corejava.joinlist;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by umesh on 8/1/17.
 */
public class JoinListApacheCommons {

    public static void main(String[] args) {

        List<String> listA= asList("A", "B","C");
        List<String> listB=asList("C","D","E","F");

        Iterable<String> newList= CollectionUtils.union(listA,listB);
    }
}
