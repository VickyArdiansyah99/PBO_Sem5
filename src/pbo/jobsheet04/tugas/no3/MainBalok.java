package pbo.jobsheet04.tugas.no3;

import javax.swing.*;

public class MainBalok {

    public static void main(String[] args) {

        int panjang = Integer.parseInt(JOptionPane.showInputDialog("Masukkan panjang balok: "));
        int lebar = Integer.parseInt(JOptionPane.showInputDialog("Masukkan lebar balok: "));
        int tinggi = Integer.parseInt(JOptionPane.showInputDialog("Masukkan tinggi balok: "));

        Balok balok = new Balok(panjang, lebar, tinggi);

        double volume = balok.hitungVolume();

        JOptionPane.showMessageDialog(null,"Volume balok: " + volume);
    }

}
