package com.ashisha.mathing;

import com.ashisha.MyMath;
import junit.framework.TestCase;
import org.junit.jupiter.api.AfterAll;
import org.testng.annotations.Test;

public class MyMathTest extends TestCase {
    private MyMath math = new MyMath();
    int x = 0;


    @AfterAll
    public static void afterAll() {
        System.out.println("yay");
    }

    @Test
    public void test() {
        assertEquals(math.sum(new int[]{1, 2, 3}), 6);
    }

    @Test
    public void testEmpty() {
        assertEquals(math.sum(new int[]{}), 0);
    }


    @Test
    public void testing1() {
        System.out.println("1");
    }

    @Test
    public void testing2() {
        System.out.println("2");
    }

    @Test
    public void testing3() {
        System.out.println("3");
    }

}