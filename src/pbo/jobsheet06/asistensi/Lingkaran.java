package pbo.jobsheet06.asistensi;

public class Lingkaran extends Bentuk{
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    // Mengimplememntasikan metode abstrak
    public void hitungLuas() {
        double Luas = Math.PI * jariJari * jariJari;
        System.out.println("Luas Lingkaran: " + Luas);
    }
}
