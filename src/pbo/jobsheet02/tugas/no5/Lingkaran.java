package pbo.jobsheet02.tugas.no5;

public class Lingkaran {
    public double phi;
    public double r;

    public Lingkaran(double r) {
        this.phi = Math.PI;
        this.r = r;
    }

    public double hitungLuas() {
        return phi * r * r;
    }

    public double hitungKeliling() {
        return 2 * phi * r;
    }

}
