package pbo.jobsheet01.praktik;

import javax.swing.*;

public class Pertemuan1a {
    public static void main (String[] args){
        //Memasukkan data
        String kalimat = JOptionPane.showInputDialog(null,"Ketikkan sebuah kalimat","Memasukkan Data",JOptionPane.QUESTION_MESSAGE);
        String bilbul = JOptionPane.showInputDialog(null,"Masukkan bilangan bulat","Memasukkan Data",JOptionPane.QUESTION_MESSAGE);
        int bilb = Integer.parseInt(bilbul);
        String bilreal = JOptionPane.showInputDialog(null,"Ketikkan bilangan real/pecahan","Memasukkan Data",JOptionPane.QUESTION_MESSAGE);
        double bilr = Double.parseDouble(bilreal);

        //Menampilkan pesan dan data
//        JOptionPane.showMessageDialog(null, kalimat, "Tampilkan pesan", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, bilb, "Tampilkan pesan", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, bilr, "Tampilkan pesan", JOptionPane.INFORMATION_MESSAGE);

        String displayMessage = "Kalimat: " + kalimat + "\nBilangan Bulat: " + bilb + "\nBilangan Real: " + bilr;
        JOptionPane.showMessageDialog(null, displayMessage, "Tampilkan Pesan",JOptionPane.INFORMATION_MESSAGE);
    }
}
