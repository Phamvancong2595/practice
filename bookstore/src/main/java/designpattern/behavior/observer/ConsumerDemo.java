package designpattern.behavior.observer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        List<String> names = List.of("A", "B", "C", "D", "E");
        Consumer<String> printName = System.out::println;
        names.forEach(printName);
    }
}
