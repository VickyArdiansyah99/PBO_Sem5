package pbo.jobsheet09.asistensi;

public class Exc2 {
    public static void main(String[] args) {
        int d, a;
        try { // pantau satu blok kode.
            d = 0;
            a = 42 / d;
            System.out.println("Ini tidak akan dicetak.");
        } catch (ArithmeticException e) {
            // menangkap kesalahan pembagian dengan nol
            System.out.println("Pembagian dengan nol.");
        }
        System.out.println("Setelah pernyataan tangkapan.");
    }
}
