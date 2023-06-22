package org.hashtable.intersection;

import java.util.*;

public class Main {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> ret = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] num: nums){
            for (int i: num){
                map.put(i, map.getOrDefault(i,0) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            if (entry.getValue() == nums.length){
                ret.add(entry.getKey());
            }
        }
        Collections.sort(ret);
        return ret;
    }
}
