package main.java.org.core.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Demo {
    public static int totalValue(List<Integer> values, Predicate<Integer> selector) {
        return values.stream()
                .filter(selector)
                .mapToInt( e -> e)
                .sum();
    }
    public static void main(String[] args) {
        boolean c = false;
        List<Boolean> b = Arrays.asList(false, false, true);
        for (boolean i: b) {
            c = c || i;
            System.out.println(c);
        }
        System.out.println(c);
        List<Integer> values = List.of(1,2,3,4,5,6,7,8,9);
        System.out.println(totalValue(values, e -> true));
        System.out.println(totalValue(values, e -> e % 2 == 0));
        System.out.println(totalValue(values, e -> e % 2 != 0));
    }
}
