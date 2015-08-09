/*
 * This code is for the learning of Java
 * It is not, and is not intended to be, production grade code.   * 
 * Use at your own risk.  * 
 */
package chap7;

import static java.lang.Math.PI;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author steve
 */
public class CircleTest {
    Circle instance = new Circle("blue", 5.0);
    
    public CircleTest() {
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

    /**
     * Test of calculateArea method, of class Circle.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        
        double expResult = 5.0 * 5.0 * PI;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of getRadius method, of class Circle.
     */
    @Test
    public void testGetRadius() {
        System.out.println("getRadius");
        
        double expResult = 5.0;
        double result = instance.getRadius();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setRadius method, of class Circle.
     */
    @Test
    public void testSetRadius() {
        System.out.println("setRadius");
        double radius = 10.0;
        Circle instance = new Circle("blue",5.0);
        instance.setRadius(radius);
        double result = instance.getRadius();
        double expResult = 10.0;
        assertEquals(expResult, result, 0.0);
    }
    
}
