/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formViews;

import controller.AquisicaoJpaController;
import controller.FornecedorJpaController;
import controller.ProdutoJpaController;
import entitys.Aquisicao;
import entitys.Fornecedor;
import entitys.Loja;
import entitys.Produto;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mainViews.MainLoja;
import productsView.AquisicoesView;

/**
 *
 * @author aderito
 */
public class CadastrarProduto extends javax.swing.JFrame {
    Loja loja;
    Produto produto;
    Aquisicao aquisicao;
    MainLoja mainLoja;
    AquisicaoJpaController ajc;
    ProdutoJpaController pjc;
    
    /**
     * Creates new form cadastrarProduto
     */
    public CadastrarProduto() {
        initComponents();
        
        produto = new Produto();
        aquisicao = new Aquisicao();
        ajc = new AquisicaoJpaController();
        pjc = new ProdutoJpaController();
        FornecedorJpaController fjc = new FornecedorJpaController();
        
        for(Fornecedor f: fjc.findFornecedorEntities()){
            cBox_fornecedor.addItem(f);   
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SistemaGestaoStockPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("SistemaGestaoStockPU").createEntityManager();
        fornecedorQuery = java.beans.Beans.isDesignTime() ? null : SistemaGestaoStockPUEntityManager.createQuery("SELECT f FROM Fornecedor f");
        fornecedorList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : fornecedorQuery.getResultList();
        jPanel1 = new javax.swing.JPanel();
        spinner_qtdAquisicao = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        txt_PrecoCompra = new javax.swing.JTextField();
        txt_NomeProduto = new javax.swing.JTextField();
        btn_cadastrarProduto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        title_cad_Produto = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        datePicker_dataAquisicao = new org.jdesktop.swingx.JXDatePicker();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_PrecoVenda = new javax.swing.JTextField();
        cBox_fornecedor = new javax.swing.JComboBox<>();
        btn_goBack_MainLoja = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));

        spinner_qtdAquisicao.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel5.setText("Data de aquisicao");

        txt_PrecoCompra.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N

        txt_NomeProduto.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N

        btn_cadastrarProduto.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        btn_cadastrarProduto.setText("Submeter");
        btn_cadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarProdutoActionPerformed(evt);
            }
        });
        btn_cadastrarProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_cadastrarProdutoKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel2.setText("Nome");

        title_cad_Produto.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        title_cad_Produto.setText("Cadastrar Produto");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel4.setText("Quantidade");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel3.setText("Fornecedor");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel6.setText("Preco de Compra");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel1.setText("Preco de Venda");

        txt_PrecoVenda.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N

        btn_goBack_MainLoja.setText("<--");
        btn_goBack_MainLoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_goBack_MainLojaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_PrecoCompra)
                    .addComponent(txt_PrecoVenda)
                    .addComponent(cBox_fornecedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_NomeProduto)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(spinner_qtdAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(datePicker_dataAquisicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(41, 41, 41)
                                .addComponent(jLabel5))
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_goBack_MainLoja)
                                .addGap(165, 165, 165)
                                .addComponent(title_cad_Produto)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(btn_cadastrarProduto)
                .addContainerGap(265, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title_cad_Produto)
                    .addComponent(btn_goBack_MainLoja))
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_NomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cBox_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinner_qtdAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datePicker_dataAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_PrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_PrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btn_cadastrarProduto)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarProdutoActionPerformed
      
        try {      
            produto.setNome(txt_NomeProduto.getText());
            produto.setPrecoCompra(Double.parseDouble(txt_PrecoCompra.getText()));
            produto.setPrecoVenda(Double.parseDouble(txt_PrecoVenda.getText()));
            produto.setIdloja(loja);
            
            pjc.create(produto);

            aquisicao.setDataAquisicao(datePicker_dataAquisicao.getDate());
            aquisicao.setQtdAdquirida((Integer) spinner_qtdAquisicao.getValue());
            aquisicao.setIdproduto(produto.getIdproduto());
            
            aquisicao.setIdfornecedor((Fornecedor) cBox_fornecedor.getSelectedItem());
            ajc.create(aquisicao);
            
            JOptionPane.showMessageDialog(null
                    , "Produto cadastrado com sucesso!"
                    , "Mensagem"
                    , JOptionPane.INFORMATION_MESSAGE);
            
            AquisicoesView aquisicoesView = new AquisicoesView();
                
            dispose();
            aquisicoesView.setIdLoja(loja);
            aquisicoesView.setVisible(true);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null
                    , e.getMessage()
                    , "Mensagem de Erro"
                    , JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(CadastrarProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_cadastrarProdutoActionPerformed

    private void btn_goBack_MainLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_goBack_MainLojaActionPerformed
        // TODO add your handling code here:
        dispose();
        mainLoja = new MainLoja();
        mainLoja.setLoja(loja);
        mainLoja.setVisible(true);
    }//GEN-LAST:event_btn_goBack_MainLojaActionPerformed

    private void btn_cadastrarProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_cadastrarProdutoKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ENTER){           
            try {

                produto.setNome(txt_NomeProduto.getText());
                produto.setPrecoCompra(Double.parseDouble(txt_PrecoCompra.getText()));
                produto.setPrecoVenda(Double.parseDouble(txt_PrecoVenda.getText()));
                produto.setIdloja(loja);

                pjc.create(produto);

                aquisicao.setDataAquisicao(datePicker_dataAquisicao.getDate());
                aquisicao.setQtdAdquirida((Integer) spinner_qtdAquisicao.getValue());
                aquisicao.setIdproduto(produto.getIdproduto());

                aquisicao.setIdfornecedor((Fornecedor) cBox_fornecedor.getSelectedItem());
                ajc.create(aquisicao);

                JOptionPane.showMessageDialog(null
                        , "Produto cadastrado com sucesso!"
                        , "Mensagem"
                        , JOptionPane.INFORMATION_MESSAGE);

                AquisicoesView aquisicoesView = new AquisicoesView();
                
                dispose();
                aquisicoesView.setIdLoja(loja);
                aquisicoesView.setVisible(true);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null
                        , e.getMessage()
                        , "Mensagem de Erro"
                        , JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                Logger.getLogger(CadastrarProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_cadastrarProdutoKeyPressed

    public void setIdLoja(Loja loja){
        this.loja = loja;
    }
    
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
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager SistemaGestaoStockPUEntityManager;
    private javax.swing.JButton btn_cadastrarProduto;
    private javax.swing.JButton btn_goBack_MainLoja;
    private javax.swing.JComboBox<Object> cBox_fornecedor;
    private org.jdesktop.swingx.JXDatePicker datePicker_dataAquisicao;
    private java.util.List<entitys.Fornecedor> fornecedorList;
    private javax.persistence.Query fornecedorQuery;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner spinner_qtdAquisicao;
    private javax.swing.JLabel title_cad_Produto;
    private javax.swing.JTextField txt_NomeProduto;
    private javax.swing.JTextField txt_PrecoCompra;
    private javax.swing.JTextField txt_PrecoVenda;
    // End of variables declaration//GEN-END:variables
}
