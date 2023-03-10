/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.prototipocalculadora;
import com.mycompany.prototipocalculadora.Calculadora.Calculadora;
/**
 *
 * @author João Vitor
 */
public class Prototipo extends javax.swing.JFrame {
    public double n1,n2;
    public String op;
    /**
     * Creates new form Prototipo
     */
    public Prototipo() {
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

        TxtBoxOne = new javax.swing.JTextField();
        opBtn2 = new javax.swing.JButton();
        TxtBoxTwo = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        result = new javax.swing.JLabel();
        opBtn1 = new javax.swing.JButton();
        opBtn4 = new javax.swing.JButton();
        opBtn3 = new javax.swing.JButton();
        opBtn5 = new javax.swing.JButton();
        label1 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        opBtn2.setText("-");
        opBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opBtn2ActionPerformed(evt);
            }
        });

        TxtBoxTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBoxTwoActionPerformed(evt);
            }
        });

        jButton5.setText("Calcular");
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        result.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        result.setText("Resultado");

        opBtn1.setText("+");
        opBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opBtn1ActionPerformed(evt);
            }
        });

        opBtn4.setText("*");
        opBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opBtn4ActionPerformed(evt);
            }
        });

        opBtn3.setText("/");
        opBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opBtn3ActionPerformed(evt);
            }
        });

        opBtn5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        opBtn5.setText("Clear");
        opBtn5.setToolTipText("");
        opBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opBtn5ActionPerformed(evt);
            }
        });

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(204, 204, 204));
        label1.setText("Calculadora");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TxtBoxOne, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtBoxTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(198, 198, 198))
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(opBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(opBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(opBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(opBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(opBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtBoxOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(TxtBoxTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(result)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opBtn2ActionPerformed
        // TODO add your handling code here:
        
        n1 = Double.parseDouble(TxtBoxOne.getText());
        n2 = Double.parseDouble(TxtBoxTwo.getText());
        op = opBtn2.getText();
        jButton5.setEnabled(true);
        
    }//GEN-LAST:event_opBtn2ActionPerformed

    private void TxtBoxTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBoxTwoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBoxTwoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       Calculadora calc = new Calculadora(n1, n2, op);
      double resultado = calc.Resultado();
      result.setText("Resultado: " + String.valueOf(resultado));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void opBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opBtn1ActionPerformed
        // TODO add your handling code here:
         
        n1 = Double.parseDouble(TxtBoxOne.getText());
        n2 = Double.parseDouble(TxtBoxTwo.getText());
        op = opBtn1.getText();
        jButton5.setEnabled(true);
    }//GEN-LAST:event_opBtn1ActionPerformed

    private void opBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opBtn4ActionPerformed
        // TODO add your handling code here: 
        n1 = Double.parseDouble(TxtBoxOne.getText());
        n2 = Double.parseDouble(TxtBoxTwo.getText());
        op = opBtn4.getText();
        jButton5.setEnabled(true);
        
    }//GEN-LAST:event_opBtn4ActionPerformed

    private void opBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opBtn3ActionPerformed
        // TODO add your handling code here:
         
        n1 = Double.parseDouble(TxtBoxOne.getText());
        n2 = Double.parseDouble(TxtBoxTwo.getText());
        op = opBtn3.getText();
        jButton5.setEnabled(true);
    }//GEN-LAST:event_opBtn3ActionPerformed

    private void opBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opBtn5ActionPerformed
        // TODO add your handling code here:
        TxtBoxOne.setText("");
        TxtBoxTwo.setText("");
        result.setText("");
    }//GEN-LAST:event_opBtn5ActionPerformed

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
            java.util.logging.Logger.getLogger(Prototipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prototipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prototipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prototipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Prototipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtBoxOne;
    private javax.swing.JTextField TxtBoxTwo;
    private javax.swing.JButton jButton5;
    private java.awt.Label label1;
    private javax.swing.JButton opBtn1;
    private javax.swing.JButton opBtn2;
    private javax.swing.JButton opBtn3;
    private javax.swing.JButton opBtn4;
    public javax.swing.JButton opBtn5;
    private javax.swing.JLabel result;
    // End of variables declaration//GEN-END:variables
}
