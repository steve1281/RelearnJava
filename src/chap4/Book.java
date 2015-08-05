/*
 * This code is for the learning of Java
 * It is not, and is not intended to be, production grade code.   * 
 * Use at your own risk.  * 
 */
package chap4;

/**
 *
 * @author steve
 */
public class Book {
   final static int DEFAULT_YEAR = 2014;  // java class constant
   
   public static int maxAmountOfPages = 500;
   
   public final String title;
   public String[] authors = new String[]{"Anonymous"};
   public int yearReleased = 2014, copiesSold=0, nrOfPages = 1400;
   
   public Book(String t) {
       this(t, DEFAULT_YEAR, 0);
   }
   public Book(String t, int r) {
       this(t, r, 0);
   }
   public Book(String t, int r, int s) {
       title = t;
       yearReleased = r;
       copiesSold = s;
   }
}
