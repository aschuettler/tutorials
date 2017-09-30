package com.javadevjournal.tutorials.corejava.maptolist.maptoset;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by umesh on 7/29/17.
 */
public class MapToSetJava8 {
    public static void main(String[] args) {

        Map<Integer,String> map= getMap();

        Set<Integer> keySet=map.keySet().stream().collect(Collectors.toSet());
        keySet.forEach(key-> System.out.println(key));

        Set<String> valueSet=map.values().stream().collect(Collectors.toSet());
        valueSet.forEach(value-> System.out.println(value));
    }

    static Map<Integer,String> getMap(){

        Map<Integer, String> sampleMap=new HashMap<Integer,String>();
        sampleMap.put(1,"Sunday");
        sampleMap.put(2,"Monday");
        sampleMap.put(3,"Tuesday");
        sampleMap.put(4,"Wednesday");

        return sampleMap;
    }
}
