package org.hashtable.twosum;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
       String[] words = new String[]{"bella","label","roller"};
       for (String w: words){
           String[] st = w.split("");
       }
    }
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i < nums.length; i ++){
           if (!m.containsKey(target - nums[i])){
               m.put(nums[i],i);
           }else {
               return new int[]{m.get(target - nums[i]),i};

           }
        }
        return new int[]{0,0};
    }
}
