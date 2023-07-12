package org.string.firstpalidrome;

import org.junit.jupiter.api.Test;
import org.leetcode.string.firstpalidrome.Main;

import static org.junit.jupiter.api.Assertions.*;

public class FirstPalidrome {
    Main m = new Main();
    @Test
    public void test1() {
        assertEquals(m.firstPalindrome(new String[] {"abc","car","ada","racecar","cool"}), "ada");
    }
    @Test
    public void test2() {
        assertEquals(m.firstPalindrome(new String[] {"notapalindrome","racecar"}), "racecar");
    }
    @Test
    public void test3() {
        assertEquals(m.firstPalindrome(new String[] {"def","ghi"}), "");
    }
}