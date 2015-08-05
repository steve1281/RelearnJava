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
    static int nextId = 0;
    
    final public int id;
    final public String firstName, lastName;
    //public int birthYear, birthMonth, birthDay;
    
    public Student(String fn, String ln) {
        id = nextId;
        nextId++;
        firstName = fn;
        lastName = ln;
    }
    String getFirstName() {
        return firstName;
    }
    String getLastName() {
        return lastName;
    }
    void registerForCourse(Course c) {
        c.registerStudent(this);
    }
    void unregisterForCourse(Course c) {
        c.unregisterStudent(this); 
    }
}