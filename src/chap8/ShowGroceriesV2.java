/*
 * This code is for the learning of Java
 * It is not, and is not intended to be, production grade code.   * 
 * Use at your own risk.  * 
 */
package chap8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author steve
 */
public class ShowGroceriesV2 {
    public static void runner() {
        
        List<String> groceries = new ArrayList<>();
        
        try {
            groceries = Files.readAllLines(
                Paths.get("groceries.txt"), 
                    Charset.defaultCharset());
        } catch (IOException | SecurityException e) {
            e.printStackTrace();
        }
        for (String item : groceries) {
            System.out.println("Don't forgot to pickup: " + item);    
        }
        
    }    
}
