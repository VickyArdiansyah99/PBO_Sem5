package pbo.jobsheet05.praktik.Overriding;

public class BangunDatar {
    public double luas, keliling;
    public void hitungLuas(){
        luas = 0;
    }
    public void hitungKeliling(){
        keliling = 0;
    }
    public void tampilData(){
       System.out.println("Luas = "+luas);
       System.out.println("KELILING = "+keliling);
    }
}
