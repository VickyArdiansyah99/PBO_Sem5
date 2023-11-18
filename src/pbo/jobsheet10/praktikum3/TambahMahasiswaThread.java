package pbo.jobsheet10.praktikum3;

public class TambahMahasiswaThread extends Thread {
    private ManajemenMahasiswa manajemenMahasiswa;
    private Mahasiswa mahasiswa;

    public TambahMahasiswaThread(ManajemenMahasiswa manajemenMahasiswa, Mahasiswa mahasiswa) {
        this.manajemenMahasiswa = manajemenMahasiswa;
        this.mahasiswa = mahasiswa;
    }

    @Override
    public void run() {
        manajemenMahasiswa.tambahMahasiswa(mahasiswa);
    }
}
