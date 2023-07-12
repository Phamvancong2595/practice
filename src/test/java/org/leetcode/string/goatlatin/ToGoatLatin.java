package org.leetcode.string.goatlatin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ToGoatLatin {
    Main m = new Main();
    @Test public void test1() {
        assertEquals(m.toGoatLatin("I speak Goat Latin"),"Imaa peaksmaaa oatGmaaaa atinLmaaaaa");
    }
    @Test public void test2() {
        assertEquals(m.toGoatLatin("The quick brown fox jumped over the lazy dog"),"heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa");
    }
    @Test public void test3() {
        assertEquals(m.toGoatLatin("pham van cong"),"hampmaa anvmaaa ongcmaaaa");
    }
}