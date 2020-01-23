package edu.escuelaing.arep.ASE.app.utilities;

import java.util.Iterator;

 /**
 * LinkedList Class
 * 
 * @author Willson Melo
 *
 * @param <T> the type of elements stored in this linkedList
 */
public class LinkedList<T> implements Iterable<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    /**
     * Constructs an empty LinkedList.
     */
    public LinkedList() {
        this.size = 0;
    }

    /**
     * Constructs a list containing the first elements
     * @param data the element to add
     */
    public LinkedList(T data) {
        this.head = new Node<T>(data, null, null);
        this.tail = this.head;
        this.size = 1;
    }

    /**
     * Adds the specified element as the tail
     * @param data the element to add
     */
    public void add(T data) {
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
    }

    /**
     * Inserts the specified element at the specified position in this list. 
     * Shifts the element currently at that position (if any) and any subsequent elements to the right (adds one to their indices).
     * @param index index at which the specified element is to be inserted
     * @param element element to be inserted
     */
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

    /**
     * Returns the element at the specified position in this linkedList
     * @param index index of the element to return
     * @return the element at the specified position in this list
     */
    public T get(int index) {
        Node<T> currentNode = getNode(index);
        T element = currentNode.getElement();
        return element;
    }

    /**
     * Returns the head of the linkedList as a node
     * The head is the first item in the linkedList
     * @return Node saved in the first position of the linkedList
     */
    public Node<T> getHead(){
        return this.head;
    }

    /**
     * Returns the tail of the linkedList as a node
     * The Tail is the last item in the linkedList
     * @return Node saved in the last position of the linkedList
     */
    public Node<T> getTail(){
        return this.tail;
    }

    /**
     * Returns the node at the specified position in this linkedList
     * @param index  index of the node to return
     * @return the node at the specified position in this list
     */
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
    
    /**
     * Replaces the element at the specified position in this linkedList with the specified element.
     * @param index index of the element to replace
     * @param element element to be stored at the specified position
     */
    public void set(int index, T element) {
        Node<T> currentNode = getNode(index);
        T currenElement = currentNode.getElement();
        currentNode.setElement(element);        
    }

    /**
     * Returns the number of elements in this LinkedList
     * @return the number of elements in this LinkedList
     */
    public int size() {
        return size;
    }

    /**
     * Returns true if this linkedList contains no elements.
     * @return true if this linkedList contains no elements
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Removes the last item of this linkedList
     */
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

    /**
     * Removes the first item of this linkedList
     */
    public void removeHead() {
        if (size == 1) {
            removeTail();
        } else {
            Node<T> nextHeadNode = this.head.getNext();
            nextHeadNode.setPrior(null);
            this.head = nextHeadNode;
            size--;
        }        
    }

    /**
     *  Removes a single instance of the element in a especific index
     * @param index index of the element to be removed
     */
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

    /**
     * Removes a single instance of the specified element 
     * @param element element to be removed from this linkedList, if present     
     */
    public void remove(T element){
        Node<T> currentNode = this.head;
        int pos = 0;
        while(currentNode != null){
            if(currentNode.getElement().equals(element)){
                remove(pos);                
            }
            currentNode = currentNode.getNext();
            pos++;
        }        
    }

    /**
     * Removes all of the elements from this linkedList
     */
    public void clear() {
        this.head = null;
        this.tail = null;
        size = 0;
    }
    /**
     * Returns an iterator over the elements contained in this linkedList
     * @return an iterator over the elements contained in this linkedList
     */
    public Iterator<T> iterator() {        
        return new LinkedListIterator<T>(this);
    }    

}
