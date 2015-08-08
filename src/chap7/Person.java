/*
 * This code is for the learning of Java
 * It is not, and is not intended to be, production grade code.   * 
 * Use at your own risk.  * 
 */
package chap7;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author steve
 */
public class Person {
    String name;
    LocalDate birthdate;
    
    public Person (String name, int year, int month, int day) {
        LocalDate tempBD = LocalDate.of(year,month, day);
        this.name = name;
        this.birthdate = tempBD;
    }
    public Person() {
        this("Unknown", 1900,1 ,1);
    }
    public Person(String name){
        this(name, 1900, 1, 1);
    }
    public void printName(){
        System.out.println(this.name);
    }
    public int calculateAge(){
        Period p = Period.between(this.birthdate, LocalDate.now());
        return p.getYears();
    }
    public int calculateAge(LocalDate date){
        Period p = Period.between(this.birthdate, date);
        return p.getYears();
    }

    public int calculateAge(int year, int month, int day){
        Period p = Period.between(this.birthdate, LocalDate.of(year, month, day));
        return p.getYears();
    }
    public String getName()
    {
        return this.name;
    }
}
