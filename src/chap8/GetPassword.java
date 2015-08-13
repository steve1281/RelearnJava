/*
 * This code is for the learning of Java
 * It is not, and is not intended to be, production grade code.   * 
 * Use at your own risk.  * 
 */
package chap8;

import java.io.Console;
import java.io.IOException;

/**
 *
 * @author steve
 */
public class GetPassword {
    public static void runner() throws IOException {
        Console c = System.console();
        if (c==null) {
            System.err.println("Console object is not available");
            System.exit(1);
        }
        String username = c.readLine("Enter in your name: ");
        char[] password = c.readPassword("Password: ");
        if (username.equals("admin")&& new String(password).equals("swordfish")){
            c.writer().println("Access granted");
        } else {
            c.writer().println("Access denied.");
        }
    }
}
