package org.string.tolowercase;

import org.junit.jupiter.api.Test;
import org.leetcode.string.tolowercase.Main;

import static org.junit.jupiter.api.Assertions.*;

public class ToLowerCase {
    Main m = new Main();
    @Test void Test1(){
        assertEquals(m.toLowerCase("Hello"), "hello");
    }
    @Test void Test2(){
        assertEquals(m.toLowerCase("here"), "here");
    }
    @Test void Test3(){
        assertEquals(m.toLowerCase("LOVELY"), "lovely");
    }
}