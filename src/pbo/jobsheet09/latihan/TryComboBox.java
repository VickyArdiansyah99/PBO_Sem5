package pbo.jobsheet09.latihan;

import javax.swing.*;
import java.awt.event.*;

public class TryComboBox extends JFrame implements ActionListener {
    // Menggunakan class JComboBox
    private JComboBox daftar;
    private JTextArea tArea;
    public TryComboBox() {
        super("MENGGUNAKAN COMBO BOX");
        setSize(350,125);
        String mataKuliah[] = {"Fisika Tehnik", "Komputasi Numerik", "Matematika Diskrit"}; //mengatur item pada combo box
        daftar = new JComboBox(mataKuliah); //menugaskan objek daftar dari class JComboBox
        daftar.setSelectedIndex(0);
        daftar.addActionListener(this); //mendeteksi event dari list
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
    public void actionPerformed(ActionEvent e) { //menangani event
        JComboBox cbb = (JComboBox) e.getSource();
        String keterangan = (String) cbb.getSelectedItem();
        tArea.setText("\nItem yang terpilih :\n" + keterangan);
    }

    public static void main(String[] args) {
        TryComboBox frame = new TryComboBox();
    }
}
