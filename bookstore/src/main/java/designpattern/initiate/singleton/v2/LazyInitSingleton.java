package designpattern.initiate.singleton.v2;

public class LazyInitSingleton {
    private static volatile LazyInitSingleton instance ;
    private LazyInitSingleton() {}
    private static LazyInitSingleton getInstance() {
        if (instance == null) synchronized (LazyInitSingleton.class) {
            if (instance == null) {
                instance = new LazyInitSingleton();
            }
        }
        return instance;
    }
}
