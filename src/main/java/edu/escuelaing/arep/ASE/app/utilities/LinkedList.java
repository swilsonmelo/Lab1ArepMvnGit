package edu.escuelaing.arep.ASE.app.utilities;

import java.util.Iterator;

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

    public void removeTail() {
        if (size == 1) {
            this.head = null;
            this.tail = null;
        } else {
            Node<T> priorTailNode = this.tail.getPrior();
            priorTailNode.setNext(null);
            this.tail = priorTailNode;
        }
        size--;
    }

    public void removeHead() {
        if (size == 1) {
            removeTail();
        } else {
            Node<T> nextHeadNode = this.head.getNext();
            nextHeadNode.setPrior(null);
            this.head = nextHeadNode;
        }
        size--;
    }

    public void remove(int index) {
        if (index == 0)
            removeHead();
        else if (index == size - 1)
            removeTail();
        else {
            Node<T> currentNode = getNode(index);
            Node<T> priorCurrentNode = currentNode.getPrior();
            Node<T> nextCurrentNode = currentNode.getNext();
            priorCurrentNode.setNext(nextCurrentNode);
            nextCurrentNode.setPrior(priorCurrentNode);
            size--;
        }
    }


    public boolean remove(T element){
        Node<T> currentNode = this.head;
        int pos = 0;
        while(currentNode != null){
            if(currentNode.getElement().equals(element)){
                remove(pos);
                return true;
            }
            currentNode = currentNode.getNext();
            pos++;
        }
        return false;
    }

    public void clear() {

    }

    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

}
