/*
 * This code is for the learning of Java
 * It is not, and is not intended to be, production grade code.   * 
 * Use at your own risk.  * 
 */
package chap8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/**
 *
 * @author steve
 */
public class ShowGroceriesV3 {
    public static void runner() {
        try (
                Scanner sc = new Scanner(
                                new FileReader("groceries.txt"));
        ) {
                sc.useDelimiter(Pattern.compile("(, )|(\r\n)")); // DOS format
                sc.useLocale(Locale.ENGLISH);
                while (sc.hasNext()) {
                        String item = sc.next();
                        double price = sc.nextDouble();
                        System.out.format("Price of %s is: %.2f%n", item, price);
                }
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
    
}
