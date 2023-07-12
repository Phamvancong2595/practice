package org.leetcode.math.arrangecoin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrangeCoin {
    Main m = new Main();
    @Test public void test1() {
        assertEquals(m.arrangeCoins(5),2);
    }
    @Test public void test2() {
        assertEquals(m.arrangeCoins(8),3);
    }
}