package pbo.jobsheet06.asistensi;

abstract class Bentuk {
    // Metode abstrak (tanpa implementasi)
    public abstract void hitungLuas();
    // metode non-abstrak
    public void tampilkanInfo() {
        System.out.println("Ini adalah bentuk.");
    }
    // Metode static untuk membuat objek berdasarkan jenis bentuk
    public static Bentuk buatBentuk(String jenis, double ukuran) {
        if (jenis.equalsIgnoreCase("persegi")) {
            return new Persegi(ukuran);
        } else if (jenis.equalsIgnoreCase("lingkaran")) {
            return new Lingkaran(ukuran);
        } else {
            return null; // Atau kembali default jika jenis tidak valid
        }
    }
}
