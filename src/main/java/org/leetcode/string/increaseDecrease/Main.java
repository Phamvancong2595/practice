package main.java.org.leetcode.string.increaseDecrease;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public String sortString(String s) {
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>(List.of(s.split("")));
        List<String> l = Arrays.stream(s.split(""))
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        List<String> r = Arrays.stream(s.split(""))
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        Collections.reverse(r);
        Map<String, Integer> m = new HashMap<>();
        for (String str : s.split("")) {
            m.put(str, m.getOrDefault(str, 0) + 1);
        }
        while (list.size() != 0) {
            int c = 0;
            aa(sb, list, l, m, c);
            c = 0;
            aa(sb, list, r, m, c);
        }
        return sb.toString();
    }

    private void aa(StringBuilder sb, List<String> list, List<String> r, Map<String, Integer> m, int c) {
        while (c < r.size() && list.size() != 0) {
            String t = m.get(r.get(c)) <= 0 ? "" : r.get(c);
            sb.append(t);
            m.put(r.get(c), m.getOrDefault(r.get(c), 0) - 1);
            list.remove(r.get(c));
            c ++;
        }
    }
}
