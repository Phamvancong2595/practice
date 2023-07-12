package org.leetcode.array.createtargetarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateTargetArray {
    Main m  = new Main();
    @Test public void test1() {
        Assertions.assertArrayEquals(m.createTargetArray(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1}), new int[]{0,4,1,3,2});
    }
    @Test public void test2() {
        Assertions.assertArrayEquals(m.createTargetArray(new int[]{1,2,3,4,0}, new int[]{0,1,2,3,0}), new int[]{0,1,2,3,4});
    }
    @Test public void test3() {
        Assertions.assertArrayEquals(m.createTargetArray(new int[]{1}, new int[]{0}), new int[]{1});
    }
}