package main.java.org.leetcode.string.firstpalidrome;

public class Main {
    public String firstPalindrome(String[] words) {
        for (String s: words) {
            if (isPalidrome(s)) return s;
        }
        return "";
    }
    public boolean isPalidrome(String s) {
        for (int i = 0; i < s.length() / 2; i ++) {
            if (s.charAt(i) - s.charAt(s.length() - i - 1) != 0) return false;
        }
        return true;
    }
}
