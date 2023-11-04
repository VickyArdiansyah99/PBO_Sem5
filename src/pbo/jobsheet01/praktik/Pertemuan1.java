package pbo.jobsheet01.praktik;

import java.util.Scanner;

public class Pertemuan1 {

    public static void main(String[] args) {
        System.out.printf("Masukkan Sebuah Teks : ");
        Scanner nama = new Scanner((System.in));
        String kata = nama.next();

        System.out.printf("masukkan Bilangan Bulat : ");
        Scanner no_induk = new Scanner(System.in);
        int bilbul = no_induk.nextInt();
        System.out.printf("Masukkan Bilangan Desimal : ");
        Scanner bilreal = new Scanner(System.in);
        double bilr = bilreal.nextDouble();

        System.out.println("Teks yang anda masukkan :" + kata);
        System.out.println("Bilangan bulat yang anda masukkan :" + bilbul);
        System.out.println("Bilangan desimal yang anda masukkan :" + bilr);
    }
}
