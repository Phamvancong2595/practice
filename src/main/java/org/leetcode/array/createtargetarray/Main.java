package main.java.org.leetcode.array.createtargetarray;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public int[] createTargetArray(int[] nums, int[] index) {
        int max  = Integer.MIN_VALUE;
        for (int i: index) {
            max = Math.max(max,i);
        }
        int[] count = new int[max + 1];
        for (int j : index) {
            count[j]++;
        }
        int total = 0;
        for(int i = 0; i < count.length; i ++) {
            int old = count[i];
            count[i] = total;
            total += old;
        }
        int[] out = new int[index.length];
        for (int val : index) {
            int idx = count[val];
            out[idx] = val;
            count[val]++;
        }
        return new int[]{};
    }
}
