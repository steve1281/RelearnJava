
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import chap4.Student;
import chap4.Book;
        


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
        
        Student firstStudent  = new Student("Marc","Smith");
        Student secondStudent = new Student("Sophie","Smith");
        
        System.out.println("second student is "+secondStudent.firstName);
        
        
        Book book1= new Book("Beginnaing Java"), book2 = new Book("Catcher in the Rye");

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
        
        
        
        
                
    }
    
}
