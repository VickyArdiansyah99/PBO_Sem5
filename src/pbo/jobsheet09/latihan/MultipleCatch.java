package pbo.jobsheet09.latihan;

public class MultipleCatch {
    // Membuat catch secara bertingkat
    public static void main(String[] args) {
        System.out.println("\n***** MENGGUNAKAN MULTIPLE CATCH *****\n");
        try {
            int[] array = new int[9]; // deklarasi array berukuran 9 buah elemen
            array[8] = 13; //penyebab exception
            System.out.println("Elemen array indeks ke 8 adalah " + array[8]);
            System.out.println("Pernyataan dalam blok try setelah bebas dari exception.");
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.err.println("Anda mengakses array di luar indeks yang dideklarasiakan.");
        } catch (NegativeArraySizeException exc) {
            System.err.println("Anda mendeklarasikan array dengan ukuran negatif.");
        } catch (Exception exc) {
            System.err.println("Anda melakukan pembagian bilangan oleh nol.");
        }
    }
}
