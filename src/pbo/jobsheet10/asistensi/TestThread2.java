package pbo.jobsheet10.asistensi;

class PrintNameThread2 implements Runnable {
    Thread thread;
    PrintNameThread2(String name) {
        thread = new Thread(this, name);
        thread.start();
    }
    public void run() {
        String name = thread.getName();
        for (int i = 0; i < 100; i++) {
            System.out.print(name);
        }
    }
}

class TestThread2 {
    public static void main(String[] args) {
        PrintNameThread2 pnt1 = new PrintNameThread2("A");
        PrintNameThread2 pnt2 = new PrintNameThread2("B");
        PrintNameThread2 pnt3 = new PrintNameThread2("C");
        PrintNameThread2 pnt4 = new PrintNameThread2("D");
        System.out.println("Running threads...");
        try {
            pnt1.thread.join();
            pnt2.thread.join();
            pnt3.thread.join();
            pnt4.thread.join();
        } catch (InterruptedException ie) {
            System.out.println("Thread killed."); //dicetak terakhir
        }
    }
}
