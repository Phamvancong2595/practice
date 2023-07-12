package main.java.org.leetcode.array.canbeincrease;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i: candies) {
            if (i > max) max = i;
        }
        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                res.add(true);
            } else res.add(false);
        }
        return res;
    }
    public boolean canBeIncreasing(int[] nums) {
        List<Integer> l = IntStream.of(nums).boxed().collect(Collectors.toList());
        for (int i = 0; i < l.size(); i ++) {
            List<Integer> temp = new ArrayList<>(l);
            temp.remove(i);
            if (isSorted(temp)) return true;
        }
        return false;
    }
    public boolean isSorted(List<Integer> l) {
        for(int i = 0; i < l.size() - 1; i ++) {
            if (l.get(i) >= l.get(i + 1)) return false;
        }
        return true;
    }
}
