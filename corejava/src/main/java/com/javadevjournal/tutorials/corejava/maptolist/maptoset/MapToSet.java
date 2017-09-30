package com.javadevjournal.tutorials.corejava.maptolist.maptoset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by umesh on 7/29/17.
 */
public class MapToSet {

    public static void main(String[] args) {

        Map<Integer,String> map= getMap();

        //Convert Map keys to List
        Set<Integer> keySet= new HashSet<Integer>(map.keySet());
        keySet.forEach(key-> System.out.println(key));

        //Convert Map values to List
        Set<String> valueSet= new HashSet<String>(map.values());
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
