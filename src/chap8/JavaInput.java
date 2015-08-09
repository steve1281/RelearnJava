/*
 * This code is for the learning of Java
 * It is not, and is not intended to be, production grade code.   * 
 * Use at your own risk.  * 
 */
package chap8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author steve
 */
public class JavaInput {
    public static void runner() {
        System.out.println("what is your name: ");
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String name;
        try {
            name = br.readLine();
            
        } catch (IOException e) {
            name = "?";
            e.printStackTrace();
        } finally {
            try { br.close(); } catch (IOException e) { e.printStackTrace(); }
            
        }
        System.out.println("Welcome, " + name);
    }
}
