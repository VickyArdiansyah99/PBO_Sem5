/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pbo.jobsheet12;

import java.text.NumberFormat;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author user
 */
public class MenuCaffee extends javax.swing.JFrame {

    /**
     * Creates new form MenuCaffee
     */
    public MenuCaffee() {
        initComponents();
        this.setLocationRelativeTo(null);
        hitung.setEnabled(false);
        ComboEspresso.setEnabled(false);
        ComboAmericano.setEnabled(false);
        ComboCappucino.setEnabled(false);
        ComboLatte.setEnabled(false);
        ComboMocha.setEnabled(false);
        ComboMacchiato.setEnabled(false);
        ComboFlatWhite.setEnabled(false);
        ComboCortado.setEnabled(false);
        ComboAffogato.setEnabled(false);
        ComboColdBrew.setEnabled(false);
        JumlahEspresso.setEnabled(false);
        JumlahAmericano.setEnabled(false);
        JumlahCappucino.setEnabled(false);
        JumlahLatte.setEnabled(false);
        JumlahMocha.setEnabled(false);
        JumlahMacchiato.setEnabled(false);
        JumlahFlatWhite.setEnabled(false);
        JumlahCortado.setEnabled(false);
        JumlahAffogato.setEnabled(false);
        JumlahColdBrew.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComboEspresso = new javax.swing.JCheckBox();
        ComboAmericano = new javax.swing.JCheckBox();
        ComboCappucino = new javax.swing.JCheckBox();
        ComboLatte = new javax.swing.JCheckBox();
        ComboMocha = new javax.swing.JCheckBox();
        ComboMacchiato = new javax.swing.JCheckBox();
        ComboFlatWhite = new javax.swing.JCheckBox();
        ComboCortado = new javax.swing.JCheckBox();
        ComboAffogato = new javax.swing.JCheckBox();
        ComboColdBrew = new javax.swing.JCheckBox();
        HargaEspresso = new javax.swing.JLabel();
        HargaAmericano = new javax.swing.JLabel();
        HargaCappucino = new javax.swing.JLabel();
        HargaLatte = new javax.swing.JLabel();
        HargaMocha = new javax.swing.JLabel();
        HargaMacchiato = new javax.swing.JLabel();
        HargaFlatWhite = new javax.swing.JLabel();
        HargaCortado = new javax.swing.JLabel();
        HargaAffogato = new javax.swing.JLabel();
        HargaColdBrew = new javax.swing.JLabel();
        JumlahEspresso = new javax.swing.JTextField();
        JumlahAmericano = new javax.swing.JTextField();
        JumlahCappucino = new javax.swing.JTextField();
        JumlahLatte = new javax.swing.JTextField();
        JumlahMocha = new javax.swing.JTextField();
        JumlahMacchiato = new javax.swing.JTextField();
        JumlahFlatWhite = new javax.swing.JTextField();
        JumlahCortado = new javax.swing.JTextField();
        JumlahAffogato = new javax.swing.JTextField();
        JumlahColdBrew = new javax.swing.JTextField();
        THargaEspresso = new javax.swing.JLabel();
        THargaAmericano = new javax.swing.JLabel();
        THargaCappucino = new javax.swing.JLabel();
        THargaLatte = new javax.swing.JLabel();
        THargaMocha = new javax.swing.JLabel();
        THargaMacchiato = new javax.swing.JLabel();
        THargaFlatWhite = new javax.swing.JLabel();
        THargaCortado = new javax.swing.JLabel();
        THargaAffogato = new javax.swing.JLabel();
        THargaColdBrew = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        JumlahPorsi = new javax.swing.JLabel();
        TotalBayar = new javax.swing.JLabel();
        hitung = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ComboEspresso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ComboEspresso.setForeground(new java.awt.Color(91, 55, 31));
        ComboEspresso.setText("Espresso");
        ComboEspresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboEspressoActionPerformed(evt);
            }
        });
        getContentPane().add(ComboEspresso, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 247, -1, -1));

        ComboAmericano.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ComboAmericano.setForeground(new java.awt.Color(91, 55, 31));
        ComboAmericano.setText("Americano");
        ComboAmericano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboAmericanoActionPerformed(evt);
            }
        });
        getContentPane().add(ComboAmericano, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 279, -1, -1));

        ComboCappucino.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ComboCappucino.setForeground(new java.awt.Color(91, 55, 31));
        ComboCappucino.setText("Cappucino");
        ComboCappucino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCappucinoActionPerformed(evt);
            }
        });
        getContentPane().add(ComboCappucino, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 312, -1, -1));

        ComboLatte.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ComboLatte.setForeground(new java.awt.Color(91, 55, 31));
        ComboLatte.setText("Latte");
        ComboLatte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboLatteActionPerformed(evt);
            }
        });
        getContentPane().add(ComboLatte, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 345, -1, -1));

        ComboMocha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ComboMocha.setForeground(new java.awt.Color(91, 55, 31));
        ComboMocha.setText("Mocha");
        ComboMocha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboMochaActionPerformed(evt);
            }
        });
        getContentPane().add(ComboMocha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 378, -1, -1));

        ComboMacchiato.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ComboMacchiato.setForeground(new java.awt.Color(91, 55, 31));
        ComboMacchiato.setText("Macchiato");
        ComboMacchiato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboMacchiatoActionPerformed(evt);
            }
        });
        getContentPane().add(ComboMacchiato, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 411, -1, -1));

        ComboFlatWhite.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ComboFlatWhite.setForeground(new java.awt.Color(91, 55, 31));
        ComboFlatWhite.setText("Flat White");
        ComboFlatWhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboFlatWhiteActionPerformed(evt);
            }
        });
        getContentPane().add(ComboFlatWhite, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 444, -1, -1));

        ComboCortado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ComboCortado.setForeground(new java.awt.Color(91, 55, 31));
        ComboCortado.setText("Cortado");
        ComboCortado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCortadoActionPerformed(evt);
            }
        });
        getContentPane().add(ComboCortado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 477, -1, -1));

        ComboAffogato.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ComboAffogato.setForeground(new java.awt.Color(91, 55, 31));
        ComboAffogato.setText("Affogato");
        ComboAffogato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboAffogatoActionPerformed(evt);
            }
        });
        getContentPane().add(ComboAffogato, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, -1, -1));

        ComboColdBrew.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ComboColdBrew.setForeground(new java.awt.Color(91, 55, 31));
        ComboColdBrew.setText("Cold Brew");
        ComboColdBrew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboColdBrewActionPerformed(evt);
            }
        });
        getContentPane().add(ComboColdBrew, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 543, -1, -1));

        HargaEspresso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HargaEspresso.setForeground(new java.awt.Color(91, 55, 31));
        HargaEspresso.setText("Rp. 5.000,-");
        getContentPane().add(HargaEspresso, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 247, -1, -1));

        HargaAmericano.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HargaAmericano.setForeground(new java.awt.Color(91, 55, 31));
        HargaAmericano.setText("Rp. 5.000,-");
        getContentPane().add(HargaAmericano, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 279, -1, -1));

        HargaCappucino.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HargaCappucino.setForeground(new java.awt.Color(91, 55, 31));
        HargaCappucino.setText("Rp. 5.000,-");
        getContentPane().add(HargaCappucino, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 312, -1, -1));

        HargaLatte.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HargaLatte.setForeground(new java.awt.Color(91, 55, 31));
        HargaLatte.setText("Rp. 10.000,-");
        getContentPane().add(HargaLatte, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 345, -1, -1));

        HargaMocha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HargaMocha.setForeground(new java.awt.Color(91, 55, 31));
        HargaMocha.setText("Rp. 10.000,-");
        getContentPane().add(HargaMocha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 378, -1, -1));

        HargaMacchiato.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HargaMacchiato.setForeground(new java.awt.Color(91, 55, 31));
        HargaMacchiato.setText("Rp. 10.000,-");
        getContentPane().add(HargaMacchiato, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 411, -1, -1));

        HargaFlatWhite.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HargaFlatWhite.setForeground(new java.awt.Color(91, 55, 31));
        HargaFlatWhite.setText("Rp. 15.000,-");
        getContentPane().add(HargaFlatWhite, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 444, -1, -1));

        HargaCortado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HargaCortado.setForeground(new java.awt.Color(91, 55, 31));
        HargaCortado.setText("Rp. 15.000,-");
        getContentPane().add(HargaCortado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 477, -1, -1));

        HargaAffogato.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HargaAffogato.setForeground(new java.awt.Color(91, 55, 31));
        HargaAffogato.setText("Rp. 20.000,-");
        getContentPane().add(HargaAffogato, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, -1, -1));

        HargaColdBrew.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HargaColdBrew.setForeground(new java.awt.Color(91, 55, 31));
        HargaColdBrew.setText("Rp. 20.000,-");
        getContentPane().add(HargaColdBrew, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 543, -1, -1));

        JumlahEspresso.setForeground(new java.awt.Color(91, 55, 31));
        getContentPane().add(JumlahEspresso, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 244, 30, -1));

        JumlahAmericano.setForeground(new java.awt.Color(91, 55, 31));
        getContentPane().add(JumlahAmericano, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 276, 30, -1));

        JumlahCappucino.setForeground(new java.awt.Color(91, 55, 31));
        getContentPane().add(JumlahCappucino, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 309, 30, -1));

        JumlahLatte.setForeground(new java.awt.Color(91, 55, 31));
        getContentPane().add(JumlahLatte, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 342, 30, -1));

        JumlahMocha.setForeground(new java.awt.Color(91, 55, 31));
        getContentPane().add(JumlahMocha, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 375, 30, -1));

        JumlahMacchiato.setForeground(new java.awt.Color(91, 55, 31));
        getContentPane().add(JumlahMacchiato, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 408, 30, -1));

        JumlahFlatWhite.setForeground(new java.awt.Color(91, 55, 31));
        getContentPane().add(JumlahFlatWhite, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 441, 30, -1));

        JumlahCortado.setForeground(new java.awt.Color(91, 55, 31));
        getContentPane().add(JumlahCortado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 474, 30, -1));

        JumlahAffogato.setForeground(new java.awt.Color(91, 55, 31));
        getContentPane().add(JumlahAffogato, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 507, 30, -1));

        JumlahColdBrew.setForeground(new java.awt.Color(91, 55, 31));
        getContentPane().add(JumlahColdBrew, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, 30, -1));

        THargaEspresso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        THargaEspresso.setForeground(new java.awt.Color(91, 55, 31));
        THargaEspresso.setText("Rp. 0,-");
        getContentPane().add(THargaEspresso, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 247, -1, -1));

        THargaAmericano.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        THargaAmericano.setForeground(new java.awt.Color(91, 55, 31));
        THargaAmericano.setText("Rp. 0,-");
        getContentPane().add(THargaAmericano, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 279, -1, -1));

        THargaCappucino.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        THargaCappucino.setForeground(new java.awt.Color(91, 55, 31));
        THargaCappucino.setText("Rp. 0,-");
        getContentPane().add(THargaCappucino, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 312, -1, -1));

        THargaLatte.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        THargaLatte.setForeground(new java.awt.Color(91, 55, 31));
        THargaLatte.setText("Rp. 0,-");
        getContentPane().add(THargaLatte, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 345, -1, -1));

        THargaMocha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        THargaMocha.setForeground(new java.awt.Color(91, 55, 31));
        THargaMocha.setText("Rp. 0,-");
        getContentPane().add(THargaMocha, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 378, -1, -1));

        THargaMacchiato.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        THargaMacchiato.setForeground(new java.awt.Color(91, 55, 31));
        THargaMacchiato.setText("Rp. 0,-");
        getContentPane().add(THargaMacchiato, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 411, -1, -1));

        THargaFlatWhite.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        THargaFlatWhite.setForeground(new java.awt.Color(91, 55, 31));
        THargaFlatWhite.setText("Rp. 0,-");
        getContentPane().add(THargaFlatWhite, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 444, -1, -1));

        THargaCortado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        THargaCortado.setForeground(new java.awt.Color(91, 55, 31));
        THargaCortado.setText("Rp. 0,-");
        getContentPane().add(THargaCortado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 477, -1, -1));

        THargaAffogato.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        THargaAffogato.setForeground(new java.awt.Color(91, 55, 31));
        THargaAffogato.setText("Rp. 0,-");
        getContentPane().add(THargaAffogato, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, -1, -1));

        THargaColdBrew.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        THargaColdBrew.setForeground(new java.awt.Color(91, 55, 31));
        THargaColdBrew.setText("Rp. 0,-");
        getContentPane().add(THargaColdBrew, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 543, -1, -1));

        Total.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Total.setForeground(new java.awt.Color(91, 55, 31));
        Total.setText("Total");
        getContentPane().add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 576, -1, -1));

        JumlahPorsi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JumlahPorsi.setForeground(new java.awt.Color(91, 55, 31));
        JumlahPorsi.setText("0 Porsi");
        getContentPane().add(JumlahPorsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 576, -1, -1));

        TotalBayar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TotalBayar.setForeground(new java.awt.Color(91, 55, 31));
        TotalBayar.setText("Rp. 0,-");
        getContentPane().add(TotalBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 576, -1, -1));

        hitung.setBackground(new java.awt.Color(203, 175, 152));
        hitung.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        hitung.setForeground(new java.awt.Color(91, 55, 31));
        hitung.setText("HITUNG");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });
        getContentPane().add(hitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, -1, -1));

        reset.setBackground(new java.awt.Color(203, 175, 152));
        reset.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        reset.setForeground(new java.awt.Color(91, 55, 31));
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 640, -1, -1));

        keluar.setBackground(new java.awt.Color(203, 175, 152));
        keluar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        keluar.setForeground(new java.awt.Color(91, 55, 31));
        keluar.setText("KELUAR");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        getContentPane().add(keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 640, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbo/jobsheet12/img/background.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboEspressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboEspressoActionPerformed
        // TODO add your handling code here:
        if(ComboEspresso.isSelected()==true) {
            JumlahEspresso.setEditable(true);
            JumlahEspresso.setEnabled(true);
            JumlahEspresso.requestFocus();
        } else {
            JumlahEspresso.setEditable(false);
            JumlahEspresso.setText("");
            THargaEspresso.setText("Rp.0,-");
        }
    }//GEN-LAST:event_ComboEspressoActionPerformed

    private void ComboAmericanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboAmericanoActionPerformed
        // TODO add your handling code here:
        if(ComboAmericano.isSelected()==true) {
            JumlahAmericano.setEditable(true);
            JumlahAmericano.setEnabled(true);
            JumlahAmericano.requestFocus();
        } else {
            JumlahAmericano.setEditable(false);
            JumlahAmericano.setText("");
            THargaAmericano.setText("Rp.0,-");
        }
    }//GEN-LAST:event_ComboAmericanoActionPerformed

    private void ComboCappucinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCappucinoActionPerformed
        // TODO add your handling code here:
        if(ComboCappucino.isSelected()==true) {
            JumlahCappucino.setEditable(true);
            JumlahCappucino.setEnabled(true);
            JumlahCappucino.requestFocus();
        } else {
            JumlahCappucino.setEditable(false);
            JumlahCappucino.setText("");
            THargaCappucino.setText("Rp.0,-");
        }
    }//GEN-LAST:event_ComboCappucinoActionPerformed

    private void ComboLatteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboLatteActionPerformed
        // TODO add your handling code here:
        if(ComboLatte.isSelected()==true) {
            JumlahLatte.setEditable(true);
            JumlahLatte.setEnabled(true);
            JumlahLatte.requestFocus();
        } else {
            JumlahLatte.setEditable(false);
            JumlahLatte.setText("");
            THargaLatte.setText("Rp.0,-");
        }
    }//GEN-LAST:event_ComboLatteActionPerformed

    private void ComboMochaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboMochaActionPerformed
        // TODO add your handling code here:
        if(ComboMocha.isSelected()==true) {
            JumlahMocha.setEditable(true);
            JumlahMocha.setEnabled(true);
            JumlahMocha.requestFocus();
        } else {
            JumlahMocha.setEditable(false);
            JumlahMocha.setText("");
            THargaMocha.setText("Rp.0,-");
        }
    }//GEN-LAST:event_ComboMochaActionPerformed

    private void ComboMacchiatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboMacchiatoActionPerformed
        // TODO add your handling code here:
        if(ComboMacchiato.isSelected()==true) {
            JumlahMacchiato.setEditable(true);
            JumlahMacchiato.setEnabled(true);
            JumlahMacchiato.requestFocus();
        } else {
            JumlahMacchiato.setEditable(false);
            JumlahMacchiato.setText("");
            THargaMacchiato.setText("Rp.0,-");
        }
    }//GEN-LAST:event_ComboMacchiatoActionPerformed

    private void ComboFlatWhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboFlatWhiteActionPerformed
        // TODO add your handling code here:
        if(ComboFlatWhite.isSelected()==true) {
            JumlahFlatWhite.setEditable(true);
            JumlahFlatWhite.setEnabled(true);
            JumlahFlatWhite.requestFocus();
        } else {
            JumlahFlatWhite.setEditable(false);
            JumlahFlatWhite.setText("");
            THargaFlatWhite.setText("Rp.0,-");
        }
    }//GEN-LAST:event_ComboFlatWhiteActionPerformed

    private void ComboCortadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCortadoActionPerformed
        // TODO add your handling code here:
        if(ComboCortado.isSelected()==true) {
            JumlahCortado.setEditable(true);
            JumlahCortado.setEnabled(true);
            JumlahCortado.requestFocus();
        } else {
            JumlahCortado.setEditable(false);
            JumlahCortado.setText("");
            THargaCortado.setText("Rp.0,-");
        }
    }//GEN-LAST:event_ComboCortadoActionPerformed

    private void ComboAffogatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboAffogatoActionPerformed
        // TODO add your handling code here:
        if(ComboAffogato.isSelected()==true) {
            JumlahAffogato.setEditable(true);
            JumlahAffogato.setEnabled(true);
            JumlahAffogato.requestFocus();
        } else {
            JumlahAffogato.setEditable(false);
            JumlahAffogato.setText("");
            THargaAffogato.setText("Rp.0,-");
        }
    }//GEN-LAST:event_ComboAffogatoActionPerformed

    private void ComboColdBrewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboColdBrewActionPerformed
        // TODO add your handling code here:
        if(ComboColdBrew.isSelected()==true) {
            JumlahColdBrew.setEditable(true);
            JumlahColdBrew.setEnabled(true);
            JumlahColdBrew.requestFocus();
        } else {
            JumlahColdBrew.setEditable(false);
            JumlahColdBrew.setText("");
            THargaColdBrew.setText("Rp.0,-");
        }
    }//GEN-LAST:event_ComboColdBrewActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        JumlahEspresso.setEditable(false);
        JumlahAmericano.setEditable(false);
        JumlahCappucino.setEditable(false);
        JumlahLatte.setEditable(false);
        JumlahMocha.setEditable(false);
        JumlahMacchiato.setEditable(false);
        JumlahFlatWhite.setEditable(false);
        JumlahCortado.setEditable(false);
        JumlahAffogato.setEditable(false);
        JumlahColdBrew.setEditable(false);
        ComboEspresso.setSelected(false);
        ComboAmericano.setSelected(false);
        ComboCappucino.setSelected(false);
        ComboLatte.setSelected(false);
        ComboMocha.setSelected(false);
        ComboMacchiato.setSelected(false);
        ComboFlatWhite.setSelected(false);
        ComboCortado.setSelected(false);
        ComboAffogato.setSelected(false);
        ComboColdBrew.setSelected(false);
        JumlahEspresso.setText("");
        JumlahAmericano.setText("");
        JumlahCappucino.setText("");
        JumlahLatte.setText("");
        JumlahMocha.setText("");
        JumlahMacchiato.setText("");
        JumlahFlatWhite.setText("");
        JumlahCortado.setText("");
        JumlahAffogato.setText("");
        JumlahColdBrew.setText("");
        THargaEspresso.setText("Rp. 0,-");
        THargaAmericano.setText("Rp. 0,-");
        THargaCappucino.setText("Rp. 0,-");
        THargaLatte.setText("Rp. 0,-");
        THargaMocha.setText("Rp. 0,-");
        THargaMacchiato.setText("Rp. 0,-");
        THargaFlatWhite.setText("Rp. 0,-");
        THargaCortado.setText("Rp. 0,-");
        THargaAffogato.setText("Rp. 0,-");
        THargaColdBrew.setText("Rp. 0,-");
        JumlahPorsi.setText("0 Porsi");
        TotalBayar.setText("Rp. 0,-"); 
        hitung.setEnabled(true);
        reset.setEnabled(false);
        ComboEspresso.setEnabled(true);
        ComboAmericano.setEnabled(true);
        ComboCappucino.setEnabled(true);
        ComboLatte.setEnabled(true);
        ComboMocha.setEnabled(true);
        ComboMacchiato.setEnabled(true);
        ComboFlatWhite.setEnabled(true);
        ComboCortado.setEnabled(true);
        ComboAffogato.setEnabled(true);
        ComboColdBrew.setEnabled(true);
    }//GEN-LAST:event_resetActionPerformed

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
        // TODO add your handling code here:
        reset.setEnabled(true);
        hitung.setEnabled(false);
        ComboEspresso.setEnabled(false);
        ComboAmericano.setEnabled(false);
        ComboCappucino.setEnabled(false);
        ComboLatte.setEnabled(false);
        ComboMocha.setEnabled(false);
        ComboMacchiato.setEnabled(false);
        ComboFlatWhite.setEnabled(false);
        ComboCortado.setEnabled(false);
        ComboAffogato.setEnabled(false);
        ComboColdBrew.setEnabled(false);
        JumlahEspresso.setEnabled(false);
        JumlahAmericano.setEnabled(false);
        JumlahCappucino.setEnabled(false);
        JumlahLatte.setEnabled(false);
        JumlahMocha.setEnabled(false);
        JumlahMacchiato.setEnabled(false);
        JumlahFlatWhite.setEnabled(false);
        JumlahCortado.setEnabled(false);
        JumlahAffogato.setEnabled(false);
        JumlahColdBrew.setEnabled(false);

        int[] quantities = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] prices = {5000, 5000, 5000, 10000, 10000, 10000, 15000, 15000, 20000, 20000};
        int[] totalPrices = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        JTextField[] jumlahFields = {JumlahEspresso, JumlahAmericano, JumlahCappucino, JumlahLatte, JumlahMocha, JumlahMacchiato, JumlahFlatWhite, JumlahCortado, JumlahAffogato, JumlahColdBrew};
        JLabel[] hargaLabels = {THargaEspresso, THargaAmericano, THargaCappucino, THargaLatte, THargaMocha, THargaMacchiato, THargaFlatWhite, THargaCortado, THargaAffogato, THargaColdBrew};

        JCheckBox[] checkboxes = {ComboEspresso, ComboAmericano, ComboCappucino, ComboLatte, ComboMocha, ComboMacchiato, ComboFlatWhite, ComboCortado, ComboAffogato, ComboColdBrew};

        for (int i = 0; i < checkboxes.length; i++) {
            if (checkboxes[i].isSelected()) {
                String jumlahText = jumlahFields[i].getText();
                if (!jumlahText.isEmpty() && jumlahText.matches("\\d+") && jumlahText.length() <= 2) {
                    int quantity = Integer.parseInt(jumlahText);
                    if (quantity > 0 && quantity <= 9) {
                        quantities[i] = quantity;
                        totalPrices[i] = quantities[i] * prices[i];

                        // Menggunakan DecimalFormat untuk memformat harga
                        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
                        symbols.setDecimalSeparator(',');
                        symbols.setGroupingSeparator('.');

                        DecimalFormat decimalFormat = new DecimalFormat("#,##0", symbols);
                        String formattedPrice = "Rp. " + decimalFormat.format(totalPrices[i]) + ",-";

                        hargaLabels[i].setText(formattedPrice);
                    } else {
                        JOptionPane.showMessageDialog(null, "Jumlah pesanan harus antara 1 dan 9", "Peringatan", JOptionPane.WARNING_MESSAGE);
                        jumlahFields[i].requestFocus();
                        return;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Masukkan hanya angka (1-9)", "Peringatan", JOptionPane.WARNING_MESSAGE);
                    jumlahFields[i].requestFocus();
                    return;
                }
            }
        }
        
        // Bagian perhitungan total
        int totalQuantity = 0;
        int totalPayment = 0;

        for (int quantity : quantities) {
            totalQuantity += quantity;
        }

        for (int i = 0; i < quantities.length; i++) {
            totalPayment += quantities[i] * prices[i];
        }

        JumlahPorsi.setText(totalQuantity + " Porsi");

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        currencyFormat.setMaximumFractionDigits(0);
        String formattedTotalPayment = "Rp. " + String.format("%,d", totalPayment) + ",-";
        TotalBayar.setText(formattedTotalPayment);
    }//GEN-LAST:event_hitungActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuCaffee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCaffee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCaffee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCaffee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCaffee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JCheckBox ComboAffogato;
    private javax.swing.JCheckBox ComboAmericano;
    private javax.swing.JCheckBox ComboCappucino;
    private javax.swing.JCheckBox ComboColdBrew;
    private javax.swing.JCheckBox ComboCortado;
    private javax.swing.JCheckBox ComboEspresso;
    private javax.swing.JCheckBox ComboFlatWhite;
    private javax.swing.JCheckBox ComboLatte;
    private javax.swing.JCheckBox ComboMacchiato;
    private javax.swing.JCheckBox ComboMocha;
    private javax.swing.JLabel HargaAffogato;
    private javax.swing.JLabel HargaAmericano;
    private javax.swing.JLabel HargaCappucino;
    private javax.swing.JLabel HargaColdBrew;
    private javax.swing.JLabel HargaCortado;
    private javax.swing.JLabel HargaEspresso;
    private javax.swing.JLabel HargaFlatWhite;
    private javax.swing.JLabel HargaLatte;
    private javax.swing.JLabel HargaMacchiato;
    private javax.swing.JLabel HargaMocha;
    private javax.swing.JTextField JumlahAffogato;
    private javax.swing.JTextField JumlahAmericano;
    private javax.swing.JTextField JumlahCappucino;
    private javax.swing.JTextField JumlahColdBrew;
    private javax.swing.JTextField JumlahCortado;
    private javax.swing.JTextField JumlahEspresso;
    private javax.swing.JTextField JumlahFlatWhite;
    private javax.swing.JTextField JumlahLatte;
    private javax.swing.JTextField JumlahMacchiato;
    private javax.swing.JTextField JumlahMocha;
    private javax.swing.JLabel JumlahPorsi;
    private javax.swing.JLabel THargaAffogato;
    private javax.swing.JLabel THargaAmericano;
    private javax.swing.JLabel THargaCappucino;
    private javax.swing.JLabel THargaColdBrew;
    private javax.swing.JLabel THargaCortado;
    private javax.swing.JLabel THargaEspresso;
    private javax.swing.JLabel THargaFlatWhite;
    private javax.swing.JLabel THargaLatte;
    private javax.swing.JLabel THargaMacchiato;
    private javax.swing.JLabel THargaMocha;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel TotalBayar;
    private javax.swing.JButton hitung;
    private javax.swing.JButton keluar;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
