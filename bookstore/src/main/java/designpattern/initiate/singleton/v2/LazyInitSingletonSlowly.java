package designpattern.initiate.singleton.v2;

public class LazyInitSingletonSlowly {
    private static LazyInitSingletonSlowly instance;
    private LazyInitSingletonSlowly() {
        try {
            System.out.println(
                    "Initializing by thread: " +
                            Thread.currentThread().getName()
            );
            Thread.sleep(1000);
            System.out.println(
                    "Initialized: " +
                            Thread.currentThread().getName()
            );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static LazyInitSingletonSlowly getInstance() {
        if (instance == null) synchronized (LazyInitSingleton.class) {
            if (instance == null) {
                instance = new LazyInitSingletonSlowly();
            }
        }

        return instance;
    }

    public static void main(String[] args) {
        final Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i ++) {
            threads[i] = new Thread(
                    LazyInitSingletonSlowly::getInstance
            );
        }
            for (Thread t: threads) {
                t.start();
            }

    }
}
