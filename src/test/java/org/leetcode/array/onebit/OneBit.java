package org.leetcode.array.onebit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OneBit {
    Main m = new Main();
    @Test public void test1() {
        assertTrue(m.isOneBitCharacter(new int[]{1,0,0}));
    }
    @Test public void test2() {
        assertFalse(m.isOneBitCharacter(new int[]{1,1,1,0}));
    }
}