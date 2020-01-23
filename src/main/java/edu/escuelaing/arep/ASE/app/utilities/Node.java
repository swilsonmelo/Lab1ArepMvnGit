package edu.escuelaing.arep.ASE.app.utilities;



/**
 * 
 * Node Class
 * @author Willson Melo
 *
 * @param <T> the type of elements returned by this node
 */

public class Node<T> {
    private T element;
    private Node<T> next;
    private Node<T> prior;

    /**
     * Constructs a Node
     * @param element node element
     * @param prior prior node
     * @param next next node
     */
    public Node(T element, Node<T> prior, Node<T> next) {
        this.element = element;
        this.next = next;
        this.prior = prior;
    }

    /**
     * Returns the node element
     * @return node element
     */
    public T getElement() {
        return element;
    }

    /**
     * Replaces the node element
     * @param element new node element
     */
    public void setElement(T element) {
        this.element = element;
    }

    /**
     * Returns the next node
     * @return next node
     */
    public Node<T> getNext() {
        return next;
    }

    /**
     * Replaces the next node
     * @param next new next node
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }

    /**
     * Returns the prior node
     * @return prior node
     */
    public Node<T> getPrior() {
        return prior;
    }

    /**
     * Replaces the prior node
     * @param prior new prior node
     */
    public void setPrior(Node<T> prior) {
        this.prior = prior;
    }

    /**
     * Returns a string representation of this node
     */
    @Override
    public String toString() {
        return "Node [element=" + element.toString() + ", prior=" + ((prior != null) ? prior.getElement() : "None")
                + ", next=" + ((next != null) ? next.getElement() : "None") + "]";
    }

    /**
     * Compares the specified node element with this element
     * @param node node to be compared
     * @return  true if the specified node element is equal to this element
     */
    public boolean equals(Node<T> node) {
        return this.element.equals(node.getElement());
    }
}