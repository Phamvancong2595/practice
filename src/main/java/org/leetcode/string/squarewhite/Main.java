package main.java.org.leetcode.string.squarewhite;

public class Main {
    public boolean squareIsWhite(String coordinates) {
        if (coordinates.charAt(0) == 97 || coordinates.charAt(0) == 99 || coordinates.charAt(0) == 101 || coordinates.charAt(0) == 103) {
            return Character.getNumericValue(coordinates.charAt(1)) % 2 != 1;
        } else {
            return Character.getNumericValue(coordinates.charAt(1)) % 2 == 1;
        }
    }
}
