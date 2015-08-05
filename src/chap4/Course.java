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
    final int id;
    final String name;
    final HashSet<Student> registeredStudents =
            new HashSet<Student>();
    
    Course(String n) {
        id = nextId;
        nextId++;
        name = n;
    }
    String getName() {
        return name;
    }
    void registerStudent(Student s) {
        registeredStudents.add(s);
    }
    void unregisterStudent(Student s){
        registeredStudents.remove(s);
    }
    HashSet<Student> registeredStudents() {
        return registeredStudents;
    }
    int nrIfRegisteredStudents() {
        return registeredStudents.size();
    }
}
