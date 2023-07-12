package org.array.nextgreatestletter;

import org.junit.jupiter.api.Test;
import org.leetcode.array.nextgreatestletter.Main;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    Main m = new Main();
    @Test public void test1() {
        assertEquals(m.nextGreatestLetter(new char[]{'c','f','j'},'a'),'c');
    }
    @Test public void test2() {
        assertEquals(m.nextGreatestLetter(new char[]{'c','f','j'},'c'),'f');
    }
    @Test public void test3() {
        assertEquals(m.nextGreatestLetter(new char[] {'x','x','y','y'},'z'),'x');
    }
}