package pbo.jobsheet09.asistensi;

public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("Di dalam throwOne.");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Tertangkap " + e);
        }
    }
}
