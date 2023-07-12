package main.java.org.leetcode.array.relativerank;

import java.util.*;

public class Main {
    public String[] findRelativeRanks(int[] score){
        int len = score.length;
        String[] ret = new String[len];
      int[] clone = score.clone();
      Arrays.sort(clone);
      Map<Integer, Integer> m = new HashMap<>();
      for (int i = 0;i < len; i ++){
          m.put(clone[i], len - i -1);
      }
      for (int i = 0;i < len; i ++){
          int rank = m.get(score[i]);
          if (rank == 0) ret[i] = "Gold Medal";
          else if(rank == 1) ret[i] = "Silver Medal";
          else if(rank == 2) ret[i] = "Bronze Medal";
          else ret[i] = String.valueOf(rank + 1);
      }
     return  ret;
    }
}
