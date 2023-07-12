package main.java.org.leetcode.string.countasterisks;

public class Main {
    public int countAsterisks(String s) {
        int count = 0;
        int as = 0;
        for (int i = 0; i < s.length(); i ++) {

            if (s.charAt(i) - 124 == 0) as ++;
            if (as == 0 && s.charAt(i) - 42 == 0) count ++;
            if (as == 2) as = 0;
        }
        return count;
    }
}
