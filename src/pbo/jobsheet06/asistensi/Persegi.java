package pbo.jobsheet06.asistensi;

public class Persegi extends Bentuk{
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    // Mengimplememntasikan metode abstrak
    public void hitungLuas() {
        double luas = sisi * sisi;
        System.out.println("Luas Persegi: " + luas);
    }
}
