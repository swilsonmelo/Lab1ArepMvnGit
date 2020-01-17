package edu.escuelaing.arep.ASE.app;


import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 *
 */
public class LinkedList<T> implements List<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public LinkedList(final T data) {
        this.head = new Node<T>(data, null, null);
        this.tail = new Node<T>(data, null, null);
        this.size = 1;
    }

    public boolean add(final T data) {

        if (size == 0) {
            final Node<T> addedNode = new Node<T>(data, null, null);
            this.head = addedNode;
            this.tail = addedNode;
        } else {
            final Node<T> addedNode = new Node<T>(data, this.tail, null);
            this.tail.setNext(addedNode);
            this.tail = addedNode;
        }
        size++;
        return true;
    }

    public void add(final int index, final T element) {
        final int mid = size / 2;
        int pos = 0;
        final Node<T> addedNode = new Node<T>(element, null, null);
        if (index <= mid) {
            Node<T> currentNode = this.head;
            while (pos < index) {
                currentNode = currentNode.getNext();
                pos++;
            }
            if (pos == 0) {
                addedNode.setNext(this.head);
                this.head = addedNode;
            } else {
                addedNode.setPrior(currentNode.getPrior());
                currentNode.setPrior(addedNode);
                addedNode.setNext(currentNode);
            }

        }else{
            while(pos>index){
                Node<T> currentNode = this.tail;                
            }

        }

    }

    public boolean addAll(final Collection<? extends T> c) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean addAll(final int index, final Collection<? extends T> c) {
        // TODO Auto-generated method stub
        return false;
    }

    public void clear() {
        // TODO Auto-generated method stub

    }

    public boolean contains(final Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean containsAll(final Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    public T get(final int index) {
        // TODO Auto-generated method stub
        return null;
    }

    public int indexOf(final Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    public int lastIndexOf(final Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    public ListIterator<T> listIterator() {
        // TODO Auto-generated method stub
        return null;
    }

    public ListIterator<T> listIterator(final int index) {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean remove(final Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    public T remove(final int index) {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean removeAll(final Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean retainAll(final Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    public T set(final int index, final T element) {
        // TODO Auto-generated method stub
        return null;
    }

    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    public List<T> subList(final int fromIndex, final int toIndex) {
        // TODO Auto-generated method stub
        return null;
    }

    public Object[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }

    public <T> T[] toArray(final T[] a) {
        // TODO Auto-generated method stub
        return null;
    }    
  
}
