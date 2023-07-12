package org.leetcode.array.canbeincrease;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CanBeIncrease {
    Main m = new Main();
    @Test public void test1() {
        assertTrue(m.canBeIncreasing(new int[] {1,2,10,5,7}));
    }
    @Test public void test2() {
        assertFalse(m.canBeIncreasing(new int[] {2,3,1,2}));
    }
    @Test public void test3() {
        assertFalse(m.canBeIncreasing(new int[] {1,1,1}));
    }
}