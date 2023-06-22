package designpattern.objectpool.v1;

import lombok.AllArgsConstructor;

import java.util.LinkedList;
import java.util.Queue;

public class Application {
    @AllArgsConstructor
    public static class ReuseableObject {
        private final ObjectPool objectPool;

        public void release() {
            objectPool.offerObject(this);
        }
    }

    public static class ObjectPool {
        final Queue<ReuseableObject> objects = new LinkedList<>();

        public synchronized ReuseableObject provideObject() {
            return objects.isEmpty() ? new ReuseableObject(this) : objects.poll();
        }

        public synchronized void offerObject(ReuseableObject object) {
            objects.offer(object);
        }
    }

    public static void main(String[] args) {
        final ObjectPool objectPool = new ObjectPool();
        final ReuseableObject object = objectPool.provideObject();
        try {
            useObject(object);
        } finally {
            object.release();
        }
    }

    private static void useObject(ReuseableObject object) {
        System.out.println(object);
    }
}
