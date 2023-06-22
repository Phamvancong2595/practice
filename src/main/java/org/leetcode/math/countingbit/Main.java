package org.math.countingbit;

import java.util.stream.IntStream;

public class Main {
    public int[] countBits(int n) {
        int[] ret = new int[n + 1];
        int[] a = IntStream.range(0,n + 1).toArray();
        for (int i = 0; i < a.length; i ++){
            String r = Integer.toBinaryString(a[i]);
            int c = (int) r.chars().filter(ch -> ch == '1').count();
            ret[i] = c;
        }
        return ret;
    }
}
