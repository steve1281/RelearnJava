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

/**
 *
 * @author steve
 */
public class ShapeTest {
    Shape instance = new ShapeImpl();
    
    public ShapeTest() {
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
     * Test of getColor method, of class Shape.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        
        String expResult = "blue";
        String result = instance.getColor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setColor method, of class Shape.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        String color = "green";
        String expResult = "green";
        instance.setColor(color);
        String result = instance.getColor();
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateArea method, of class Shape.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        
        double expResult = 10.0;
        double result = instance.calculateArea();
        assertEquals(expResult, result,0.0);
    }

    public class ShapeImpl extends Shape {

        public ShapeImpl() {
            super("blue");
        }

        public double calculateArea() {
            return 10.0;
        }
    }
    
}
