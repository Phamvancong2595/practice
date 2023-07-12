package org.leetcode.string.similarpairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimilarPairs {
    Main m = new Main();
    @Test public void test1() {
        assertEquals(m.similarPairs(new String[]{"aba","aabb","abcd","bac","aabc"}),2);
    }
    @Test public void test2() {
        assertEquals(m.similarPairs(new String[]{"aabb","ab","ba"}),3);
    }
    @Test public void test3() {
        assertEquals(m.similarPairs(new String[]{"nba","cba","dba"}),0);
    }
}