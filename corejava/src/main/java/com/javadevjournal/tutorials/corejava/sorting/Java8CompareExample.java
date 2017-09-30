package com.javadevjournal.tutorials.corejava.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

/**
 * Created by umesh on 4/30/17.
 */
public class Java8CompareExample {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Umesh Awasthi", 35));
        persons.add(new Person("Robert Hickle", 55));
        persons.add(new Person("John Smith", 40));
        persons.add(new Person("David", 23));
        persons.add(new Person("David", 63));

        persons.sort(Comparator.comparing(Person::getName).thenComparingInt(Person::getAge));

        for (Person person : persons) {
            System.out.println("Person Name is: " + person.getName());
        }

        persons.sort(Comparator.comparingInt(Person::getAge).thenComparing(Person::getName));

        for (Person person : persons) {
            System.out.println("Person Name is: " + person.getName());
        }
    }
}
