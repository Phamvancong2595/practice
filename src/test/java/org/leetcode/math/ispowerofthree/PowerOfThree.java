package org.leetcode.math.ispowerofthree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PowerOfThree {
    Main m = new Main();
    @Test public void test1() {
        assertTrue(m.isPowerOfThree(27));
    }
    @Test public void test2() {
        assertFalse(m.isPowerOfThree(-1));
    }
    @Test public void test3() {
        assertFalse(m.isPowerOfThree(0));
    }
    @Test public void test4() {
        assertTrue(m.isPowerOfThree(9));
    }
}