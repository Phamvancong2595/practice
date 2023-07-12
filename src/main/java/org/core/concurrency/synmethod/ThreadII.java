package main.java.org.core.concurrency.synmethod;

public class ThreadII extends Thread{
    TestSync sync;
    public ThreadII(TestSync sync) {
        this.sync = sync;
    }
    public void run() {
        sync.print(100);
    }
}
