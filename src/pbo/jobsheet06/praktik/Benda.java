package pbo.jobsheet06.praktik;

public abstract class Benda {
    static int staticVariable = 0;
    int nonStaticVariable = 0;

    public static void ststicMetthod() {
        System.out.println("Ini adalah metode static di kelas Benda.");
    }

    public void nonStaticMethod() {
        System.out.println("Ini adalah metode non-static di kelas benda.");
    }
}
