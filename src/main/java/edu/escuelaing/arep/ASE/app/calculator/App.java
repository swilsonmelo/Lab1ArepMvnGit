package edu.escuelaing.arep.ASE.app.calculator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Iterator;

import edu.escuelaing.arep.ASE.app.utilities.LinkedList;

/**
 * App Class
 * @author Willson Melo
 */
public class App {
    public static void main(String[] args) throws Exception
    {
        LinkedList<Double> lklTestCase1 = makeLklWithTestCase("resources\\cases\\input1.txt");
        LinkedList<Double> lklTestCase2 = makeLklWithTestCase("resources\\cases\\input2.txt");

        NumberFormat formatter = new DecimalFormat("#0.00");

        Double meanTest1 = mean(lklTestCase1);
        Double meanTest2 = mean(lklTestCase2);

        
        System.out.println("Mean Test Case 1: " + formatter.format(meanTest1));
        System.out.println("Mean Test Case 2: " + formatter.format(meanTest2));

        Double standarDev1 = standardDeviation(lklTestCase1);
        Double standarDev2 = standardDeviation(lklTestCase2);

        System.out.println("Standard Deviation Test Case 1: " + formatter.format(standarDev1));
        System.out.println("Standard Deviation Test Case 2: " + formatter.format(standarDev2));        
    }

    /**
     * 
     * @param testCasePath the path of the test case
     * @return lkl LinkedList with the data obtained from the test case
     * @throws Exception
     */
    public static LinkedList<Double> makeLklWithTestCase(String testCasePath) throws Exception {
        LinkedList<Double> lkl = new LinkedList<Double>();
        File file = new File(testCasePath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        Double data;
        String st;
        st = br.readLine();        
        while( st != null){
            data = Double.parseDouble(st);
            lkl.add(data);
            //System.out.println(data);
            st = br.readLine();
        }  
        return lkl;
    }

     /**
     * Method that calculates LinkedList's mean
     * @param lkl LinkedList
     * @return res Mean value
     */
    public static Double mean(LinkedList<Double> lkl) {
        Double sum = 0.0;
        Iterator<Double> iterator = lkl.iterator();
        Double data;
        while (iterator.hasNext()) {
            data = iterator.next();
            sum += data;
        }
        //System.out.println(sum);
        //System.out.println(lkl.size());
        Double res = (sum / lkl.size());
        return res;
    }

    /**
     * Method that calculates LinkedList's standard deviation
     * @param lkl LinkedList
     * @return res as Standard deviation value
     */
    public static Double standardDeviation(LinkedList<Double> lkl){
        Double mean = mean(lkl);
        Double sum = 0.0;
        Iterator<Double> iterator = lkl.iterator();
        Double val;
        while( iterator.hasNext() ) {
             val = iterator.next() - mean;
             sum += val*val;
        }        
        //System.out.println(sum);
        sum /= lkl.size()-1;
        //System.out.println(sum);
        Double res = Math.sqrt(sum);
        return res;
    }


}


