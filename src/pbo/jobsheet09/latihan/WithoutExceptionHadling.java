package pbo.jobsheet09.latihan;

public class WithoutExceptionHadling {
    // Program tanpa exception handling
    public static void main(String[] args) {
        System.out.println("\nPROGRAM TANPA EXCEPTION HANDLING \n");
        int hasil = 9 / 0; //penyebab exception
        System.out.println("Hasil pembagian = " + hasil);
        System.out.println("Pernyataan setelah bebas dari exception.");
    }
}
