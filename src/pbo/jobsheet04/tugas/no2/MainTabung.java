package pbo.jobsheet04.tugas.no2;

import java.util.Scanner;

public class MainTabung {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan jari-jari tabung: ");
        double jariJari = scanner.nextDouble();

        System.out.print("Masukan tinggi tabung: ");
        double tinggi = scanner.nextDouble();

        Tabung tabung = new Tabung(jariJari, tinggi);

        double luasPermukaan = tabung.hitunLuasPermukaan();
        double volume = tabung.hitungVolume();

        System.out.println("Luas permukaan tabung: " + luasPermukaan);
        System.out.println("Volume tabung: " + volume);

    }

}
