package com.umeshawasthi.java9.example.stackwalker;

import java.util.List;
import java.util.stream.Collectors;

public class StackWalkerFilterExample {

    public static void main(String[] args) {
        new StackWalkerFilterExample().startWalk();
    }

    public void startWalk(){
        new StackWalkerDemo1().stackWalkerMethod1();
    }

    private class StackWalkerDemo1 {

        public void stackWalkerMethod1() {

            new StackWalkerDemo2().stackWalkerMethod2();
        }
    }

    private class StackWalkerDemo2 {
        public void stackWalkerMethod2() {

            new StackWalkerDemo3().stackWalkerMethod3();
        }
    }


    private class StackWalkerDemo3 {
        public void stackWalkerMethod3() {

            new StackWalkerDemo4().stackWalkerMethod4();
        }
    }


    private class StackWalkerDemo4 {
        public void stackWalkerMethod4() {

            filterStackFrame();
        }
    }

    public void filterStackFrame() {
        List<StackWalker.StackFrame> filterFrames = StackWalker.getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE)
                .walk((s) -> s.filter(f -> f.getClassName().contains(StackWalkerDemo3.class.getName()))
                        .collect(Collectors.toList()));

        filterFrames.forEach(System.out::println);
    }
}
