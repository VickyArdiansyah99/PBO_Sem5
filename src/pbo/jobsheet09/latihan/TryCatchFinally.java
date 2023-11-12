package pbo.jobsheet09.latihan;

public class TryCatchFinally {
    // Membuat blok try-catch-finally
    public static void main(String[] args) {
        System.out.println("\n*** MENGGUNAKAN BLOK TRY- CATH-FINALLY ***\n");
        try {
            int hasil = 9 / 0; //penyebab exception
            System.out.println("Hasil pembagian = " + hasil);
            System.out.println("Pernyataan dalam blok try setelah bebas dari exception.");
        } catch (ArithmeticException exc) {
            System.err.println("ArithmeticException menangkap exception pembagian oleh nol.");
            System.err.println("\nException yang ditangkap adalah: "+exc);
        } finally {
            System.out.println("\nPernyataan dalam blok finally.");
        }
        System.out.println("\nPernyataan di luar blok try- catch-finally.");
    }
}
