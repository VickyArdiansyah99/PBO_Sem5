package pbo.jobsheet01.tugas;

import java.util.Scanner;

public class Tugas1a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memasukan data siswa
        System.out.print("Masukkan Nama : ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Kelas : ");
        String kelas = scanner.nextLine();

        System.out.print("Masukkan No Induk : ");
        String nomorInduk = scanner.nextLine();

        System.out.print("Masukkan Alamat : ");
        String alamat = scanner.nextLine();

        System.out.print("Masukkan Nomor HP : ");
        String nomorHP = scanner.nextLine();

        // Menampilkan data siswa
        System.out.println("\nData Siswa:");
        System.out.println("Nama : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("No Induk : " + nomorInduk);
        System.out.println("Alamat : " + alamat);
        System.out.println("Nomor HP : " + nomorHP);

    }
}
