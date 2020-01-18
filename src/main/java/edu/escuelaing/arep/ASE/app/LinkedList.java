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

    public LinkedList( T data) {
        this.head = new Node<T>(data, null, null);
        this.tail = new Node<T>(data, null, null);
        this.size = 1;
    }

    public boolean add( T data) {

        if (size == 0) {
             Node<T> addedNode = new Node<T>(data, null, null);
            this.head = addedNode;
            this.tail = addedNode;
        } else {
             Node<T> addedNode = new Node<T>(data, this.tail, null);
            this.tail.setNext(addedNode);
            this.tail = addedNode;
        }
        size++;
        return true;
    }

    public Node<T> getNode(int index){
        int mid = size / 2;
        int pos = 0;
        Node<T> currentNode;
        if (index <= mid) {
            currentNode = this.head;
            while (pos < index) {
                currentNode = currentNode.getNext();
                pos++;
            }
        }else{
            currentNode = this.tail;
            while(pos > index){
                currentNode = currentNode.getPrior();
                pos--;
            }
        }
        return currentNode;
    }

    public void add(int index, T element) {
        Node<T> addedNode = new Node<T>(element, null, null);
        Node<T> currentNode = getNode(index);
        if( currentNode.getPrior() != null){
            Node<T> priorCurrentNode = currentNode.getPrior();
            priorCurrentNode.setNext(addedNode);
            addedNode.setPrior(priorCurrentNode);
        }
        currentNode.setPrior(addedNode);
        addedNode.setNext(currentNode);
        size++;
    }

    public boolean addAll( Collection<? extends T> c) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean addAll( int index,  Collection<? extends T> c) {
        // TODO Auto-generated method stub
        return false;
    }

    public void clear() {
        

    }

    public boolean contains( Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean containsAll( Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    public T get( int index) {
        Node<T> currentNode = getNode(index);
        T element = currentNode.getElement();
        return element;
    }

    public int indexOf( Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    public boolean isEmpty() {
        
        return size == 0;
    }

    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    public int lastIndexOf( Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    public ListIterator<T> listIterator() {
        // TODO Auto-generated method stub
        return null;
    }

    public ListIterator<T> listIterator( int index) {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean remove( Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    public T remove( int index) {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean removeAll( Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean retainAll( Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    public T set( int index,  T element) {
        Node<T> currentNode = getNode(index);
        T currenElement = currentNode.getElement();
        currentNode.setElement(element);
        return currenElement;
    }

    public int size() {
        // TODO Auto-generated method stub
        return size;
    }

    public List<T> subList( int fromIndex,  int toIndex) {
        // TODO Auto-generated method stub
        return null;
    }

    public Object[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }

    public <T> T[] toArray( T[] a) {
        // TODO Auto-generated method stub
        return null;
    }    
  
}
