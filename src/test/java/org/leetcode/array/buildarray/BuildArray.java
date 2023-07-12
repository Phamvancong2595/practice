package org.leetcode.array.buildarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BuildArray {
    Main m = new Main();
    @Test public void test1() {
        Assertions.assertArrayEquals(m.buildArray(new int[] {0,2,1,5,3,4}), new int[] {0,1,2,4,5,3});
    }
    @Test public void test2() {
        Assertions.assertArrayEquals(m.buildArray(new int[] {5,0,1,2,3,4}), new int[] {4,5,0,1,2,3});
    }
}