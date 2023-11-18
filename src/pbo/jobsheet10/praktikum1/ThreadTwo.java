package pbo.jobsheet10.praktikum1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadTwo extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + ": " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadTwo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
