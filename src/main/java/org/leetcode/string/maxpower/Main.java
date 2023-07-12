package main.java.org.leetcode.string.maxpower;

public class Main {
    public int maxPower(String s) {
        int count = 1;
        int max = 1;
        if (s.length() == 1) return 1;
        if (s.length() == 2) {
            if (s.charAt(0) - s.charAt(1) == 0) return 2;
            else return 1;
        }
        if (s.length() > 2) {
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) - s.charAt(i + 1) == 0) {
                    count++;
                } else {
                    max = Math.max(max,count);
                    count = 1;
                }
            }
            return Math.max(max,count);
        }
        return max;
    }
}
