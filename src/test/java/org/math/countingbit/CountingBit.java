package org.math.countingbit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.math.countingbit.Main;

public class CountingBit {
    Main m = new Main();
    @Test
    void test1(){
        Assertions.assertArrayEquals(m.countBits(2), new int[]{0,1,1});
    }
    @Test
    void test2(){
        Assertions.assertArrayEquals(m.countBits(5), new int[]{0,1,1,2,1,2});
    }
}