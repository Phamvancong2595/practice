package main.java.org.leetcode.string.issumequal;

public class Main {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int i1 = stringToInt(firstWord);
        int i2 = stringToInt(secondWord);
        int i3 = stringToInt(targetWord);
        return i1 + i2 == i3;

    }
    public int stringToInt(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i ++) {
                sb.append ((int)s.charAt(i) - 97);
        }
        return Integer.parseInt(sb.toString());
    }
}
