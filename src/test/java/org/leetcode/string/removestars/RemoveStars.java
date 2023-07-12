package org.leetcode.string.removestars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveStars {
    Main m = new Main();
    @Test public void test1() {
        assertEquals(m.removeStars("leet**cod*e"),"lecoe");
    }
    @Test public void test2() {
        assertEquals(m.removeStars("erase*****"),"");
    }
}