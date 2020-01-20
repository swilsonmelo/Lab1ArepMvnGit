package edu.escuelaing.arep.ASE.app.utilities;

public class Node<T> {
    private T element;
    private Node<T> next;
    private Node<T> prior;

    public Node(T element, Node<T> prior, Node<T> next) {
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

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrior() {
        return prior;
    }

    public void setPrior(Node<T> prior) {
        this.prior = prior;
    }

    @Override
    public String toString() {
        return "Node [element=" + element.toString() + ", prior=" + ((prior != null) ? prior.getElement() : "None")
                + ", next=" + ((next != null) ? next.getElement() : "None") + "]";
    }

    public boolean equals(Node<T> node) {
        return this.element.equals(node.getElement());
    }
}