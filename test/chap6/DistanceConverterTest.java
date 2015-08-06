/*
 * This code is for the learning of Java
 * It is not, and is not intended to be, production grade code.   * 
 * Use at your own risk.  * 
 */
package chap6;

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
public class DistanceConverterTest {
    double feet=0;
    double meters=0;
    double inches =0;
    double cm=0;
    
    public DistanceConverterTest() {
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
     * Test of convertFeettoMeters method, of class DistanceConverter.
     */
    @Test
    public void testConvertFeettoMeters() {
        System.out.println("convertFeettoMeters");
        double feet = 1.0;
        double expResult = 0.3048;
        double result = DistanceConverter.convertFeettoMeters(feet);
        assertEquals(expResult, result, 0.001);  // expected, actual, margin for error.
    }

    /**
     * Test of convertMeterstoFeet method, of class DistanceConverter.
     */
    @Test
    public void testConvertMeterstoFeet() {
        System.out.println("convertMeterstoFeet");
        double meters = 1.0;
        double expResult = 3.281;
        double result = DistanceConverter.convertMeterstoFeet(meters);
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of convertFeettoInches method, of class DistanceConverter.
     */
    @Test
    public void testConvertFeettoInches() {
        System.out.println("convertFeettoInches");
        double feet = 1.0;
        double expResult = 12.0;
        double result = DistanceConverter.convertFeettoInches(feet);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of convertInchestoFeet method, of class DistanceConverter.
     */
    @Test
    public void testConvertInchestoFeet() {
        System.out.println("convertInchestoFeet");
        double inches = 12.0;
        double expResult = 1.0;
        double result = DistanceConverter.convertInchestoFeet(inches);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of convertCmtoFeet method, of class DistanceConverter.
     */
    @Test
    public void testConvertCmtoFeet() {
        System.out.println("convertCmtoFeet");
        double cm = 10.0;
        double expResult = 0.3281;
        double result = DistanceConverter.convertCmtoFeet(cm);
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of convertFeettoCm method, of class DistanceConverter.
     */
    @Test
    public void testConvertFeettoCm(){         // TODO review the generated test code and remove the default call to fai
        System.out.println("convertFeettoCm");
        double feet = 1.0;
        double expResult = 30.48;
        double result = DistanceConverter.convertFeettoCm(feet);
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of convertCmtoInches method, of class DistanceConverter.
     */
    @Test
    public void testConvertCmtoInches() {
        System.out.println("convertCmtoInches");
        double cm = 10.0;
        double expResult = 3.9371;
        double result = DistanceConverter.convertCmtoInches(cm);
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of convertInchestoCm method, of class DistanceConverter.
     */
    @Test
    public void testConvertInchestoCm() {
        System.out.println("convertInchestoCm");
        double inches = 10.0;
        double expResult = 25.4;
        double result = DistanceConverter.convertInchestoCm(inches);
        assertEquals(expResult, result, 0.001);
    }
    
}
