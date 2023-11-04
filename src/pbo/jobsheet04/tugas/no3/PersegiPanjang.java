package pbo.jobsheet04.tugas.no3;

public class PersegiPanjang {
    protected int panjang;
    protected int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int hitungLuas() {
        return panjang * lebar;
    }
}
