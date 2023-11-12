package pbo.jobsheet09.latihan;

public class WithArithmeticException {
    // Menangkap exception dengan blok try-catch.
    public static void main(String[] args) {
        System.out.println("\n* PROGRAM DENGAN EXCEPTION HANDLING *\n");
        try {
            int hasil = 9 / 0; //penyebab exception
            System.out.println("Hasil pembagian = " + hasil);
            System.out.println("Pernyataan dalam blok try");
        } catch (ArithmeticException exc) {
            System.err.println("ArithmeticException menangkap exception");
            System.err.println("\nException yang ditangkap adalah: "+exc);
        }
        System.out.println("\nPernyataan di luar blok try- catch.");
    }
}
