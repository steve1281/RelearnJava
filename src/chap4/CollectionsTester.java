/*
 * This code is for the learning of Java
 * It is not, and is not intended to be, production grade code.   * 
 * Use at your own risk.  * 
 */
package chap4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author steve
 */
public class CollectionsTester {
    public void runner() {
        ArrayList<String> listOfStrings = new ArrayList<String>();
        listOfStrings.add("first item");
        listOfStrings.add("second item");
        listOfStrings.add("third item");
        listOfStrings.add("fourth item");
        listOfStrings.remove(0); // remove the first item
        
        HashSet<Integer> setOfIntegers = new HashSet<Integer>();
        setOfIntegers.add(1);
        setOfIntegers.add(1);
        setOfIntegers.add(2);
        setOfIntegers.remove(2);        
        
        HashMap<String, Integer> mapOfStringToInteger =
                new HashMap<String, Integer>();
        mapOfStringToInteger.put("Alice", 4);
        mapOfStringToInteger.put("Bob", 3);
        mapOfStringToInteger.remove("Alice");
        
    }
    
}
