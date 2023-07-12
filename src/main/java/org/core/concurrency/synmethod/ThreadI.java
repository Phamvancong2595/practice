package main.java.org.core.concurrency.synmethod;

public class ThreadI extends Thread{
    TestSync sync1;
    ThreadI(TestSync sync) {
        this.sync1 = sync;
    }
    public void run() {
        sync1.print(5);
    }
}
