package org.array.relativerank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.array.relativerank.Main;

public class RelativeRank {
    Main m =new Main();
    @Test void test1(){
        Assertions.assertArrayEquals(m.findRelativeRanks(new int[]{5,4,3,2,1}), new String[]{"Gold Medal","Silver Medal","Bronze Medal","4","5"});
    }
    @Test void test2(){
        Assertions.assertArrayEquals(m.findRelativeRanks(new int[]{10,3,8,9,4}), new String[]{"Gold Medal","5","Bronze Medal","Silver Medal","4"});
    }
}