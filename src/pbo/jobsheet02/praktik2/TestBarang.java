package pbo.jobsheet02.praktik2;

public class TestBarang {
    public static void main(String[] args) {
        Barang brng1 = new Barang();
        brng1.namaBrg = "pensil";
        brng1.jenisBrg = "ATK";
        brng1.stok = 10;
        brng1.tampilBarang();

        // Barang setelah ditambahkan
        System.out.println("Stok baru adalah " + brng1.tambahStok(20));
    }
}
