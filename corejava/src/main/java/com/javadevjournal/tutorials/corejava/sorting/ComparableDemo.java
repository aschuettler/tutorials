package com.javadevjournal.tutorials.corejava.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by umesh on 4/30/17.
 */
public class ComparableDemo {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Umesh Awasthi", 35));
        persons.add(new Person("Robert Hickle", 55));
        persons.add(new Person("John Smith", 40));
        persons.add(new Person("David", 23));

        Collections.sort(persons);

        for (Person person : persons) {
            System.out.println("Person is: " + person.getName());
        }

    }
}
