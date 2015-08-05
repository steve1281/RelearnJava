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
public class Switch {
    
    public void runner() {
        char initial;
        String myName = "Bob";
        switch (myName) {
            case "Ann": initial = 'A' ; break;
            case "Bob": initial = 'B' ; break;
            case "Claire": initial = 'C'; break;
            default: initial = '?'; break;
        }
        System.out.println("Initial is:" + initial);
    }
    
}
