package com.talos.invertedindex;

import java.util.Arrays;

import com.talos.invertedindex.InvertedIndex;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
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
    
    public void testTimesMusic(){
    	InvertedIndex invertedIndex = new InvertedIndex();
    	String[] results = invertedIndex.get("music"); 
    	int result = results.length;
    	assertEquals(2, result);
    }
    
    public void testTextMusic(){
    	String [] expectedArray = new String[] {"A brilliant, festive study "
    			+ "of JS Bach uses literature and painting to illuminate"
    			+ " his 'dance-impregnated' music, writes Peter Conrad",
    			"Another book with music related content" };
    	String expected = Arrays.toString(expectedArray);
    	
    	InvertedIndex invertedIndex = new InvertedIndex();
    	String[] results = invertedIndex.get("music"); 
    	String real = Arrays.toString(results);
    	
    	assertEquals(expected, real);
    }
}
