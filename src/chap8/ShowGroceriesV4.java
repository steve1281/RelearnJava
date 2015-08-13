/*
 * This code is for the learning of Java
 * It is not, and is not intended to be, production grade code.   * 
 * Use at your own risk.  * 
 */
package chap8;

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
public class ShowGroceriesV4 {
    public static void runner() {
        List<String> groceries = new ArrayList<>();
        try {
            groceries = Files.readAllLines( Paths.get("groceries.txt"),
                    Charset.defaultCharset());
        } catch (IOException ex) {
            //Logger.getLogger(ShowGroceriesV4.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        for (String item : groceries) {
            System.out.println("Don't forget to pickup: " + item);
        }
    }
}
