package pbo.jobsheet11.tugas;

import pbo.jobsheet11.praktikum1.Mahasiswa;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MahasiswaApp {
    private static MahasiswaManager mahasiswaManager;
    private static DefaultTableModel tableModel;

    public static void main(String[] args) {
        mahasiswaManager = new MahasiswaManager();

        JFrame frame = new JFrame("Form Mahasiswa");
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }
    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel nimLabel = new JLabel("NIM:");
        nimLabel.setBounds(10,20,80,25);
        panel.add(nimLabel);

        JTextField nimText = new JTextField(20);
        nimText.setBounds(150,20,165,25);
        panel.add(nimText);

        JLabel namaLabel = new JLabel("Nama:");
        namaLabel.setBounds(10,50,80,25);
        panel.add(namaLabel);

        JTextField nameText = new JTextField(20);
        nameText.setBounds(150,50,165,25);
        panel.add(nameText);

        JLabel jurusanLabel = new JLabel("Jurusan:");
        jurusanLabel.setBounds(10,80,80,25);
        panel.add(jurusanLabel);

        JTextField jurusanText = new JTextField(20);
        jurusanText.setBounds(150,80,165,25);
        panel.add(jurusanText);

        JLabel prodiLabel = new JLabel("Program Studi:");
        prodiLabel.setBounds(10,110,80,25);
        panel.add(prodiLabel);

        JTextField prodiText = new JTextField(20);
        prodiText.setBounds(150,110,165,25);
        panel.add(prodiText);

        JLabel ipkLabel = new JLabel("IPK:");
        ipkLabel.setBounds(10,140,80,25);
        panel.add(ipkLabel);

        JTextField ipkText = new JTextField(20);
        ipkText.setBounds(150,140,165,25);
        panel.add(ipkText);

        JButton saveButton = new JButton("Simpan");
        saveButton.setBounds(10,170,80,25);
        panel.add(saveButton);

        JButton updateButton = new JButton("Update");
        updateButton.setBounds(100,170,80,25);
        panel.add(updateButton);

        JButton deleteButton = new JButton("Delete");
        deleteButton.setBounds(190,170,80,25);
        panel.add(deleteButton);

        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(280,170,80,25);
        panel.add(clearButton);

//        JTextArea resultArea = new JTextArea();
//        resultArea.setBounds(10,200,350,150);
//        panel.add(resultArea);

        String[] columnNames = {"NIM", "Nama", "Jurusan", "Program Studi", "IPK"};
        tableModel = new DefaultTableModel(columnNames, 0);
        JTable dataTable = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(dataTable);
        scrollPane.setBounds(10, 200, 700, 300);
        panel.add(scrollPane);

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nim = nimText.getText();
                String nama = nameText.getText();
                String jurusan = jurusanText.getText();
                String prodi = prodiText.getText();
                double ipk = Double.parseDouble(ipkText.getText());
                Object[] rowData = {nim, nama, jurusan, prodi, ipk};
                tableModel.addRow(rowData);
                Mahasiswa mahasiswa = new Mahasiswa(nim, nama, jurusan, prodi, ipk);
                mahasiswaManager.simpanMahasiswa(mahasiswa);
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = dataTable.getSelectedRow();
                if (selectedRow != -1) {
                    String nim = nimText.getText();
                    String nama = nameText.getText();
                    String jurusan = jurusanText.getText();
                    String prodi = prodiText.getText();
                    double ipk = Double.parseDouble(ipkText.getText());
                    Object[] updatedRowData = {nama, nim, jurusan, prodi, ipk};
                    for (int i = 0; i < updatedRowData.length; i++) {
                        tableModel.setValueAt(updatedRowData[i], selectedRow, i);
                    }
                    Mahasiswa mahasiswa = new Mahasiswa(nim, nama, jurusan, prodi, ipk);
                    mahasiswaManager.updateMahasiswa(selectedRow, mahasiswa);
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = dataTable.getSelectedRow();
                if (selectedRow != -1) {
                    tableModel.removeRow(selectedRow);
                    mahasiswaManager.deleteMahasiswa(selectedRow);
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameText.setText("");
                nimText.setText("");
                jurusanText.setText("");
                prodiText.setText("");
                ipkText.setText("");
            }
        });

//        updateResultArea(resultArea);
    }

//    private static void updateResultArea(JTextArea resultArea) {
//        resultArea.setText("");
//        for (Mahasiswa mahasiswa : mahasiswaManager.getDaftarMahasiswa()) {
//            resultArea.append("NIM: " + mahasiswa.getNim() + ", Nama: " + mahasiswa.getNama() +
//                    ", Jurusan: " + mahasiswa.getJurusan() + ", Proram Studi: " + mahasiswa.getProgramStudi() +
//                    ", IPK: " + mahasiswa.getIpk() + "\n");
//        }
//    }
}
