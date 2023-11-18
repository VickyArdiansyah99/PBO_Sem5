package pbo.jobsheet10.praktikum2;

public class MyThread extends Thread {
    private Generator generator;

    public MyThread(Generator generator) {
        this.generator = generator;
    }

    @Override
    public void run() {
        generator.generateRandomNumber(getName());
    }
}
