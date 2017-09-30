package com.umeshawasthi.java9.example.stackwalker;

public class StackWalkerGetClass {

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

        getCallerClass();
    }

    public static void getCallerClass() {

        Class calledClass = StackWalker.getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE)
                .getCallerClass();

        System.out.println("Caller Class is " +calledClass.getCanonicalName());
    }
}
