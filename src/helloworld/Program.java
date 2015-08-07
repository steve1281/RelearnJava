
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import chap4.Student;
import chap4.Book;
import chap4.Course;
import chap4.StringTester;        
import chap4.CollectionsTester;
import chap4.ForLoops;
import chap4.Switch;
import chap6.ApacheLogging;
import chap6.LoggerExample;
import chap7.AccountManager;

/**
 *
 * @author steve
 */
public class Program {

    
    public static void p(String l) {
        System.out.println(l);
    }
    
    public static void studentCourse() {
        p("Welcome to the course administration program");
        p("--------------------------------------------");
        p("");
        p("Creating two courses.");
        Course courseA = new Course("First Course");
        Course courseB = new Course("Second Course");
        p(" - courseA ID is" + courseA.id);
        p(" - courseA Name is "+ courseA.name);
        p(" - courseB ID is" + courseB.id);
        p(" - courseB Name is "+ courseB.name);
        p("");
        p("Creating two students");
        Student student1  = new Student("Marc","Smith");
        Student student2 = new Student("Sophie","Smith");
        p(" - student1 ID is:"+student1.id);
        p(" - student1 Name is:"+student1.getFirstName() + " " + student1.getLastName());
        p(" - student2 ID is:"+student2.id);
        p(" - student2 Name is:"+student2.getFirstName() + " " + student2.getLastName());
        p("");
        p("Registering for courses.");
        student1.registerForCourse(courseA);
        student1.registerForCourse(courseB);
        courseA.registerStudent(student2);
        p("- courseA number of students: "+courseA.nrOfRegisteredStudents());
        p("- courseB number of students: "+courseB.nrOfRegisteredStudents());
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        p("You have supplied "+args.length+" arguments..");
        for (int i=0;i<args.length;i++) {
            p("Argument "+i+" equals: "+ args[i]);
        }
        p("");
        
        // static call to runner
        HelloWorld.runner();
        
        // create an instance of GoodByWorld
        GoodByeWorld bye = new GoodByeWorld();
        // and then open and run
        bye.sayIt();
        
        Book book1= new Book("Beginning Java"), book2 = new Book("Catcher in the Rye");

        book1.authors = new String[] {
            "Bart Baesens",
            "Aimee Backiel",
            "Seppe vanden Brouke"
        };

        book2.authors = new String[] {"J.D. Salinger"};
        
        // example
        Book superLargeBook = new Book("Super Large Boring Book");
        System.out.println("I have a book here with the title:" + superLargeBook.title);
        System.out.println("Written by:" + superLargeBook.authors);
        System.out.println("Released in:" + superLargeBook.yearReleased);
        System.out.println("With number of pages:" + superLargeBook.nrOfPages);
        
        System.out.println("However, we only support book with max. pages: " + Book.maxAmountOfPages);
        Book.maxAmountOfPages = 2000;
        System.out.println("OK, increasing the max page count: " + Book.maxAmountOfPages);
        
        studentCourse();
        
        //StringTester st = new StringTester();
        //st.runner();
        
        CollectionsTester ct = new CollectionsTester();
        ct.runner();
        
        ForLoops fl = new ForLoops();
        fl.runner();
        
        Switch sw = new Switch();
        sw.runner();
        
        //LoggerExample lg = new LoggerExample();
        //lg.runner();

        ApacheLogging.runner();
            
        AccountManager.runner();
    }
    
}
