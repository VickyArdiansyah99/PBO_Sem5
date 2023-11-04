package pbo.uts;

public class Scooter extends MotorBike{
    public String jenisTransmisi;

    public Scooter(boolean isBahanBakarTerisi, String jenisTransmisi, String jenisBahanBakar) {
        super(isBahanBakarTerisi, jenisTransmisi, jenisBahanBakar);
        this.jenisTransmisi = jenisTransmisi;
    }

    public void jalankanScooter(){
        if (isBahanBakarTerisi) {
            System.out.println("Scooter sedang berjalan.");
        } else {
            System.out.println("Tidak bisa menjalankan scooter, bahan bakar kosong.");
        }
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
