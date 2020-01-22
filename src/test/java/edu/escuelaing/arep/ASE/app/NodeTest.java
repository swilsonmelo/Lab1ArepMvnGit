package edu.escuelaing.arep.ASE.app;

import edu.escuelaing.arep.ASE.app.utilities.Node;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class NodeTest<T> extends TestCase {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public NodeTest(String testName) {
        super(testName);

    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(NodeTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {        
        assertTrue(true);
    }

    public void testCreateNodeAndGetElement(){
        Double element = 5.0;
        Node<T> node = new Node<T>((T) element, null, null);
        assertTrue(element.equals(node.getElement()));
    }

    public void testEquals(){
        Double element = 5.0;
        Node<T> node1 = new Node<T>((T) element, null, null);
        Node<T> node2 = new Node<T>((T) element, null, null);
        assertTrue(node1.equals(node2));
    }

    public void testGetNextAndSetNext(){
        Double element = 5.0;
        Node<T> node1 = new Node<T>((T) element, null, null);
        element = 6.0;
        Node<T> node2 = new Node<T>((T) element, null, null);
        node1.setNext(node2);
        //System.out.println(node1);
        assertTrue(node1.getNext().equals(node2));
    }

    public void testGetPriorAndSetPrior(){
        Double element = 5.0;
        Node<T> node1 = new Node<T>((T) element, null, null);
        element = 6.0;
        Node<T> node2 = new Node<T>((T) element, null, null);
        node1.setPrior(node2);
        //System.out.println(node1);
        assertTrue(node1.getPrior().equals(node2));
    }

}