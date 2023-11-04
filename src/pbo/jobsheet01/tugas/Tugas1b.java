package pbo.jobsheet01.tugas;

import javax.swing.*;

public class Tugas1b {
    public static void main(String[] args){
        // Memasukan data siswa
        String nama = JOptionPane.showInputDialog(
                null,"Masukkan Nama:",
                "Input Data Siswa", JOptionPane.QUESTION_MESSAGE);

        String kelas = JOptionPane.showInputDialog(
                null,"Masukkan Kelas:",
                "Input Data Siswa", JOptionPane.QUESTION_MESSAGE);

        String nomorInduk = JOptionPane.showInputDialog(
                null,"Masukkan No Induk:",
                "Input Data Siswa", JOptionPane.QUESTION_MESSAGE);

        String alamat = JOptionPane.showInputDialog(
                null,"Masukkan Alamat:",
                "Input Data Siswa", JOptionPane.QUESTION_MESSAGE);

        String nomorHP = JOptionPane.showInputDialog(
                null,"Masukkan Nomor HP:",
                "Input Data Siswa", JOptionPane.QUESTION_MESSAGE);

        // Menampilkan data siswa
        String displayMessage = "Data Siswa Yang Anda Input:\n" +
                "Nama : " + nama + "\n" +
                "Kelas : " + kelas + "\n" +
                "No Induk : " + nomorInduk + "\n" +
                "Alamat : " + alamat + "\n" +
                "Nomor HP : " + nomorHP;

        JOptionPane.showMessageDialog(null,
                displayMessage, "Data siswa",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
