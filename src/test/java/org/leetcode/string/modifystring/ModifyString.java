package org.leetcode.string.modifystring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ModifyString {
    Main m = new Main();
    @Test public void test1() {
        assertEquals(m.modifyString("?zs"),"azs");
    }
    @Test public void test2() {
        assertEquals(m.modifyString("ubv?w"), "ubvaw");
    }
}