package edu.escuelaing.arep.ASE.app.utilities;

import java.util.Iterator;


/**
 * LinkedListIterator Class
 * 
 * @author Willson Melo
 *
 * @param <T> the type of elements returned by this iterator
 */
public class LinkedListIterator<T> implements Iterator<T> {

    Node<T> current;

    /**
     * Constructs an iterator of a LinkedList
     * @param lkl
     */
    public LinkedListIterator(LinkedList<T> lkl) {
        current = lkl.getHead();
    }

    /**
     * Returns true if the iteration has more elements.
     * @return true if the iteration has more elements
     */
    public boolean hasNext() {
        return current != null;
    }

    /**
     * Returns the next element in the iteration.
     * @return the next element in the iteration
     */
    public T next() {
        T data = current.getElement();
        current = current.getNext();
        return data;
    }
}
