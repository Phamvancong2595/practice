package main.java.org.leetcode.array.onebit;

public class Main {
    public boolean isOneBitCharacter(int[] bits) {
        int len = bits.length;
        if (bits[len - 1] != 0) return false;
        int c  = 0;
        while (c < len - 1) {
            if (bits[c] == 1) {
                c += 2;
            } else c ++;
        }
        return c < len;
    }
}
