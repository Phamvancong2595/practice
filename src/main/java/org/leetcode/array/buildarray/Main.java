package main.java.org.leetcode.array.buildarray;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
    }
    public static int titleToNumber(String columnTitle) {
        int res = 0;
        char[] str = columnTitle.toCharArray();
        for(int i = str.length - 1; i >= 0; i --) {
            res += Math.pow(26,str.length - i -1)*(str[i] - 64);
        }
        return res;
    }
    public int[] buildArray(int[] nums) {
        suff(nums, 0);
        return nums;
    }
    public void suff(int[] nums, int i) {
        if (i < nums.length) {
            int r1 = nums[i];
            int res = nums[r1];
            suff(nums, i +1);
            nums[i] = res;
        }
    }
}
