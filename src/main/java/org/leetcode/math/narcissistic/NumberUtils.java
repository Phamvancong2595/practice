package org.math.narcissistic;

public class NumberUtils {
    public static boolean isNarcissistic(int number) {
        int count = 0;
        int temp = number;
        int sum = 0;
        while (temp > 0){
            temp /= 10;
            count ++;
        }
        temp = number;
        while (temp > 0){
            int e = temp % 10;
            temp /= 10;
            sum += Math.pow(e,count);
        }
        // TODO replace with your code
        return sum == number;
    }
}
