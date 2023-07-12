package main.java.org.leetcode.string.goatlatin;

import java.util.Set;

public class Main {
    public String toGoatLatin(String sentence) {
        String[] str = sentence.split(" ");
        for(int i = 0; i < str.length; i ++) {
            StringBuilder sb = new StringBuilder(str[i]);
            if (isVowel(str[i].charAt(0))) {
                convertString(i, sb);
            } else {
                sb = new StringBuilder(sb.substring(1, sb.length()));
                sb.append(str[i].charAt(0));
                convertString(i, sb);
            }
            str[i] = sb.toString();
        }
        return String.join(" ", str);
    }

    private static void convertString(int i, StringBuilder sb) {
        sb.append("ma");
        int c = 0;
        while (c <= i) {
            sb.append("a");
            c ++;
        }
    }
    private boolean isVowel(char a) {
        return 'a' == a || 'e' == a || 'i' == a || 'o' == a || 'u' == a
                || 'A' == a || 'E' == a || 'I' == a || 'O' == a || 'U' == a;
    }
}
