
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import Chap4.Student;
        


/**
 *
 * @author steve
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome back to Java Steve :-)");
        // create an instance of GoodByWorld
        GoodByeWorld bye = new GoodByeWorld();
        // and then open and run
        bye.sayIt();
        
        Student firstStudent  = new Student();
        Student secondStudent = new Student();
        firstStudent.id = 1;
        firstStudent.firstName = "Marc";
        secondStudent.id = 2;
        secondStudent.firstName  = "Sophie";
        
        System.out.println("second student is "+secondStudent.firstName);
        
                
    }
    
}
