/*
 * This code is for the learning of Java
 * It is not, and is not intended to be, production grade code.   * 
 * Use at your own risk.  * 
 */
package chap8;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author steve
 */
public class ShowGroceriesV5 {
   public static void runner() {
       Path file = Paths.get("groceries.txt");
       try (BufferedReader reader = Files.newBufferedReader(file)) {
           String line = null;
           while ((line = reader.readLine()) != null) {
               System.out.println(line);
           }
       } catch (IOException x) {
           System.err.println("Something went wrong");
       }
   }    
}
