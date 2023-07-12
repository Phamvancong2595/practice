package main.java.org.leetcode.string.removestars;

import java.util.Stack;

public class Main {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(Character c: s.toCharArray()) {
            if (c != '*') {
                stack.push(c);
            } else if(!stack.isEmpty()) {
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character c: stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}
