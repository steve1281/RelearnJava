/*
 * This code is for the learning of Java
 * It is not, and is not intended to be, production grade code.   * 
 * Use at your own risk.  * 
 */
package chap7;

import java.math.BigDecimal;
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
public class AccountTest {
    // create a default account to be used.
    Account instance = new Account("Steve","10.00");

    public AccountTest() {
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
     * Test of getName method, of class Account.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        
        String expResult = "Steve";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAmount method, of class Account.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        
        BigDecimal expResult = new BigDecimal("10.00");
        BigDecimal result = instance.getAmount();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Account.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String newName = "Bobby";
        
        instance.setName(newName);
        String results = instance.getName();
        String expResult = "Bobby";
        assertEquals(expResult, results);
    }

    /**
     * Test of withdraw method, of class Account.
     */
    @Test
    public void testWithdraw() {
        System.out.println("withdraw");
        String withdrawl = "5.00";
        
        instance.withdraw(withdrawl);
        BigDecimal result = instance.getAmount();
        BigDecimal expResult = new BigDecimal("5.00");
        assertEquals(expResult, result);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testWithdrawWithException() {
        System.out.println("withdraw exception");
        String withdrawl = "15.00";
        instance.withdraw(withdrawl);    
    }
    
    /**
     * Test of deposit method, of class Account.
     */
    @Test
    public void testDeposit() {
        System.out.println("deposit");
        String deposit = "5.00";
        instance.deposit(deposit);
        BigDecimal result = instance.getAmount();
        BigDecimal expResult = new BigDecimal("15.00");
        assertEquals(expResult, result);
    }
    /**
     * Test of deposit method, of class Account.
     */
    @Test(expected=IllegalArgumentException.class)
    public void testDepositWithException() {
        System.out.println("deposit exception");
        String deposit = "-15.00";
        instance.deposit(deposit);
    }
    
}
