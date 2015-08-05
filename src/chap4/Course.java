/*
 * This code is for the learning of Java
 * It is not, and is not intended to be, production grade code.   * 
 * Use at your own risk.  * 
 */
package chap4;
import java.util.HashSet;

/**
 *
 * @author steve
 */
public class Course {
    static int nextId = 0;
    public final int id;
    public final String name;
    public final HashSet<Student> registeredStudents =
            new HashSet<Student>();
    
    public Course(String n) {
        id = nextId;
        nextId++;
        name = n;
    }
    public String getName() {
        return name;
    }
    public void registerStudent(Student s) {
        registeredStudents.add(s);
    }
    public void unregisterStudent(Student s){
        registeredStudents.remove(s);
    }
    public HashSet<Student> registeredStudents() {
        return registeredStudents;
    }
    public int nrOfRegisteredStudents() {
        return registeredStudents.size();
    }
}
