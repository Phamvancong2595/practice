package org.hashtable.consistentstring;

import org.junit.jupiter.api.Test;
import org.leetcode.hashtable.consistentstring.Main;

import static org.junit.jupiter.api.Assertions.*;

public class ConsistentString {
    Main m = new Main();
    @Test void test1(){
        assertEquals(m.countConsistentStrings("ab",new String[]{"ad","bd","aaab","baa","badab"}),2);
    }
    @Test void test2(){
        assertEquals(m.countConsistentStrings("abc",new String[]{"a","b","c","ab","ac","bc","abc"}),7);
    }
    @Test void test3(){
        assertEquals(m.countConsistentStrings("cad",new String[]{"cc","acd","b","ba","bac","bad","ac","d"}),4);
    }
    @Test void test4(){
        assertEquals(m.countConsistentStrings("fstqyienx", new String[]{"n","eeitfns","eqqqsfs","i","feniqis","lhoa","yqyitei","sqtn","kug","z","neqqis"}),8);
    }
}