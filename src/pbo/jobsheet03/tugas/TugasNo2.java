package pbo.jobsheet03.tugas;

import java.util.Scanner;

public class TugasNo2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan harga barang: ");
        int hargaBarang = scanner.nextInt();

        System.out.print("Masukan persentase diskon: ");
        int diskon = scanner.nextInt();

        double totalPembayaran = hitungTotalPembayaran(hargaBarang,diskon);
        System.out.println("Total yang harus dibayarkan setelah diskon: \nRp " + totalPembayaran);

    }

    public static double hitungTotalPembayaran(int hargaBarang, int diskon) {
        return hargaBarang - (hargaBarang * diskon / 100);
    }

}
