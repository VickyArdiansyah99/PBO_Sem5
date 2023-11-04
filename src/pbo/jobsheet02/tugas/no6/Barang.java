package pbo.jobsheet02.tugas.no6;

public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public Barang(String kode, String namaBarang, int hargaDasar, float diskon) {
        this.kode = kode;
        this.namaBarang = namaBarang;
        this.hargaDasar = hargaDasar;
        this.diskon = diskon;
    }

    public int hitungHargaJual() {
        return (int) (hargaDasar - (diskon * hargaDasar));
    }

    public void tampilData() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Dasar: Rp. " + hargaDasar);
        System.out.println("Diskon: " + (diskon * 100) + "%");
        System.out.println("Harga Jual: Rp " + hitungHargaJual());
    }
}
