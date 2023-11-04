package pbo.UTS;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Motorbike
        MotorBike motorbike = new MotorBike(true, "manual", "Bensin");
        System.out.println("===Motor Bike===");
        motorbike.startEngine();
        motorbike.setJenisBahanBakar("Bensin.");

        // Membuat objek Rallycar
        Rallycar rallycar = new Rallycar(true, "manual", "Bensin");
        System.out.println("===Rally Car===");
        rallycar.startEngine();

        // Membuat objek Sportcar
        Sportcar sportcar = new Sportcar(true, "manual", "Bensin");
        System.out.println("===Sport Car===");
        sportcar.startEngine();
        sportcar.activeNitros();

        // Membuat objek Motocross
        Motocross motocross = new Motocross(true, "manual", "Bensin");
        System.out.println("===Motocross===");
        motocross.startEngine();
        motocross.jalankanMotocross();

        // Membuat objek Scooter
        Scooter scooter = new Scooter(false, "otomatis", "Listrik");
        System.out.println("===Scooter===");
        scooter.jalankanScooter();
        scooter.isiBahanBakar(); // Mengisi bahan bakar
        scooter.startEngine();
        scooter.jalankanScooter();
    }
}
