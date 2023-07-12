package main.java.org.designpattern.flyweight;

import java.io.InputStream;
import java.util.Arrays;

public class TestFlyweightThreaded implements Runnable{
    Thread thread;

    public static void main(String[] args) {
        TestFlyweightThreaded t = new TestFlyweightThreaded();
    }
    public TestFlyweightThreaded() {
        String[] names = new String[] {"Ralph", "Alice", "Sam"};
        int[] ids = new int[] {1001, 1002, 1003};
        int[] scores = new int[] {45, 55, 65};
        int sum = Arrays.stream(scores).sum();
        double averageS = sum / names.length;
        StudentThread s = StudentThread.getInstance();
        s.setAverageScore(averageS);
        s.setName("Ralph");
        s.setId(1002);
        s.setScore(45);
        thread = new Thread(this, "second");
        thread.start();
        System.out.println(s);
        System.out.println(System.identityHashCode(s));
    }

    @Override
    public void run() {
        StudentThread s = StudentThread.getInstance();
        System.out.println(s);
        System.out.println(System.identityHashCode(s));
    }
}
