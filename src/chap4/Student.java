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
public class Student {
    public int id;
    public String firstName;
    public String lastName;
    public int birthYear, birthMonth, birthDay;
    
    boolean isBirthday() {
        // Return true if it's the student's birthday today,
        return false;
    }
    void giveWarning(boolean isFinalWarning) {
        // You really need to study harder!
    }
    
    int numberOfFriends() {
        // Return the number of friends the student has
        return 0;
    }
}
