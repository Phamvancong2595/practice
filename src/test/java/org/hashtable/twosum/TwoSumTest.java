package org.hashtable.twosum;

import org.leetcode.hashtable.twosum.Main;

public class TwoSumTest {
    Main m = new Main();
    @Test
    void test1(){
        Assertions.assertArrayEquals(m.twoSum(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1});
}
    @Test
    void test2(){
        Assertions.assertArrayEquals(m.twoSum(new int[]{3,2,4}, 6), new int[]{1,2});
    }
    @Test
    void test3(){
        Assertions.assertArrayEquals(m.twoSum(new int[]{3,3}, 6), new int[]{0,1});
    }

}