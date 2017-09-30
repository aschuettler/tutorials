package com.javadevjournal.tutorials.corejava.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by umesh on 4/30/17.
 */
public class MultiComparatorDemo {
    public static void main(String[] args) {
        List<ComparatorPerson> persons = new ArrayList<ComparatorPerson>();

        persons.add(new ComparatorPerson("Umesh Awasthi", 35));
        persons.add(new ComparatorPerson("Robert Hickle", 55));
        persons.add(new ComparatorPerson("John Smith", 40));
        persons.add(new ComparatorPerson("David", 23));
        persons.add(new ComparatorPerson("David", 63));

        Collections.sort(persons,ComparatorPerson.COMPARE_BY_AGE );

        for (ComparatorPerson person : persons) {
            System.out.println("Person Name Sorted by Age is: " + person.getName());
        }

        System.out.println("######################################################");
        Collections.sort(persons,ComparatorPerson.COMPARE_BY_NAME );

        for (ComparatorPerson person : persons) {
            System.out.println("Person Name Sorted by Name  is: " + person.getName());
        }
    }
}
