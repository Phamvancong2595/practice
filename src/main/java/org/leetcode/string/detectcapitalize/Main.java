package main.java.org.leetcode.string.detectcapitalize;

public class Main {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 1) return true;
        int count = 1;
        if (Character.isUpperCase(word.charAt(0))){
            for (int i = 1; i < word.length(); i ++){
                if (Character.isUpperCase(word.charAt(i))) count ++;
            }
        } else {
            for (int i = 1; i < word.length(); i ++){
                if (Character.isUpperCase(word.charAt(i))) return false;
            }
            return true;
        }
        return count == word.length() || count == 1;
    }
}
