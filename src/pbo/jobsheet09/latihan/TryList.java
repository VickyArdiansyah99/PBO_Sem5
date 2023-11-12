package pbo.jobsheet09.latihan;

import javax.swing.*;
import javax.swing.event.*;

public class TryList extends JFrame implements ListSelectionListener {
    // Menggunakan class JList
    private JList daftar;
    private JTextArea tArea;
    public TryList() {
        super("MENGGUNAKAN LIST");
        setSize(350,125);
        String mataKuliah[] = {"Fisika Tehnik", "Komputasi Numerik", "Matematika Diskrit"};
        daftar = new JList(mataKuliah); //menugaskan objek daftar dari class JList
        daftar.setSelectedIndex(0);
        daftar.addListSelectionListener(this); //mendeteksi event dari list
        tArea = new JTextArea(4, 15);
        tArea.setEditable(false);
        JPanel p1 = new JPanel();
        p1.add(daftar);
        add("West", p1);
        JPanel p2 = new JPanel();
        p2.add(tArea);
        add("East", p2);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void valueChanged(ListSelectionEvent e) { //menangani event
        tArea.setText("\nItem yang terpilih :\n" + daftar.getSelectedValue()); //menampilkan pilihan
    }

    public static void main(String[] args) {
        TryList frame = new TryList();
    }
}
