/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.lista06.matheus.oliveira;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zagreu
 */
public class ListaFrutasJFRAME extends javax.swing.JFrame {

    /**
     * Creates new form ListaFrutasJFRAME
     */
    public ListaFrutasJFRAME() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        input_frutas = new javax.swing.JTextField();
        button_pesquisar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label_resultado_pesquisa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Pesquise uma fruta:");

        input_frutas.setBackground(new java.awt.Color(255, 255, 255));
        input_frutas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        input_frutas.setForeground(new java.awt.Color(0, 0, 0));
        input_frutas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        input_frutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_frutasActionPerformed(evt);
            }
        });

        button_pesquisar.setBackground(new java.awt.Color(255, 255, 255));
        button_pesquisar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        button_pesquisar.setForeground(new java.awt.Color(0, 0, 0));
        button_pesquisar.setText("Pesquisar");
        button_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_pesquisarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Resultado da pesquisa:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        label_resultado_pesquisa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(button_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(input_frutas, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(label_resultado_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(202, 202, 202)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_frutas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_pesquisar)
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(label_resultado_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(275, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input_frutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_frutasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_frutasActionPerformed

    private void button_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_pesquisarActionPerformed
        ListaFrutas listaFrutas = new ListaFrutas();
        String frutaDigitada = input_frutas.getText();

        for (int i = 0; i < listaFrutas.getFrutas().size(); i++) {
            if (frutaDigitada.equals(listaFrutas.getFrutas().get(i))) {
                label_resultado_pesquisa.setText("A fruta "
                        + frutaDigitada + " existe na lista.");
                break;
            } else {
                label_resultado_pesquisa.setText("Não existe a fruta "
                        + frutaDigitada + " na lista.");
            }
        }
    }//GEN-LAST:event_button_pesquisarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaFrutasJFRAME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_pesquisar;
    private javax.swing.JTextField input_frutas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel label_resultado_pesquisa;
    // End of variables declaration//GEN-END:variables
}
