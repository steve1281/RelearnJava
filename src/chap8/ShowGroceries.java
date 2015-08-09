/*
 * This code is for the learning of Java
 * It is not, and is not intended to be, production grade code.   * 
 * Use at your own risk.  * 
 */
package chap8;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author steve
 */
public class ShowGroceries {
    public static void runner(){
        BufferedReader br = null;
        FileReader fr = null;
        try {
            fr = new FileReader("/home/steve/java/HelloWorld/src/groceries.txt");
            br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null){
                System.out.println("Don't forgot to pickup: " + line);
            }
        } catch (Exception x){
            x.printStackTrace();
        } finally {
            if (fr != null) {
                try {br.close();} catch (Exception e) {e.printStackTrace();}
                try {fr.close();} catch (Exception e) {e.printStackTrace();}
            }
        }
    }
}
