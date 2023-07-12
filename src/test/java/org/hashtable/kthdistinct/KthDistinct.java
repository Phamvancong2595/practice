package org.hashtable.kthdistinct;

import org.junit.jupiter.api.Test;
import org.leetcode.hashtable.kthdistinct.Main;

import static org.junit.jupiter.api.Assertions.*;

public class KthDistinct {
    Main m = new Main();
    @Test
    void test1(){
        assertEquals(m.kthDistinct(new String[]{"d","b","c","b","c","a"},2),"a");
    }
    @Test void test2(){
        assertEquals(m.kthDistinct(new String[]{"aaa","aa","a"},1),"aaa");
    }
    @Test void test3(){
        assertEquals(m.kthDistinct(new String[]{"a","b","a"},3),"");
    }
}