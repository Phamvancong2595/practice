package main.java.org.leetcode.array.xofakind;

import java.util.*;

public class HasGroupSizeX {
    public boolean hasGroupsSizeX(int[] deck) {
        if (deck.length < 2) return false;
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i: deck) {
            freq.put(i, freq.getOrDefault(i,0) + 1);
        }
        List<Integer> l = new ArrayList<>(freq.values());
        Collections.sort(l);
        if (l.get(0) == 1) return false;
        int count = 0;
        for (int i = 2; i <= l.get(l.size() - 1); i ++){
            for (int j: l){
                if (j % i == 0) count ++;
                else {
                    count = 0;
                    break;
                }
            }
            if (count == l.size()) return true;
        }
        return false;
    }
}
