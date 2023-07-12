package org.hashtable.intersection;

import org.junit.jupiter.api.Test;
import org.leetcode.hashtable.intersection.Main;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Intersection {
    Main m = new Main();
    @Test
    void test1(){
        List<Integer> l1 = m.intersection(new int[][]{{3,1,2,4,5},{1,2,3,4},{3,4,5,6}});
        List<Integer> l2 = List.of(3,4);
        assertEquals(l1.size(), l2.size());
        assertTrue(l1.containsAll(l2));
        assertTrue(l2.containsAll(l1));
    }
    @Test
    void test2(){
        List<Integer> l1 = m.intersection(new int[][]{{1,2,3},{4,5,6}});
        List<Integer> l2 = List.of();
        assertEquals(l1.size(), 0);
        assertTrue(l1.containsAll(l2));
        assertTrue(l2.containsAll(l1));
    }
}