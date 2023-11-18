package pbo.jobsheet10.praktikum2;

public class Main {
    public static void main(String[] args) {
        Generator generator = new Generator(10, 100);

        MyThread thread1 = new MyThread(generator);
        MyThread thread2 = new MyThread(generator);

        thread1.start();
        thread2.start();
    }
}
