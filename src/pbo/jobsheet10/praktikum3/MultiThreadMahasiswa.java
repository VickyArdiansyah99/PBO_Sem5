package pbo.jobsheet10.praktikum3;

public class MultiThreadMahasiswa {
    public static void main(String[] args) {
        ManajemenMahasiswa manajemenMahasiswa = new ManajemenMahasiswa();
        // Membuat beberapa objek mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Ucup Surucup", 80);
        Mahasiswa mhs2 = new Mahasiswa("Otong Surotong", 90);
        // Membuat thread untuk menambahkan mahasiswa
        TambahMahasiswaThread tbThead1 = new TambahMahasiswaThread(manajemenMahasiswa, mhs1);
        TambahMahasiswaThread tbThead2 = new TambahMahasiswaThread(manajemenMahasiswa, mhs2);
        // Membuat thread untuk menampilkan mahasiswa
        TampilkanMahasiswaThread tpThread = new TampilkanMahasiswaThread(manajemenMahasiswa);
        // Menjalankan thread secara bersama
        tbThead1.start();
        tbThead2.start();
        tpThread.start();
    }
}
