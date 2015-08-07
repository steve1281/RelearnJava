/*
 * This code is for the learning of Java
 * It is not, and is not intended to be, production grade code.   * 
 * Use at your own risk.  * 
 */
package chap7;

/**
 *
 * @author steve
 */
public class AccountManager {

    public static void runner(){
        Account myAccount = new Account("FirstAccount","10.00");
        System.out.println("Account created:" + myAccount.getName());
        System.out.println("With balance:" + myAccount.getAmount());
        
        try {
            myAccount.withdraw("20.00");
           
        } catch(IllegalArgumentException e) {
            System.out.println("Invalid Withdrawl");
        } finally {
            System.out.println("New Balance: "+ myAccount.getAmount());
        }
    }
}
