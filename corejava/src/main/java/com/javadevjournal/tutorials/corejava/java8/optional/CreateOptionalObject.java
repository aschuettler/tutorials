package com.javadevjournal.tutorials.corejava.java8.optional;

import java.util.Optional;

/**
 * Created by umesh on 6/7/17.
 */
public class CreateOptionalObject {

    public static void main(String[] args) {


        Optional<GoogleMaps> emptyOptional = Optional.empty();
        nonNullObject();
        nullableObject();
        checkIfPresent();
        useGetWithCheck();
        //useGet();

        optionalOrElse();
    }

    public static void nonNullObject() {

        GoogleMaps googleMaps = new GoogleMaps();
        Optional<GoogleMaps> optionalMap = Optional.of(googleMaps);

    }

    public static void nullableObject() {

        Optional<GoogleMaps> nullGoogleMap = Optional.ofNullable(null);
        System.out.println(nullGoogleMap.toString());
    }

    public static void checkIfPresent(){

        Optional<String> optional = Optional.of("umesh");
        optional.ifPresent(System.out::println);

        Optional<String> nullValue= Optional.ofNullable(null);
        nullValue.ifPresent(System.out::println);
    }

    public static void useGet(){
        Optional<String> nullValue= Optional.ofNullable(null);
        System.out.println(nullValue.get());
    }

    public static void useGetWithCheck(){
        Optional<String> nullValue= Optional.ofNullable(null);
        if(nullValue.isPresent()) {
            System.out.println(nullValue.get());
        }
    }

    public static void optionalOrElse(){

        String name=null;
        String value= Optional.ofNullable(name).orElse("Hello");
        System.out.println(value);
     }




}
