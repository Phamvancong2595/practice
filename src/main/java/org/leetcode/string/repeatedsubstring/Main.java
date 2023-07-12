package main.java.org.leetcode.string.repeatedsubstring;

public class Main {
    public boolean repeatedSubstringPattern(String s) {
        return (s + s).indexOf(s,1) != s.length();
    }
}
