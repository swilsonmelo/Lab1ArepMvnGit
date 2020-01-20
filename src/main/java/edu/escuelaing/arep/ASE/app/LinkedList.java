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
public class LinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public LinkedList(T data) {
        this.head = new Node<T>(data, null, null);
        this.tail = this.head;
        this.size = 1;
    }

    public boolean add(T data) {
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

    public Node<T> getNode(int index) {
        int mid = size / 2;
        int pos;
        Node<T> currentNode;
        // System.out.println(mid + " " + index);
        if (index <= mid) {
            pos = 0;
            currentNode = this.head;
            while (pos < index) {
                currentNode = currentNode.getNext();
                pos++;
            }
        } else {
            pos = size - 1;
            currentNode = this.tail;
            while (pos > index) {
                currentNode = currentNode.getPrior();
                pos--;
            }
        }
        return currentNode;
    }

    public void add(int index, T element) {
        Node<T> addedNode = new Node<T>(element, null, null);
        Node<T> currentNode = getNode(index);
        if (currentNode.getPrior() != null) {
            Node<T> priorCurrentNode = currentNode.getPrior();
            priorCurrentNode.setNext(addedNode);
            addedNode.setPrior(priorCurrentNode);
        }
        currentNode.setPrior(addedNode);
        addedNode.setNext(currentNode);
        if (index == 0)
            this.head = addedNode;
        size++;
    }

    public T get(int index) {
        Node<T> currentNode = getNode(index);
        T element = currentNode.getElement();
        return element;
    }

    public T set(int index, T element) {
        Node<T> currentNode = getNode(index);
        T currenElement = currentNode.getElement();
        currentNode.setElement(element);
        return currenElement;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T remove(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    public void clear() {

    }

    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

}
