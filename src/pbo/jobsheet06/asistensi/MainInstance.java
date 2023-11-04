package pbo.jobsheet06.asistensi;

import java.util.Scanner;

public class MainInstance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan panjang sisi Persegi: ");
        double sisiPersegi = scanner.nextDouble();

        System.out.println("Masukkan jari-jari Lingkaran: ");
        double jariJariLingkran = scanner.nextDouble();

        Bentuk bentuk1 = new Persegi(sisiPersegi);
        Bentuk bentuk2 = new Lingkaran(jariJariLingkran);
        bentuk1.tampilkanInfo();
        bentuk1.hitungLuas();

        bentuk2.tampilkanInfo();
        bentuk2.hitungLuas();

        scanner.close();
    }
}
