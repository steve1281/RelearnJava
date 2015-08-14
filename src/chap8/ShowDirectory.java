/*
 * This code is for the learning of Java
 * It is not, and is not intended to be, production grade code.   * 
 * Use at your own risk.  * 
 */
package chap8;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author steve
 */
public class ShowDirectory {
    public static void runner() {
        Path folder = Paths.get("/");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(folder,"*")) {
            for (Path entry: stream){
                System.out.println(entry.getFileName());
            }
        } catch (IOException | DirectoryIteratorException x) {
            System.err.println("An error has occurred.");
        }
    }
}
