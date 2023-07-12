package main.java.org.core.concurrency.synmethod;

public class TestSync {
    synchronized void print(int n) {
        for (int i = 1; i <= 5; i ++) {
            System.out.println(n * i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
