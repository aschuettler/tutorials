package com.javadevjournal.tutorials.corejava.misc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by umesh on 7/11/17.
 */
public class MapIteration {

    public static void main(String[] args) {

        Map<String, String> map= new HashMap<String,String>();

        map.put("one", "one");
        map.put("two", "two");
        map.put("three", "three");
        map.put("four", "four");
        map.put("five", "five");
        map.put("six", "six");

        iterateForEach(map);
        iterator(map);
        lambdas(map);
        stream(map);
    }

    public static void iterateForEach(Map<String, String> map){
        for(Map.Entry<String,String> mapValue : map.entrySet()){
            System.out.println(mapValue.getKey()+" :" + mapValue.getValue());
        }
    }

    public static void iterator(Map<String, String> map){
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey()+" :" + entry.getValue());
        }
    }

    public static void lambdas(Map<String, String> map){
        map.forEach((key,value) ->System.out.println(key + ":"+ value));
    }

    public static void stream(Map<String, String> map){
        map.entrySet().stream().forEach(entry-> System.out.println(entry.getKey() +": "+entry.getValue()));
    }
}
