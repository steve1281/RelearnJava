/*
 * This code is for the learning of Java
 * It is not, and is not intended to be, production grade code.   * 
 * Use at your own risk.  * 
 */
package chap8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author steve
 */
public class FileCopier {
    public static void runner() {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("groceries.txt");
            out = new FileOutputStream("groceries (copy).txt");
            int c;
            while ((c=in.read()) != -1){
                out.write(c);
                System.out.print(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
            
        } finally {
            if (in !=null) try { in.close();} catch (IOException e) {
                e.printStackTrace();
            }
            if (out != null) try { out.close();} catch (IOException e) {
                e.printStackTrace();
            }
                
        }
            
    }
}
