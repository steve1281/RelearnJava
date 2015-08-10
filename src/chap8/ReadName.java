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
public class ReadName {
    public static void runner() {
        try(
            BufferedReader reader = new BufferedReader( new InputStreamReader (System.in));
        ) {
            System.out.println("What is your name? ");
            String name = reader.readLine();
            if (name.trim().equals(""))
                throw new IllegalArgumentException();
            System.out.println("Welcome: " + name);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: name cannot be blank!");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
