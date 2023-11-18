package pbo.jobsheet10.praktikum1;

public class Praktikum1 {
    public static void main(String[] args) {
        Thread t = new Thread(new ThreadOne("Thread Satu"));
        t.start();
        ThreadTwo t2 = new ThreadTwo();
        t2.setName("Thread Dua");
        t2.start();
    }
}
