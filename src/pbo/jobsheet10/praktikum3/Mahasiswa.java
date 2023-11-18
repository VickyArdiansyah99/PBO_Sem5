package pbo.jobsheet10.praktikum3;

class Mahasiswa {
    private String nama;
    private int nilai;
    public Mahasiswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public int getNilai() {
        return nilai;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nama='" + nama + '\'' +
                ", nilai=" + nilai +
                '}';
    }
}
