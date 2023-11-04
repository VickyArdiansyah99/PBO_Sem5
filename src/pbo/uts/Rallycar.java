package pbo.uts;

public class Rallycar extends Kendaraan implements Maps{
    private String jenisKemudi;
    private boolean gigiMundur;

    public Rallycar(boolean isBahanBakarTerisi, String jenisTransmisi, String jenisBahanBakar) {
        super(isBahanBakarTerisi, jenisTransmisi, jenisBahanBakar);
    }

    public void startEnerge() {
        System.out.println("Mesin rally car dihidupkan.");
    }

    @Override
    public String getCoordinate() {
        return null;
    }

    @Override
    public int calculateDistance() {
        return 0;
    }
}
