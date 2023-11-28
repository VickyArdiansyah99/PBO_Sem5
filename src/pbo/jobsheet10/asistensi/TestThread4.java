package pbo.jobsheet10.asistensi;

class TwoStrings1 {
    synchronized static void print(String str1, String str2) {
        System.out.print(str1);
        try {
            Thread.sleep(500);
        } catch (InterruptedException ie) {}
        System.out.println(str2);
    }
}

class PrintNameThread4 implements Runnable {
    Thread thread;
    String str1, str2;
    PrintNameThread4(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
        thread = new Thread(this);
        thread.start();
    }
    public void run() {
        TwoStrings1.print(str1, str2);
    }
}

class TestThread4 {
    public static void main(String[] args) {
        new PrintNameThread4("Hello ", "there");
        new PrintNameThread4("How are ", "you");
        new PrintNameThread4("Thank you ", "very much!");
    }
}