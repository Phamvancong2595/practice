package main.java.org.leetcode.string.greatestLetter;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public String greatestLetter(String s) {
        char res = '\0';
        Set<Integer> set = new HashSet<>();
        for (char a: s.toCharArray()) {
           if (set.contains((a + 32)) || set.contains(a - 32)) {
               if (Character.toUpperCase(a) > res) {
                   res = Character.toUpperCase(a);
               }
           } else {
               set.add((int) a);
           }
        }
        return res == '\0' ? "": String.valueOf(res);
    }
}
