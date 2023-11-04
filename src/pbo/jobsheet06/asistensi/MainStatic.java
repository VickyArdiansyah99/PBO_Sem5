package pbo.jobsheet06.asistensi;

import java.util.Scanner;

public class MainStatic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jenis bentuk (persegi/lingkaran): ");
        String jenis = scanner.nextLine();
        System.out.println("Masukkan ukuran bentuk: ");
        double ukuran = scanner.nextDouble();
        Bentuk bentuk = Bentuk.buatBentuk(jenis, ukuran);
        if (bentuk != null) {
            bentuk.tampilkanInfo();
            bentuk.hitungLuas();
        } else {
            System.out.println("Jenis bentuk tidak valid.");
        }
        scanner.close();
    }
}
