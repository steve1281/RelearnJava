/*
 * This code is for the learning of Java
 * It is not, and is not intended to be, production grade code.   * 
 * Use at your own risk.  * 
 */
package chap7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.contrib.java.lang.system.SystemOutRule;

/**
 *
 * @author steve
 */
public class EmployeeTest {
    
    Employee manager = new Employee("manager", null, 0);
    Employee employee = new Employee("employee", manager, 1);
    
    public EmployeeTest() {
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
     * Test of getManager method, of class Employee.
     */
    @Test
    public void testGetManager() {
        System.out.println("getManager");
        Employee instance =  employee;
        Employee expResult = manager;
        Employee result = instance.getManager();
        assertEquals(expResult, result);
    }

    /**
     * Test of displayName method, of class Employee.
     */
    @Test
    public void testDisplayName() {
        System.out.println("displayName");
        Employee instance = employee;
        String expResult = "Employee: employee";
        String result = instance.displayName();
        assertEquals(expResult, result);
    }
    
}
