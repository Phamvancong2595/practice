package designpattern.behavior.iterator.v1;

import lombok.AllArgsConstructor;

public final class Application {
    public interface Iterator<E> {
        E next();
        boolean hasNext();
    }
    public static class ConcreteIterator<E> implements Iterator<E> {
        private int currentIndex;
        private final E[] elements;

        public ConcreteIterator(E[] elements) {
            this.elements = elements;
        }

        @Override
        public E next() {
            return elements[currentIndex ++];
        }

        @Override
        public boolean hasNext() {
            return currentIndex < elements.length;
        }
    }
    public interface Aggregate<E> {
        Iterator <E> createIterator();
    }
    @AllArgsConstructor
    public static class ConcreteAggregate<E> implements Aggregate<E> {
        private final E[] elements;

        @Override
        public Iterator<E> createIterator() {
            return new ConcreteIterator<>(elements);
        }
    }

    public static void main(String[] args) {
        final Aggregate<Integer> aggregate = new ConcreteAggregate<>(
                new Integer[] {1,2,3,4}
        );
        final Iterator<Integer> iterator = aggregate.createIterator();
         while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
