package com.umeshawasthi.java9.example.stackwalker;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by umesh on 6/26/17.
 */
public class StackWalkerFullStackExample {

    public static void main(String[] args) {

        stackWalkerMethod1();
    }

    public static void stackWalkerMethod1() {

        stackWalkerMethod2();
    }

    public static void stackWalkerMethod2() {

        stackWalkerMethod3();
    }

    public static void stackWalkerMethod3() {

        stackWalkerMethod4();
    }

    public static void stackWalkerMethod4() {

        printCompleteStackTrace();
    }

    public static void printCompleteStackTrace() {

        List<StackWalker.StackFrame> stack = StackWalker.getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE)
                .walk((s) -> s.collect(Collectors.toList()));

         stack.forEach(System.out::println);
    }

}
