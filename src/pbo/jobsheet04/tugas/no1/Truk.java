package pbo.jobsheet04.tugas.no1;

public class Truk extends Kendaraan {

    public Truk() {
        System.out.println("Isi dari Truk:Constructor");
        //beberapa kode di sini

        //pemanggilan induknya
        super.merek = "somename";
        super.platNomor = "some address";
    }

    public String getmerek() {
        System.out.println("Studen: getName baru tidak sama denan Class Person");
        return merek;
    }

}