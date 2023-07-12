package org.string.thousandseparator;

import org.junit.jupiter.api.Test;
import org.leetcode.string.thousandseparator.Main;

import static org.junit.jupiter.api.Assertions.*;

public class ThousandSeparator {
        Main m = new Main();
        @Test public void test1(){
            assertEquals(m.thousandSeparator(987),"987");
        }
        @Test public void test2(){
            assertEquals(m.thousandSeparator(1234),"1.234");
        }
        @Test public void test3(){
            assertEquals(m.thousandSeparator(123123),"123.123");
        }
}