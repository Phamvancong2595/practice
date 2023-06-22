package org.hashtable.commoncharacter;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(List.of(3, 1, 2, 4, 5));
        List<Integer> l2 = List.of(1,2,3,4);
        List<Integer> l3 = List.of(3,4,5,6);
        l1.retainAll(l2);
        l1.retainAll(l3);
        System.out.println(l1);
    }
    public List<String> commonChars(String[] words) {
        List<String> ret =new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        for (Character c: words[0].toCharArray())
            map.put(c, map.getOrDefault(c,0) +1);
        for(int i = 1; i < words.length; i ++){
            Map<Character, Integer> m = new HashMap<>();
            for (Character c: words[i].toCharArray())
                m.put(c, m.getOrDefault(c,0) + 1);
            Iterator<Map.Entry<Character, Integer>> iter = map.entrySet().iterator();
            while (iter.hasNext()) {
                Map.Entry<Character, Integer> entry = iter.next();
                if (m.containsKey(entry.getKey())){
                    map.put(entry.getKey(), Math.min(entry.getValue(), m.get(entry.getKey())));
                } else {
                    iter.remove();
                }
            }

        }
        for(Map.Entry<Character, Integer> e: map.entrySet()){
            int freq = e.getValue();
            while (freq > 0){
                ret.add(String.valueOf(e.getKey()));
                freq --;
            }
        }
        return ret;
    }

}
