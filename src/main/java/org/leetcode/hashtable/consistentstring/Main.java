package org.hashtable.consistentstring;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> a1 = new java.util.ArrayList<>(List.of("a", "b"));
        List<String> a2 = new java.util.ArrayList<>(List.of("a", "a", "a", "b"));
        System.out.println(a1.retainAll(a2));
    }
    public int countConsistentStrings(String allowed, String[] words) {
        int ret = words.length;
        Set<String> s = new HashSet<>();
        Collections.addAll(s, allowed.split(""));
        for (String word: words){
            for (String w: word.split("")){
                if (s.contains(w)){

                }else {
                    ret --;
                    break;
                }
            }

        }
        return ret;
    }
}
