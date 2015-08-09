/*
 * This code is for the learning of Java
 * It is not, and is not intended to be, production grade code.   * 
 * Use at your own risk.  * 
 */
package chap8;

/**
 *
 * @author steve
 */
public class FormattingOutput {
    public static void runner() {
        /* System.out is a PrintStream which is an OutputStream */
        System.out.write(50);
        System.out.write((int)'\n'); 
        System.out.print("Text without a newline");
        System.out.print("\r\nYou can enter a newline\r\n");
        System.out.println("or autimatically add it.");
        int number = 10;
        double othernumber= 1.1234;
        System.out.println("Using + is usually ok" + number + ", "+othernumber);
        System.out.format("but format %d %3.2f %n ", number, othernumber);
        System.out.format("more examples: %3$s: %2$+020.10f, %1$d%n",
                number, othernumber, "example");
    }
}
