/*
 * This code is for the learning of Java
 * It is not, and is not intended to be, production grade code.   * 
 * Use at your own risk.  * 
 */
package chap7;
import static org.junit.Assert.*;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;
import org.apache.commons.io.output.TeeOutputStream;
import org.junit.matchers.JUnitMatchers;

/**
 *
 * @author steve
 */
public class PersonTest {
    
    public PersonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    /**
     * Test of printName method, of class Person.
     */
    @Test
    public void testPrintName() {
        System.out.println("printName");
        Person instance = new Person("Steve Smith");
        instance.printName();
        assertThat(systemOutRule.getLog(), JUnitMatchers.containsString("Steve Smith"));        
    }

    /**
     * Test of calculateAge method, of class Person.
     */
    @Test
    public void testCalculateAge_0args() {
        System.out.println("calculateAge");
        Person instance = new Person();
        int expResult = (Period.between(LocalDate.of(1900,1,1),LocalDate.now())).getYears();
        int result = instance.calculateAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateAge method, of class Person.
     */
    @Test
    public void testCalculateAge_LocalDate() {
        System.out.println("calculateAge");
        LocalDate date = LocalDate.of(1967,6,1);
        Person instance = new Person("Steve Smith", 1967, 6, 1);
        int expResult = (Period.between(date, LocalDate.now())).getYears();;
        int result = instance.calculateAge(LocalDate.now());
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateAge method, of class Person.
     */
    @Test
    public void testCalculateAge_3args() {
    
        int year = 2015;
        int month = 6;
        int day = 1;
        Person instance = new Person("Steve Smith", 1967,6,1);
        int expResult = 48;

        int result = instance.calculateAge(year, month, day);
        assertEquals(expResult, result);
    }
    
}
