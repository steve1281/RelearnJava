/*
 * This code is for the learning of Java
 * It is not, and is not intended to be, production grade code.   * 
 * Use at your own risk.  * 
 */
package helloworld;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.matchers.JUnitMatchers;

/**
 *
 * @author steve
 */
public class GoodByeWorldTest {
    
    public GoodByeWorldTest() {
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
     * Test of sayIt method, of class GoodByeWorld.
     */
    @Test
    public void testSayIt() {
        System.out.println("sayIt");
        GoodByeWorld instance = new GoodByeWorld();
        instance.sayIt();
        assertThat(systemOutRule.getLog(), JUnitMatchers.containsString("goodbye"));        
    }
    
}
