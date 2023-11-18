package pbo.jobsheet10.asistensi;

class PrintNameThread1 implements Runnable {
    Thread thread;
    PrintNameThread1(String name) {
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

class TestThread1 {
    public static void main(String[] args) {
        new PrintNameThread1("A");
        new PrintNameThread1("B");
        new PrintNameThread1("C");
        new PrintNameThread1("D");
    }
}
