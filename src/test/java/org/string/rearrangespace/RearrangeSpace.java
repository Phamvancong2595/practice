package org.string.rearrangespace;

import org.junit.jupiter.api.Test;
import org.leetcode.string.rearrangespace.Main;

import static org.junit.jupiter.api.Assertions.*;

public class RearrangeSpace {
    Main m = new Main();
    @Test void Test1(){
        assertEquals(m.reorderSpaces("  this    is  a sentence"), "this   is   a   sentence");
    }
    @Test void Test2(){
        assertEquals(m.reorderSpaces(" practice   makes   perfect"), "practice   makes   perfect ");
    }
    @Test void Test3(){
        assertEquals(m.reorderSpaces(" practice   "), "practice    ");
    }
}