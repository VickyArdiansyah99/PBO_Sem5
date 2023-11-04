package pbo.jobsheet06.tugas;

//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        while (true) {
            System.out.print("Masukkan Nama Universitas: ");
            String namaUniversitas = scanner.nextLine();

            System.out.println("Pilih tipe data (mahasiswa/dosen):");
            String tipeData = scanner.nextLine();


//        System.out.print("Masukkan Nama: ");
//        String nama = scanner.nextLine();
//
//        System.out.print("Masukkan Tanggal Lahir (dd/MM/yyyy): ");
//        String tanggalLahir = scanner.nextLine();
//        LocalDate tanggalLahir = LocalDate.parse(strTanggalLahir, formatter);

//        System.out.print("Masukkan NIM: ");
//        String nim = scanner.nextLine();

            if (tipeData.equals("mahasiswa")) {
                System.out.print("Masukkan Nama: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan Tanggal Lahir (dd/MM/yyyy): ");
                String tanggalLahir = scanner.nextLine();
                System.out.print("Masukkan NIM: ");
                String jurusan = scanner.nextLine();

                Mahasiswa mahasiswa = new Mahasiswa(namaUniversitas, nama, tanggalLahir, jurusan);
                mahasiswa.informasi();
            } else if (tipeData.equals("dosen")) {
                System.out.print("Masukkan Nama: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan Tanggal Lahir (dd/MM/yyyy): ");
                String tanggalLahir = scanner.nextLine();
                System.out.print("Masukkan NIDN: ");
                String mataKuliah = scanner.nextLine();

                Dosen dosen = new Dosen(namaUniversitas, nama, tanggalLahir, mataKuliah);
                dosen.informasi();
            } else {
                System.out.println("Tipe data tidak valid.");
            }

            System.out.println("Apakah anda ingin melanjutkan? (ya/tidak): ");
            String lanjut = scanner.nextLine();

            if (!lanjut.equalsIgnoreCase("ya")) {
                break;
            }
        }
    }
}
