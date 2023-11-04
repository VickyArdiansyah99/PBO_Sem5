package pbo.jobsheet03.tugas;

import java.util.Scanner;

public class TugasNo1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan tahun: ");

        int tahun = scanner.nextInt();

        cekTahunKabisat(tahun);
        cekGenapGanjil(tahun);

    }

    public static void cekTahunKabisat(int tahun) {
        if ((tahun % 400 == 0) || (tahun % 4 == 0 && tahun % 100 != 0)) {
            System.out.println("Tahun " + tahun + " adalah tahun kabisat.");
        } else {
            System.out.println("Tahun " + tahun + " bukan tahun kabisat.");
        }
    }

    public static void cekGenapGanjil(int tahun) {
        if (tahun % 2 == 0) {
            System.out.println("Tahun " + tahun + " adalah bilangan genap.");
        } else {
            System.out.println("Tahun " + tahun + " adalah bilangan ganjil.");
        }
    }

}
