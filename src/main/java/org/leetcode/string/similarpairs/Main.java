package main.java.org.leetcode.string.similarpairs;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public int similarPairs(String[] words) {
        int res = 0;
        for (int i = 0; i < words.length - 1; i ++) {
            for(int j = i + 1; j < words.length; j ++) {
                if (isSimilar(words[i],words[j])) res ++;
            }
        }
        return res;

    }
    public boolean isSimilar(String s1, String s2) {
        Set<String> sets1 = new HashSet<>(List.of(s1.split("")));
        Set<String> sets2 = new HashSet<>(List.of(s2.split("")));
        return sets2.equals(sets1);
    }
}
