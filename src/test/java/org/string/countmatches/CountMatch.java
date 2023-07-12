package org.string.countmatches;

import org.junit.jupiter.api.Test;
import org.leetcode.string.countmatches.Main;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CountMatch {
    Main m = new Main();
    @Test void test1(){
        List<List<String>> l = List.of(
                List.of("phone","blue","pixel"),
                List.of("computer","silver","lenovo"),
                List.of("phone","gold","iphone"));
        assertEquals(m.countMatches(l,"color","silver"),1);
    }
    @Test void test2(){
        List<List<String>> l = List.of(
                List.of("phone","blue","pixel"),
                List.of("computer","silver","phone"),
                List.of("phone","gold","iphone"));
        assertEquals(m.countMatches(l,"type","phone"),2);
    }
}