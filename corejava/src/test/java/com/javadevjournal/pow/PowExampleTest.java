package com.javadevjournal.pow;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class PowExampleTest {

    @Test
    public void calculateIntPow(){
        int a= 3;
        int b=4;

        int result = (int) Math.pow(a,b);

        assertEquals(81, result);
    }

    @Test
    public void calculateDoublePow(){
        double a= 3.4;
        int b=4;

        double result =  Math.pow(a,b);

        assertEquals(133.63, result, 2);
    }

     @Test
     public void testDate(){

        Date myDate = new Date("2017-01-01");
        System.out.println(myDate);
        System.out.println(new SimpleDateFormat("MM-dd-yyyy").format(myDate));

    }
}
