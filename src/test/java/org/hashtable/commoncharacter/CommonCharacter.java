package org.hashtable.commoncharacter;

import org.junit.jupiter.api.Test;
import org.leetcode.hashtable.commoncharacter.Main;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CommonCharacter {
    Main m = new Main();
    @Test
    void test1(){
        List<String> l1 = m.commonChars(new String[]{"bella","label","roller"});
        List<String> l2 = List.of("e","l","l");
        assertEquals(l1.size(), l2.size());
        assertTrue(l1.containsAll(l2));
        assertTrue(l2.containsAll(l1));

    }
    @Test
    void test2(){
        List<String> l1 = m.commonChars(new String[]{"cool","lock","cook"});
        List<String> l2 = List.of("c","o");
        assertEquals(l1.size(), l2.size());
        assertTrue(l1.containsAll(l2));
        assertTrue(l2.containsAll(l1));    }
}