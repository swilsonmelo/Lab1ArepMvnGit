package edu.escuelaing.arep.ASE.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 * 
 * @param <T>
 */
public class AppTest<T> 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testCreateAEmptyLinkedList() {
        LinkedList<T> lkl = new LinkedList<T>();
        int size = lkl.size();
        assertTrue( size == 0 );        
    }

    public void testCreateALinkedListWithData() {
        Double data = 5.0;
        LinkedList<T> lkl = new LinkedList<T>((T) data);
        //System.out.println(lkl.get(0).getClass());
        assertTrue( data.equals(lkl.get(0) ));        
    }

    public void testAddToLinkedList(){        
        assertTrue( true );
    }
}
