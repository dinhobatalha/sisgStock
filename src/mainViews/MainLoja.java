/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainViews;

import entitys.Loja;
import formViews.CadastrarProduto;
import formViews.RegistarVenda;
import javax.swing.JOptionPane;
import productsView.AquisicoesView;
import productsView.VendasView;

/**
 *
 * @author aderito
 */
public class MainLoja extends javax.swing.JFrame {
    
//loja escolhida
    private Loja loja;
    AquisicoesView aquisicoesView; 
    RegistarVenda registarVenda;
    VendasView vendasView;
    CadastrarProduto cadastrarProduto;
    /**
     * Creates new form MainLoja
     */
    public MainLoja() {
        initComponents();
        
        //JOptionPane.showMessageDialog(null, loja.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectedShop = new javax.swing.JLabel();
        btn_goBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn_goto_cadProd = new javax.swing.JButton();
        btn_gotoRegVenda = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();
        btn_goto_aquisicoesView = new javax.swing.JButton();
        btn_goto_vendasView = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.lightGray);

        selectedShop.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        selectedShop.setText("jLabel1");

        btn_goBack.setText("<--");
        btn_goBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_goBackActionPerformed(evt);
            }
        });

        jPanel1.setBackground(java.awt.Color.gray);
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_goto_cadProd.setText("Cadastrar produto");
        btn_goto_cadProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_goto_cadProdActionPerformed(evt);
            }
        });

        btn_gotoRegVenda.setText("Registar Venda");
        btn_gotoRegVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gotoRegVendaActionPerformed(evt);
            }
        });

        btn_home.setText("Pagina principal");
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });

        btn_goto_aquisicoesView.setText("Ver produtos em stock");
        btn_goto_aquisicoesView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_goto_aquisicoesViewActionPerformed(evt);
            }
        });

        btn_goto_vendasView.setText("Ver vendas efectuadas");
        btn_goto_vendasView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_goto_vendasViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_goto_vendasView)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn_home, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_goto_cadProd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_gotoRegVenda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_goto_aquisicoesView, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_home)
                .addGap(18, 18, 18)
                .addComponent(btn_goto_cadProd)
                .addGap(18, 18, 18)
                .addComponent(btn_gotoRegVenda)
                .addGap(18, 18, 18)
                .addComponent(btn_goto_aquisicoesView)
                .addGap(18, 18, 18)
                .addComponent(btn_goto_vendasView)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_goBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addComponent(selectedShop)
                .addGap(268, 268, 268))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectedShop)
                    .addComponent(btn_goBack))
                .addGap(52, 52, 52)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_goBackActionPerformed
        // TODO add your handling code here:
        
        dispose();
        new Lojas().setVisible(true);
    }//GEN-LAST:event_btn_goBackActionPerformed

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        // TODO add your handling code here:
        
        dispose();
        new MainWindow().setVisible(true);
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_goto_cadProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_goto_cadProdActionPerformed
        // TODO add your handling code here:
        
        dispose();
        cadastrarProduto = new CadastrarProduto();
        cadastrarProduto.setIdLoja(loja);
        cadastrarProduto.setVisible(true);
    }//GEN-LAST:event_btn_goto_cadProdActionPerformed

    private void btn_gotoRegVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gotoRegVendaActionPerformed
        // TODO add your handling code here:
        
        dispose();
        registarVenda = new RegistarVenda();
        registarVenda.setIdLoja(loja);
        registarVenda.setVisible(true);
    }//GEN-LAST:event_btn_gotoRegVendaActionPerformed

    private void btn_goto_aquisicoesViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_goto_aquisicoesViewActionPerformed
        // TODO add your handling code here:
                      
        dispose();
        aquisicoesView = new AquisicoesView();
        aquisicoesView.setIdLoja(loja);
        aquisicoesView.setVisible(true);
    }//GEN-LAST:event_btn_goto_aquisicoesViewActionPerformed

    private void btn_goto_vendasViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_goto_vendasViewActionPerformed
        // TODO add your handling code here:
       
        dispose();
        vendasView = new VendasView();
        vendasView.setIdLoja(loja);
        vendasView.setVisible(true);
    }//GEN-LAST:event_btn_goto_vendasViewActionPerformed

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
            java.util.logging.Logger.getLogger(MainLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainLoja().setVisible(true);
            }
        });
    }
    
    public void setLoja(Loja shop){
        this.loja = shop;
        
        selectedShop.setText(loja.getNome());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_goBack;
    private javax.swing.JButton btn_gotoRegVenda;
    private javax.swing.JButton btn_goto_aquisicoesView;
    private javax.swing.JButton btn_goto_cadProd;
    private javax.swing.JButton btn_goto_vendasView;
    private javax.swing.JButton btn_home;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel selectedShop;
    // End of variables declaration//GEN-END:variables
}
