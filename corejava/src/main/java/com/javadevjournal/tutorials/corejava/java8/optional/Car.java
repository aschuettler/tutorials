package com.javadevjournal.tutorials.corejava.java8.optional;

import jdk.nashorn.internal.runtime.options.Option;

/**
 * Created by umesh on 6/6/17.
 */
public class Car {

    private Option<GoogleMaps> map;

    public Option<GoogleMaps> getMap() {
        return map;
    }

    public void setMap(Option<GoogleMaps> map) {
        this.map = map;
    }
}
