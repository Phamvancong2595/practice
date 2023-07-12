package org.leetcode.string.issumequal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IsSumEquals {
    Main m = new Main();
    @Test
    public void test1() {
        assertTrue(m.isSumEqual("acb","cba","cdb"));
    }
    @Test
    public void test2() {
        assertFalse(m.isSumEqual("aaa","a","aab"));
    }
    @Test
    public void test3() {
        assertTrue(m.isSumEqual("aaa","a","aaaa"));
    }
    @Test
    public void test4() {
        assertTrue(m.isSumEqual("d","b","aaaaae"));
    }
}