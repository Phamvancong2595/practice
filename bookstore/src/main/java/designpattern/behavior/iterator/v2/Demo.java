package designpattern.behavior.iterator.v2;

public class Demo {
    public static void main(String[] args) {
        final LinkedList<Integer> integers =
                new LinkedList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.forEach(System.out::println);
    }
}
