package org.string.interpret;

import org.junit.jupiter.api.Test;
import org.leetcode.string.interpret.Main;

import static org.junit.jupiter.api.Assertions.*;

public class Interpret {
    Main m = new Main();
    @Test
    void test1(){
        assertEquals(m.interpret("G()(al)"),"Goal");
    }
    @Test
    void test2(){
        assertEquals(m.interpret("G()()()()(al)"),"Gooooal");
    }
    @Test
    void test3(){
        assertEquals(m.interpret("(al)G(al)()()G"),"alGalooG");
    }
}