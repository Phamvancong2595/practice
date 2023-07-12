package main.java.org.core.concurrency.synmethod;

public class Main {
    public static void main(String[] args) {
        TestSync obj = new TestSync();
        ThreadII t2 = new ThreadII(obj);
        ThreadI t1 = new ThreadI(obj);
        t1.start();
        t2.start();
    }

}
