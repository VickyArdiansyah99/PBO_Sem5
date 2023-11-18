package pbo.jobsheet10.praktikum3;

public class TampilkanMahasiswaThread extends Thread {
    private ManajemenMahasiswa manajemenMahasiswa;

    public TampilkanMahasiswaThread(ManajemenMahasiswa manajemenMahasiswa) {
        this.manajemenMahasiswa = manajemenMahasiswa;
    }

    @Override
    public void run() {
        manajemenMahasiswa.tampilkanMahasiswa();
    }
}
