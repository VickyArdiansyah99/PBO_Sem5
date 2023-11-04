package pbo.jobsheet06.praktik;

public class TestBuah {
    public static void main(String[] args) {
        // Memanggil variable dan metode dari kelas Benda
        Benda.staticVariable = 42;
        System.out.println("Variabel static dari kelas Benda: " + Benda.staticVariable);

        // polimorfisme untuk merujuk ke objek kelas turunan seperti Buah
        Benda benda = new Buah("Apel");
        benda.nonStaticVariable = 10;
        System.out.println("Variabel non-static dari objek Benda: " + benda.nonStaticVariable);

        Benda.ststicMetthod();
        benda.nonStaticMethod();

        // Memanggil variabel dan metode dari kelas Buah
        Buah buah = new Buah("Mangga");
        System.out.println("Jenis buah: " + buah.jenis);

        buah.buahMethod();
    }
}
