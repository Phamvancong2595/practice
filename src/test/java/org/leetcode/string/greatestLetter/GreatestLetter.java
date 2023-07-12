package org.leetcode.string.greatestLetter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GreatestLetter {
    Main m = new Main();
    @Test
    public void test1() {
        assertEquals(m.greatestLetter("lEeTcOdE"),"E");
    }
    @Test
    public void test2() {
        assertEquals(m.greatestLetter("arRAzFif"),"R");
    }
    @Test
    public void test3() {
        assertEquals(m.greatestLetter("AbCdEfGhIjK"),"");
    }
    @Test
    public void test4() {
        assertEquals(m.greatestLetter("nzmguNAEtJHkQaWDVSKxRCUivXpGLBcsjeobYPFwTZqrhlyOIfdM"),"Z");
    }
}