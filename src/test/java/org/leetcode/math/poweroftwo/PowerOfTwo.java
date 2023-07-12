package org.leetcode.math.poweroftwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PowerOfTwo {
    Main m = new Main();
    @Test public void test1() {
        assertTrue(m.isPowerOfTwo(1));
    }
    @Test public void test2() {
        assertFalse(m.isPowerOfTwo(3));
    }
    @Test public void test3() {
        assertTrue(m.isPowerOfTwo(8));
    }
    @Test public void test4() {
        assertTrue(m.isPowerOfTwo(32));
    }
    @Test public void test5() {
        assertFalse(m.isPowerOfTwo(-1));
    }
    @Test public void test6() {
        assertFalse(m.isPowerOfTwo(6));
    }
}