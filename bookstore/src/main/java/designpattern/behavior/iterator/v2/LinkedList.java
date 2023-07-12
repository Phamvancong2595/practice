package designpattern.behavior.iterator.v2;

import java.util.Iterator;

public class LinkedList <E> implements Iterable<E> {
    private Node<E> firstNode;
    public void add(E element) {
        firstNode = new Node<>(element, firstNode);
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> currentNode = firstNode;
            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public E next() {
                final E element = currentNode.getData();
                currentNode = currentNode.getNext();
                return element;
            }
        };
    }
}
