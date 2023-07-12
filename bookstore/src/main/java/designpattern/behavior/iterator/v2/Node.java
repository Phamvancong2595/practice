package designpattern.behavior.iterator.v2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Node<E> {
    private E data;
    private Node<E> next;

}
