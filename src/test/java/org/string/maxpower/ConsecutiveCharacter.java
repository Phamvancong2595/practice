package org.string.maxpower;

import org.junit.jupiter.api.Test;
import org.leetcode.string.maxpower.Main;

import static org.junit.jupiter.api.Assertions.*;

public class ConsecutiveCharacter {
        Main m = new Main();
        @Test public void test1(){
            assertEquals(m.maxPower("leetcode"),2);
        }
        @Test public void test2(){
            assertEquals(m.maxPower("abbcccddddeeeeedcba"),5);
        }
        @Test public void test3(){
            assertEquals(m.maxPower("cc"),2);
        }
        @Test public void test4(){
            assertEquals(m.maxPower("j"),1);
        }
        @Test public void test5(){
            assertEquals(m.maxPower("ca"),1);
        }
        @Test public void test6() {
            assertEquals(m.maxPower("aabbbbbccccdddddddeffffffggghhhhhiiiiijjjkkkkkllllmmmmmnnnnnoopppqrrrrsssttttuuuuvvvvwwwwwwwxxxxxyyyzzzzzzzz"),8);
        }
        @Test public void test7() {
            assertEquals(m.maxPower("abbcccdddd"),4);
        }
}