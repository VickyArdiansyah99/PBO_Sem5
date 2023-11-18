package pbo.jobsheet10.praktikum1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadOne implements Runnable {
    private final String name;
    public ThreadOne(String name) {
        this.name = name;
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + ": " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadOne.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
