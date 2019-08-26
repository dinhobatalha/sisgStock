/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainViews;

import formViews.CadastrarFornecedor;
import formViews.CadastrarLoja;

/**
 *
 * @author aderito
 */
public class MainWindow extends javax.swing.JFrame {
    /**
     * Creates new form LojasCadastradas
     */
    public MainWindow() {
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
        goto_cadLojaForm = new javax.swing.JButton();
        goto_LojasCad = new javax.swing.JButton();
        btn_gotoCadFornecedor = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel1.setText("Sistema de Gestao de Stock");

        goto_cadLojaForm.setText("Cadastrar Loja");
        goto_cadLojaForm.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        goto_cadLojaForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goto_cadLojaFormActionPerformed(evt);
            }
        });

        goto_LojasCad.setText("Lojas Cadastradas");
        goto_LojasCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goto_LojasCadActionPerformed(evt);
            }
        });

        btn_gotoCadFornecedor.setText("Cadastrar fornecedor");
        btn_gotoCadFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gotoCadFornecedorActionPerformed(evt);
            }
        });

        btn_sair.setForeground(new java.awt.Color(220, 15, 15));
        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(goto_cadLojaForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_gotoCadFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(goto_LojasCad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(goto_cadLojaForm)
                .addGap(18, 18, 18)
                .addComponent(btn_gotoCadFornecedor)
                .addGap(18, 18, 18)
                .addComponent(goto_LojasCad)
                .addGap(18, 18, 18)
                .addComponent(btn_sair)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goto_LojasCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goto_LojasCadActionPerformed
        dispose();
        new Lojas().setVisible(true);
    }//GEN-LAST:event_goto_LojasCadActionPerformed

    private void btn_gotoCadFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gotoCadFornecedorActionPerformed
        // TODO add your handling code here:
        dispose();
        new CadastrarFornecedor().setVisible(true);
    }//GEN-LAST:event_btn_gotoCadFornecedorActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_sairActionPerformed

    private void goto_cadLojaFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goto_cadLojaFormActionPerformed
        dispose();
        new CadastrarLoja().setVisible(true);
    }//GEN-LAST:event_goto_cadLojaFormActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_gotoCadFornecedor;
    private javax.swing.JButton btn_sair;
    private javax.swing.JButton goto_LojasCad;
    private javax.swing.JButton goto_cadLojaForm;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
