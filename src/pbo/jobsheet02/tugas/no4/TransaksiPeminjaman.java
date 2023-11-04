package pbo.jobsheet02.tugas.no4;

public class TransaksiPeminjaman {
    public int idTransaksi;
    public String namaPeminjam;
    public String nomorKTP;
    public String platMobil;
    public int lamaSewa;
    public double hargaMobil;

    public TransaksiPeminjaman(int idTransaksi, String namaPeminjam, String nomorKTP, String platMobil, int lamaSewa, double hargaMobil) {
        this.idTransaksi = idTransaksi;
        this.namaPeminjam = namaPeminjam;
        this.nomorKTP = nomorKTP;
        this.platMobil = platMobil;
        this.lamaSewa = lamaSewa;
        this.hargaMobil = hargaMobil;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public String getPlatMobil() {
        return platMobil;
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public double hitungTotalHarga() {
        return lamaSewa * hargaMobil;
    }
}
