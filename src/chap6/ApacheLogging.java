/*
 * This code is for the learning of Java
 * It is not, and is not intended to be, production grade code.   * 
 * Use at your own risk.  * 
 */
package chap6;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import org.apache.logging.log4j.core.Logger;


/**
 *
 * @author steve
 */
public class ApacheLogging {
    
    static final Logger log = 
            LogManager.getLogger(ApacheLogging.class.getName());
    
    public static void runner() {

        int age=60;
        double retirementFund = 10000;
        int yearsInRetirement = 20;
        String name = "Joe Smotgh";
        for (int i = age; i <= 65; i++) {
            recalculate(retirementFund, 0.1);
        }
        double monthlyPension = retirementFund/yearsInRetirement/12;
        System.out.println(name +" will hav $"+ monthlyPension
                + " per month for retirement.");
        if (monthlyPension <100) {
            p("monthlyPension is too low.");
            
        }
        log.trace("finely detailed TRACE message");
        log.debug("DEBUG  message");
        log.info("INFO message");
        log.warn("WARN message");
        log.error("ERROR message");
        log.fatal("FATAL message");
        
    }
    
    public static void recalculate(double fundAmount, double rate){
        log.entry();
        fundAmount = fundAmount * (1 + rate);
        log.info("fundAmount="+fundAmount);
        log.exit();
    }
    
    public static void p(String s){
        System.out.println(s);
    }
}