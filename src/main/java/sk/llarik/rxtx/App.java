package sk.llarik.rxtx;

import gnu.io.CommPortIdentifier;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        //System.setProperty("gnu.io.rxtx.SerialPorts", "/dev/ttyACM0");
                
        Enumeration e = CommPortIdentifier.getPortIdentifiers();
        while (e.hasMoreElements()) {
            try {
                System.out.println(((CommPortIdentifier) e.nextElement()).getName());
            } catch (NoSuchElementException n) {
                n.printStackTrace();
            }
        }
    }
}
