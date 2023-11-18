package pbo.jobsheet10.asistensi;

class TwoStrings2 {
    synchronized static void print(String str1, String str2) {
        System.out.print(str1);
        try {
            Thread.sleep(500);
        } catch (InterruptedException ie) {}
        System.out.println(str2);
    }
}

class PrintNameThread5 implements Runnable {
    Thread thread;
    String str1, str2;
    TwoStrings2 ts;
    PrintNameThread5(String str1, String str2, TwoStrings2 ts) {
        this.str1 = str1;
        this.str2 = str2;
        this.ts = ts;
        thread = new Thread(this);
        thread.start();
    }
    public void run() {
        synchronized (ts) {
            TwoStrings1.print(str1, str2);
        }
    }
}

class TestThread5 {
    public static void main(String[] args) {
        TwoStrings2 ts = new TwoStrings2();
        new PrintNameThread5("Hello ", "there", ts);
        new PrintNameThread5("How are ", "you", ts);
        new PrintNameThread5("Thank you ", "very much!", ts);
    }
}
