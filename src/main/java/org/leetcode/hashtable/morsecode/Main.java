package main.java.org.leetcode.hashtable.morsecode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");
        Map<String, String> m = new HashMap<>();
        for (int i = 0; i < alphabet.length; i ++){
            m.put(alphabet[i], morse[i]);
        }
        Set<String> ret = new HashSet<>();
        for (String s: words){
            String[] arr = s.split("");
            StringBuilder sb = new StringBuilder();
            for(String si: arr){
                sb.append(m.get(si));
            }
            ret.add(sb.toString());
        }
        return ret.size();
    }
}
