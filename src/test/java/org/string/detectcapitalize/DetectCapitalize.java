package org.string.detectcapitalize;

import org.junit.jupiter.api.Test;
import org.leetcode.string.detectcapitalize.Main;

import static org.junit.jupiter.api.Assertions.*;

public class DetectCapitalize {
        Main m = new Main();
        @Test public void test1(){
            assertTrue(m.detectCapitalUse("USA"));
        }
        @Test public void test2(){
            assertFalse(m.detectCapitalUse("FlaG"));
        }
        @Test public void test3(){
            assertTrue(m.detectCapitalUse("leetcode"));
        }
        @Test public void test4(){
            assertTrue(m.detectCapitalUse("Google"));
        }
        @Test public void test5(){
            assertTrue(m.detectCapitalUse("Phamvancong"));
        }
}