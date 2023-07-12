package org.leetcode.string.countasterisks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CountAsterisk {
    Main m = new Main();
    @Test public void test1() {
        assertEquals(m.countAsterisks("l|*e*et|c**o|*de|"),2);
    }
    @Test public void test2() {
        assertEquals(m.countAsterisks("iamprogrammer"),0);
    }
    @Test public void test3() {
        assertEquals(m.countAsterisks("yo|uar|e**|b|e***au|tifu|l"),5);
    }
}