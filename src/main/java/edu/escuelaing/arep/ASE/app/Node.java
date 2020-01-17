package edu.escuelaing.arep.ASE.app;


public class Node<T>
{
    private T element;
    private Node next;
    private Node prior;

    public Node(T element, Node prior, Node next){
        this.element = element;
        this.next = next;
        this.prior = prior;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrior() {
        return prior;
    }

    public void setPrior(Node prior) {
        this.prior = prior;
    }

    @Override
    public String toString() {
        return "Node [element=" + element + ", next=" + next + ", prior=" + prior + "]";
    }
}