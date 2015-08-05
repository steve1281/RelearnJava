/*
 * This code is for the learning of Java
 * It is not, and is not intended to be, production grade code.   * 
 * Use at your own risk.  * 
 */
package chap6;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author steve
 */
public class LoggerExample {
    private final static Logger logger =
            Logger.getLogger(LoggerExample.class.getName());
    private static FileHandler finerhandler = null;
    private static FileHandler warninghandler = null;
    
    public static void logIt() {
        try {
            finerhandler = new FileHandler("src/loggerExample_finer.log", false);
            warninghandler = new FileHandler("src/loggerExample_config.log", false);
           
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }
        finerhandler.setFormatter(new SimpleFormatter());
        finerhandler.setLevel(Level.FINER);

        warninghandler.setFormatter(new SimpleFormatter());
        warninghandler.setLevel(Level.CONFIG);

        logger.addHandler(finerhandler);
        logger.addHandler(warninghandler);
        logger.setLevel(Level.FINER);
        
    }
    
    public static void runner() {
        LoggerExample.logIt();
        
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
            logger.log(Level.SEVERE, "monthlyPension is too low.");
            
        }
        logger.log(Level.FINEST,"finest detailed message");
        logger.log(Level.FINER,"finer detailed message");
        logger.log(Level.FINE,"fine detailed message");
        logger.log(Level.CONFIG,"configuration detailed message");
        logger.log(Level.INFO,"informational detailed message");
        logger.log(Level.WARNING,"warning message");
        logger.log(Level.SEVERE,"severe message");
    }
    
    public static void recalculate(double fundAmount, double rate){
        logger.entering("LoggerExample", "recalculate");
        fundAmount = fundAmount * (1 + rate);
        logger.log(Level.INFO,"fundAmount = "+fundAmount);
        logger.exiting("LoggerExample","recalculate");
    }
            
}
