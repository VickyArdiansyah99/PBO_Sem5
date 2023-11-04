package pbo.UTS;

public class MotorBike extends Kendaraan{
    private String jenisKemudi;
    public String jenisTransmisi;
    private boolean gigiMundur;

    public MotorBike(boolean isBahanBakarTerisi, String jenisTransmisi, String jenisBahanBakar) {
        super(isBahanBakarTerisi, jenisTransmisi, jenisBahanBakar);
        this.jenisKemudi = jenisKemudi;
    }

    public void startEnerge() {
        System.out.println("Mesin motor dihidupkan.");
    }

    public String getCoordinate() {
        return "koordinate ditemukan";
    }

    public int calculateDistance() {
        return 0;
    }

    @Override
    public void setJenisBahanBakar(String jenisBahanBakar) {
        System.out.println("Jenis bahan bakar motor diatur menjadi " + jenisBahanBakar);
    }

}
