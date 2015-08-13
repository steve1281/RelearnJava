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
public class LineReverser {
    public static void runner(String [] args) {
        try (BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));){
            String line = null;
            while (true){
                line = reader.readLine();
                if (line == null || "".equals(line))
                    break;
                String reverse = new StringBuilder(line).reverse().toString();
                System.out.println(reverse);
                if (line.equals(reverse))
                    System.err.format("The string '%s' is a palindron! %n", line);
                
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
