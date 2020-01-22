package edu.escuelaing.arep.ASE.app.utilities;

import java.util.Iterator;

public class LinkedListIterator<T> implements Iterator<T> {

    Node<T> current;

    public LinkedListIterator(LinkedList<T> lkl) {
        current = lkl.getHead();
    }

    public boolean hasNext() {
        return current != null;
    }

    public T next() {
        T data = current.getElement();
        current = current.getNext();
        return data;
    }
}
