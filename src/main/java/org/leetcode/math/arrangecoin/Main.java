package main.java.org.leetcode.math.arrangecoin;

public class Main {
    // you need treat n as an unsigned value
    public int arrangeCoins(int n) {
        long res = 0;
        long l = 0;
        long r = n;
        long m;
        while (l <= r) {
            m = l + (r - l) / 2;
            res = m * (m + 1) / 2;
            if (res == n) return (int) m;
            if (res < n) l = m + 1;
            else r = m - 1;
        }
        return (int)r;
    }
}
