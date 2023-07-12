package org.array.xofakind;

import org.junit.jupiter.api.Test;
import org.leetcode.array.xofakind.HasGroupSizeX;

import static org.junit.jupiter.api.Assertions.*;

public class HasGroupSizeXTest {
    HasGroupSizeX m = new HasGroupSizeX();
    @Test public void test1(){
        assertTrue(m.hasGroupsSizeX(new int[]{1,2,3,4,4,3,2,1}));
    }
    @Test public void test2(){
        assertFalse(m.hasGroupsSizeX(new int[]{1,1,1,2,2,2,3,3}));
    }
    @Test public void test3(){
        assertTrue(m.hasGroupsSizeX(new int[]{1,1,2,2,2,2}));
    }
    @Test public void test4(){
        assertTrue(m.hasGroupsSizeX(new int[]{1,1,1,1,2,2,2,2,2,2}));
    }
}