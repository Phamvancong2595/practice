package org.hashtable.morsecode;

import org.junit.jupiter.api.Test;
import org.leetcode.hashtable.morsecode.Main;

import static org.junit.jupiter.api.Assertions.*;

public class MorseCode {
    Main m = new Main();
    @Test
    void test1(){
        assertEquals(m.uniqueMorseRepresentations(new String[]{"gin","zen","gig","msg"}), 2);
    }
    @Test
    void test2(){
        assertEquals(m.uniqueMorseRepresentations(new String[]{"a"}),1);
    }
}