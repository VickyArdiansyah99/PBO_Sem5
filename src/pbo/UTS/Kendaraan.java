package pbo.UTS;

public class Kendaraan {
    boolean isBahanBakarTerisi;
    String jenisTransmisi;
    String jenisBahanBakar;

    public Kendaraan(boolean isBahanBakarTerisi, String jenisTransmisi, String jenisBahanBakar) {
        this.isBahanBakarTerisi = isBahanBakarTerisi;
        this.jenisTransmisi = jenisTransmisi;
        this.jenisBahanBakar = jenisBahanBakar;
    }

    public String getJenisTransmisi() {
        return jenisTransmisi;
    }

    public void setJenisTransmisi(String jenisTransmisi) {
        this.jenisTransmisi = jenisTransmisi;
    }

    public void setJenisBahanBakar(String jenisBahanBakar) {
        this.jenisBahanBakar = jenisBahanBakar;
    }

    public String getJenisBahanBakar() {
        return jenisBahanBakar;
    }

    public void startEngine() {
        if (isBahanBakarTerisi) {
            System.out.println("Mesin dinyalakan.");
        } else {
            System.out.println("Tidak bisa menghidupkan mesin, bahan bakar kosong.");
        }
    }

    public void isiBahanBakar() {
        isBahanBakarTerisi = true;
        System.out.println("Bahan bakar diisi.");
    }
}
