package main.java.org.leetcode.string.makegood;

import java.util.Stack;
import java.util.zip.CheckedInputStream;

public class Main {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; i ++){
            st.push(chars[i]);

        }
        return null;
    }
    public boolean isGood(char a, char b){
        return (Character.isUpperCase(a) && Character.isUpperCase(b)) ||
                (Character.isLowerCase(a) && Character.isLowerCase(b));
    }
}
