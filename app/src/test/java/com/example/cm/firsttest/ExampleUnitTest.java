package com.example.cm.firsttest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }


    private long getRandomDelayInOneHour() {
        long base = 60 * 60 * 1000;
        return (long) (Math.random() * base);
    }

    @Test
    public void getTimeDelay() {
        long time = getRandomDelayInOneHour();
        System.out.println("time : " + time);
    }


    final byte my = 2;

    @Test
    public void byteTest() {
        String str = "zhouwenbo" + my;
        System.out.print(str);

        System.out.print("INTERVAL_CHECK_LOCAL =" + INTERVAL_CHECK_LOCAL);
    }


    public static final long INTERVAL_CHECK_LOCAL = (long)(0.9 * 60 * 60 * 1000);


    @Test
    public void timeTest() {
        long time = System.currentTimeMillis();
        int timeS = (int)(time/ 1000);
        System.out.println(timeS);
        System.out.print(time);
    }


}