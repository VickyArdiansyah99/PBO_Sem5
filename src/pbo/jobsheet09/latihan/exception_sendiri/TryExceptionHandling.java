package pbo.jobsheet09.latihan.exception_sendiri;

public class TryExceptionHandling {
    public static int hitungFaktorial(int n) throws CreateExceptionHandling {
        if (n < 0) {
            throw new CreateExceptionHandling("Bilangan tidak boleh negatif", n);
        }
        int hasil = 1;
        for (int i = n; i >= 1; i--) {
            hasil *= i;
        }
        return hasil;
    }

    public static void main(String[] args) {
        System.out.println("\n****** MEMBUAT CLASS EXCEPTION SENDIRI ******\n");
        try {
            System.out.println("Pada saat menghitung 5!");
            System.out.println("Hasil = " + hitungFaktorial(5));
            System.out.println("\nPada saat menghitung -5!");
            System.out.println("Hasil = " + hitungFaktorial(-5));
        } catch (CreateExceptionHandling exc) {
            System.err.println("Bilangan = " + exc.getBilangan());
            exc.printStackTrace();
        }
    }
}
