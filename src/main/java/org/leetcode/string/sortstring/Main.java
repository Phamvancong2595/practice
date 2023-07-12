package main.java.org.leetcode.string.sortstring;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public String sortString(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> freq =  new HashMap<>();
        for (int i: s.toCharArray()) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        return null;
    }
}
