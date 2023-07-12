package main.java.org.leetcode.array.checkstraightline;

public class Main {
    public boolean checkStraightLine(int[][] coordinates) {
        int a, b;
        int[] x1 = coordinates[0];
        int[] x2 = coordinates[1];
        a = x1[1] - x2[1];
        b = x2[0] - x1[0];
        for(int i = 2; i < coordinates.length; i ++) {
            int[] x = coordinates[i];
            if (a * (x[0] - x1[0]) + b * (x[1] - x1[1]) != 0) return false;
        }
        return true;
    }
}
