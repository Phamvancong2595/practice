package main.java.org.leetcode.array.checkvalid;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public boolean checkValid(int[][] matrix) {
        int size = matrix.length;
        for(int[] arr: matrix) {
            Set<Integer> sR = new HashSet<>();
            for (int i: arr) {
                sR.add(i);
            }
            if (sR.size() != size) {
                return false;
            }
            for(int i = 1; i <= sR.size(); i ++){
                if (!sR.contains(i)){
                    return false;
                }
            }
            sR.clear();
        }
        for (int j = 0; j < size; j ++){
            Set<Integer> sC = new HashSet<>();
            for (int[] arr: matrix) {
                sC.add(arr[j]);
            }
            if (sC.size() != size) {
                return false;
            }
            for(int i = 1; i <= sC.size(); i ++){
                if (!sC.contains(i)){
                    return false;
                }
            }
            sC.clear();
        }
        return true;
    }
}
