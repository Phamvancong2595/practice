package org.string.makegood;

import org.junit.jupiter.api.Test;
import org.leetcode.string.makegood.Main;

import static org.junit.jupiter.api.Assertions.*;

public class MakeGood {
    Main m = new Main();
    @Test
    void test1(){
        assertEquals(m.makeGood("leEeetcode"),"leetcode");
    }
    @Test
    void test2(){
        assertEquals(m.makeGood("abBAcC"),"");
    }
    @Test
    void test3(){
        assertEquals(m.makeGood("s"),"s");
    }
    @Test
    void test4(){
        assertEquals(m.makeGood("sABC"),"BC");
    }
}