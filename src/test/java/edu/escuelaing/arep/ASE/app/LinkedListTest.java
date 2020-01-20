package edu.escuelaing.arep.ASE.app;

import edu.escuelaing.arep.ASE.app.utilities.LinkedList;
import edu.escuelaing.arep.ASE.app.utilities.Node;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 * 
 * @param <T>
 * 
 */
public class LinkedListTest<T> extends TestCase {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public LinkedListTest(String testName) {
        super(testName);

    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(LinkedListTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }

    public void testCreateAEmptyLinkedList() {
        LinkedList<T> lkl = new LinkedList<T>();
        assertTrue(lkl.isEmpty());
    }

    public void testCreateALinkedListWithData() {
        Double data = 5.0;
        LinkedList<T> lkl = new LinkedList<T>((T) data);
        // System.out.println(lkl.get(0).getClass());
        assertTrue(data.equals(lkl.get(0)));
    }

    public void testAddAndGetDataLinkedList() {
        LinkedList<T> lkl = new LinkedList<T>();
        Double[] data = { 5.0, 2.0, 3.0, 3.7555, 4522.1, 5156.35 };
        for (Double d : data) {
            lkl.add((T) d);
        }
        boolean flag = true;
        for (int i = 0; i < data.length; i++) {
            T currentData = lkl.get(i);
            // System.out.println(currentData);
            flag &= data[i].equals(currentData);
        }
        // System.out.println(flag);
        assertTrue(flag);
    }

    public void testAddAndGetDataWithIndexLinkedList() {
        LinkedList<T> lkl = new LinkedList<T>();
        Double[] data = { 5.0, 2.0, 3.0, 3.7555 };
        for (Double d : data) {
            lkl.add((T) d);
        }
        Double newData = 3.1416;
        lkl.add(1, (T) newData);
        T currentData = lkl.get(1);
        // System.out.println(currentData);
        assertTrue(newData.equals(currentData));
    }

    public void testAddGetNodeAndTheOrderLinkedList() {
        LinkedList<T> lkl = new LinkedList<T>();
        Double[] data = { 5.0, 2.0, 3.0, 3.7555 };
        for (Double d : data) {
            lkl.add((T) d);
        }
        Double newData1 = 3.1416;
        lkl.add(0, (T) newData1);
        Double newData2 = 1.23456;
        lkl.add(4, (T) newData2);
        Double newData3 = 2.34567;
        lkl.add(0, (T) newData3);
        Double[] newData = { 2.34567, 3.1416, 5.0, 2.0, 3.0, 1.23456, 3.7555 };
        boolean flag = true;
        for (int i = 0; i < lkl.size(); i++) {
            Node<T> currentData = lkl.getNode(i);
            // System.out.println("Node " + i + " " + currentData);
            flag &= currentData.getElement().equals(newData[i]);
        }
        assertTrue(flag);
    }

    public void testRemoveMiddleElementWithIndexLinkedList() {
        Double[] data = { 0.1, 1.0, 2.2, 3.3, 3.1416, 10.0 };
        LinkedList lkl = new LinkedList<T>();
        for (Double element : data) {
            lkl.add(element);
        }
        int eliminatedIndex = 2;
        lkl.remove(eliminatedIndex);
        boolean flag = true;
        for (int i = 0; i < lkl.size(); i++) {
            Node<T> currentNode = lkl.getNode(i);
            // System.out.print(currentNode + " ");
            if (i >= eliminatedIndex) {
                flag &= currentNode.getElement().equals(data[i + 1]);
                // System.out.println(data[i+1]);
            } else {
                flag &= currentNode.getElement().equals(data[i]);
                // System.out.println(data[i]);
            }
        }
        assertTrue(flag);
    }


    public void testRemoveHeadLinkedList(){
        Double[] data = { 0.1, 1.0, 2.2, 3.3, 3.1416, 10.0 };
        LinkedList lkl = new LinkedList<T>();
        for (Double element : data) {            
            lkl.add(element);
        }
        lkl.removeHead();
        boolean flag = true;
        for(int i = 0; i < lkl.size(); i++){
            Node<T> currentNode = lkl.getNode(i);
            //System.out.println(currentNode + " " + data[i+1]);
            flag &= currentNode.getElement().equals(data[i+1]);
        }
        assertTrue(flag);
    }

}