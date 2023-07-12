package org.leetcode.string.sortstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SortString {
    Main m = new Main();
    @Test public void test1() {
        assertEquals(m.sortString("aaaabbbbcccc"), "abccbaabccba");
    }
    @Test public void test2() {
        assertEquals(m.sortString("rat"), "art");
    }
}