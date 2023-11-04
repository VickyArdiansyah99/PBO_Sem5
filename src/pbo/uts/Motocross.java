package pbo.uts;

public class Motocross extends MotorBike{
    public String jenisTransmisi;

    public Motocross(boolean isBahanBakarTerisi, String jenisTransmisi, String jenisBahanBakar) {
        super(isBahanBakarTerisi, jenisTransmisi, jenisBahanBakar);
        this.jenisTransmisi = jenisTransmisi;
    }

    public void ubahGigi(int gigi) {
        System.out.println("Gigi diubah menjadi " + gigi);
    }

    public void jalankanMotocross(){
        if (getJenisTransmisi().equals("manual")) {
            ubahGigi(1);
        }
        System.out.println("Motocross sedang berjalan.");
    }

    @Override
    public String getCoordinate() {
        return super.getCoordinate();
    }

    @Override
    public int calculateDistance() {
        return super.calculateDistance();
    }
}
