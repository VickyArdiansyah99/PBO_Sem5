package pbo.UTS;

public class Sportcar extends Kendaraan implements Maps{
    private String jenisKemudi;
//    private String nitros;
    private boolean isBahanBakarTerisi;

    public Sportcar(boolean isBahanBakarTerisi, String jenisTransmisi, String jenisBahanBakar) {
        super(isBahanBakarTerisi, jenisTransmisi, jenisBahanBakar);
        this.isBahanBakarTerisi = isBahanBakarTerisi;
    }

    public void startEnerge() {
        isBahanBakarTerisi = true;
        System.out.println("Mesin sport car dihidupkan.");
    }

    @Override
    public String getCoordinate() {
        return "";
    }

    @Override
    public int calculateDistance() {
        return 0;
    }

    public void activeNitros() {
        if (isBahanBakarTerisi) {
            System.out.println("Nitros diaktifkan.");
        } else {
            System.out.println("Mesin belum dinyalakan, tidak dapat mengaktifkan nitros.");
        }
    }

}
