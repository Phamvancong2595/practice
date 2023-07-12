package org.array.maxproduct;

import org.junit.jupiter.api.Test;
import org.leetcode.array.maxproduct.Main;

import static org.junit.jupiter.api.Assertions.*;

public class MaxProduct {
    Main m = new Main();
    @Test void test1(){
        assertEquals(m.maximumProduct(new int[]{1,2,3}),6);
    }
    @Test void test2(){
        assertEquals(m.maximumProduct(new int[]{1,2,3,4}),24);
    }
    @Test void test3(){
        assertEquals(m.maximumProduct(new int[]{-1,-2,-3}),-6);
    }
}