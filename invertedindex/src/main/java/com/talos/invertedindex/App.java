package com.talos.invertedindex;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        InvertedIndex invertedIndex= new InvertedIndex();
        System.out.println( Arrays.toString(invertedIndex.get("music")));
        System.out.println( Arrays.toString(invertedIndex.get("Grisham's")));
    }
}
