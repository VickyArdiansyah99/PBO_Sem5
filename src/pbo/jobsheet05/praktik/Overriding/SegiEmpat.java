package pbo.jobsheet05.praktik.Overriding;

public class SegiEmpat extends BangunDatar{
    public double panjang, lebar, diagonal;
    public SegiEmpat(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public void hitungLuas() {
        luas = panjang*lebar;
    }
    public void hitungKeliling() {
        keliling = 2*(panjang+lebar);
    }
    public void hitungDiagonal() {
        diagonal = Math.sqrt((panjang*panjang)+(lebar*lebar));
    }
    public void tampilData() {
        System.out.println("PANJANG = " + panjang);
        System.out.println("LEBAR = " + lebar);
        System.out.println("DIAGONAL = " + diagonal);
        super.tampilData();
    }
}
