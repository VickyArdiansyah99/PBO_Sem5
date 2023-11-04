package pbo.jobsheet06.tugas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mahasiswa extends Universitas {
    private String nama;
    private LocalDate tanggalLahir;
    private String jurusan;

    public Mahasiswa(String namaUniversitas, String nama, String tanggalLahir, String jurusan) {
        super(namaUniversitas);
        this.nama = nama;
        this.tanggalLahir = LocalDate.parse(tanggalLahir, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.jurusan = jurusan;
    }
//    public Mahasiswa(String nama, LocalDate tanggalLahir, String nim, String jurusan) {
//        super(nama, tanggalLahir, nim);
//        this.jurusan = jurusan;
//    }

//    public String getJurusan() {
//        return jurusan;
//    }


    public int hitungUmur() {
        LocalDate today = LocalDate.now();
//        int umur = today.getYear() - tanggalLahir.getYear();
        return today.getYear() - tanggalLahir.getYear();
//        Period period = Period.between(tanggalLahir, today);
//        return period.getYears();
    }

    public void informasi() {
        int umur = hitungUmur();

        System.out.println("Informasi Mahasiswa:");
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Usia Mahasiswa: " + umur + " tahun");
        System.out.println("NIM Mahasiswa: " + jurusan);
        System.out.println("Universitas: " + getNamaUniversitas());
    }
}
