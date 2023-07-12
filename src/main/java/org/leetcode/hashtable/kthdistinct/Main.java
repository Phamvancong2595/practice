package main.java.org.leetcode.hashtable.kthdistinct;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> freq = new HashMap<>();
        for (String s: arr){
            freq.put(s, freq.getOrDefault(s,0) + 1);
        }
        for (String s: arr){
            if (freq.get(s) == 1) k --;
            if (k == 0) return s;
        }
        return "";

    }
}
