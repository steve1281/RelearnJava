/*
 * This code is for the learning of Java
 * It is not, and is not intended to be, production grade code.   * 
 * Use at your own risk.  * 
 */
package chap4;

/**
 *
 * @author steve
 */
public class ForLoops {

    public void runner() {
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        // traditional for loop:
        for (int i=0;i< data.length;i++){
            System.out.println(data[i]);
        }
        // enhanced for loop 
        for (int i: data){
            System.out.println(i);
        }
    }
}
