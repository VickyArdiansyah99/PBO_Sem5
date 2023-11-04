package pbo.jobsheet06.praktik;

public class Buah extends Benda{
    // Variabel dan metode spesifik kelas Buah
    String jenis;

    public Buah(String jenis) {
        this.jenis = jenis;
    }

    public void buahMethod() {
        System.out.println("Ini adalah metode spesifik kelas Buah.");
    }
}
