package main.java.org.leetcode.array.sumoddlengtharrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(findGCD(new int[]{2,5,6,9,10}));
    }
    public static int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int res = 1;
        for(int i: nums) {
            if(i > max) max = i;
            if(i < min) min = i;
        }
        for(int i = 1; i <= min; i ++) {
            if(min % i == 0 && max % i == 0 && i > res) res = i;
        }
        return res;
    }
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;

        for(int i = 0; i < arr.length; i ++) {
            int end = i;
            while (end < arr.length) {
                sum += sum(arr,i, end);
                end += 2;
            }
        }
            return sum;
    }
    public int sum(int[] arr, int st, int en) {
        int res = 0;
        for(int i = st; i <= en; i ++) {
            res += arr[i];
        }
        return res;
    }
}
