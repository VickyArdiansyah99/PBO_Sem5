package pbo.jobsheet10.praktikum3;

import java.util.ArrayList;
import java.util.List;

class ManajemenMahasiswa {
    private List<Mahasiswa> mahasiswaList = new ArrayList<>();
    public synchronized void tambahMahasiswa(Mahasiswa mahasiswa) {
        mahasiswaList.add(mahasiswa);
        System.out.println("Mahasiswa ditambahkan: " + mahasiswa);
    }
    public synchronized void tampilkanMahasiswa() {
        System.out.println("\nDaftar Mahasiswa:");
        for (Mahasiswa mahasiswa : mahasiswaList) {
            System.out.println(mahasiswa);
        }
    }
}
