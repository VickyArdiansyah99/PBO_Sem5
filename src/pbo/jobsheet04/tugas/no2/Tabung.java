package pbo.jobsheet04.tugas.no2;

public class Tabung extends LuasLingkaran {

    private double tinggi;

    public Tabung(double jariJari, double tinggi) {
        super(jariJari);
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return super.hitungLuas() * tinggi;
    }

    public double hitunLuasPermukaan() {
        return (2 * Math.PI * jarijari * tinggi) + (2 * super.hitungLuas());
    }

}
