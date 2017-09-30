package com.javadevjournal.tutorials.corejava.maptolist;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by umesh on 7/29/17.
 */
public class MapToListJava8 {

    public static void main(String[] args) {

        Map<Integer,String> map= getMap();

        List<Integer> keyList=map.keySet().stream().collect(Collectors.toList());
        keyList.forEach(key-> System.out.println(key));

        List<String> valueList=map.values().stream().collect(Collectors.toList());
        valueList.forEach(value-> System.out.println(value));
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
