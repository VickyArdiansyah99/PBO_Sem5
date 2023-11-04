package pbo.jobsheet06.tugas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dosen extends Universitas {
    private String nama;
    private LocalDate tanggalLahir;
    private String mataKuliah;

    public Dosen(String namaUniversitas, String nama, String tanggalLahir, String mataKuliah) {
        super(namaUniversitas);
        this.nama = nama;
        this.tanggalLahir = LocalDate.parse(tanggalLahir, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.mataKuliah = mataKuliah;
    }

//    public Dosen(String nama, String tanggalLahir, String nim, String mataKuliah) {
//        super(nama, tanggalLahir, nim);
//        this.mataKuliah = mataKuliah;
//        this.tanggalLahir = LocalDate.parse(tanggalLahir, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//    }

//    public String getMataKuliah() {
//        return mataKuliah;
//    }

    public int hitungUmur() {
        LocalDate today = LocalDate.now();
//        Period period = Period.between(tanggalLahir, today);
        return today.getYear() - tanggalLahir.getYear();
    }

    public void informasi() {
        int umur = hitungUmur();

        System.out.println("Informasi Dosen:");
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Usia Dosen: " + umur + " tahun");
        System.out.println("NIDN Dosen: " + mataKuliah);
        System.out.println("Universitas: " + getNamaUniversitas());
    }
}
