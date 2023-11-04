package pbo.jobsheet06.tugas;

public abstract class Universitas {
//    protected String nama;
//    protected String tanggalLahir;
//    protected String nim;
    private String namaUniversitas;

    public Universitas(String namaUniversitas) {
//        this.nama = nama;
//        this.tanggalLahir = tanggalLahir;
//        this.nim = nim;
        this.namaUniversitas = namaUniversitas;
    }

    public abstract void informasi();

    public String getNamaUniversitas() {
        return namaUniversitas;
    }
}
