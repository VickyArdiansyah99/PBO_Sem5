package pbo.jobsheet04.tugas.no2;

public class LuasLingkaran {
    protected double jarijari;

    public LuasLingkaran(double jariJari) {
        this.jarijari = jariJari;
    }

    public double hitungLuas() {
        return Math.PI * jarijari * jarijari;
    }
}
