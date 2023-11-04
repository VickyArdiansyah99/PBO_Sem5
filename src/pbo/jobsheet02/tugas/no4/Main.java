package pbo.jobsheet02.tugas.no4;

public class Main {

    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.setNomorPlat("AB 1234 CD");
        mobil.setHargaDasar(100.0);

        TransaksiPeminjaman transaksi = new TransaksiPeminjaman(1,
                "vicky", "022020202",
                mobil.getNomorPlat(), 12, mobil.getHargaDasar());
        double totalarga = transaksi.hitungTotalHarga();

        System.out.println("ID Transaksi: " + transaksi.getIdTransaksi());
        System.out.println("Nama Peminjam: " + transaksi.getNamaPeminjam());
        System.out.println("Nomor Plat Mobil: " + transaksi.getPlatMobil());
        System.out.println("Lama Sewa: " + transaksi.getLamaSewa() + " hari");
        System.out.println("Total Harga: Rp. " + totalarga);
    }

}
