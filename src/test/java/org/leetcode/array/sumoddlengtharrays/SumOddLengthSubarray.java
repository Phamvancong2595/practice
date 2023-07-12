package org.leetcode.array.sumoddlengtharrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SumOddLengthSubarray {
    Main m = new Main();
    @Test
    public void test1() {
        assertEquals(m.sumOddLengthSubarrays(new int[]{1,4,2,5,3}),58);
    }
    @Test
    public void test2() {
        assertEquals(m.sumOddLengthSubarrays(new int[]{1,2}),3);
    }
    @Test
    public void test3() {
        assertEquals(m.sumOddLengthSubarrays(new int[]{10,11,12}),66);
    }
}