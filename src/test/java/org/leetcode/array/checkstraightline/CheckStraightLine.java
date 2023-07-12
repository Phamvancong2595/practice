package org.leetcode.array.checkstraightline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckStraightLine {
    Main m = new Main();
    @Test public void test1() {
        assertTrue(m.checkStraightLine(new int[][]{{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}}));
    }
    @Test public void test2() {
        assertFalse(m.checkStraightLine(new int[][]{{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}}));
    }
    @Test public void test3() {
        assertTrue(m.checkStraightLine(new int[][]{{2,4},{2,5},{2,8}}));
    }
}