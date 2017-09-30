package com.umeshawasthi.java9.example.processapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ProcessAPIExample {

    public static void main(String[] args) {

        getProcessIdByJava8();
        getProcessIdByJava9();
    }


    public static void getProcessIdByJava8(){

        try {
            String[] args = new String[] { "/bin/sh", "-c", "echo $PPID" };
            Process p = Runtime.getRuntime().exec(args);
            InputStream p_out = p.getInputStream();
            String s = (new BufferedReader(new InputStreamReader(p_out))).readLine();
            p.destroy();
            if (s != null)
                System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void getProcessIdByJava9(){
        System.out.println("Your Process id is :" + ProcessHandle.current().pid());
    }
}
