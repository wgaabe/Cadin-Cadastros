/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.view.produto;


import java.util.List;
import cadastrodeproduto.dao.Cadastrar_produto;
import cadastrodeproduto.pojo.CadProdPOJO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cedup
 */
public class BuscarProduto extends javax.swing.JFrame {

    /**
     * Creates new form BuscarProduto
     */
    public BuscarProduto() {
        initComponents();
        buscarProduto();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TTabelaProdutos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        TPesquisa = new javax.swing.JTextField();
        BExcluir = new javax.swing.JButton();
        BAlterarProduto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BPesquisar.setText("Pesquisar");
        BPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPesquisarActionPerformed(evt);
            }
        });

        TTabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Produto", "Modelo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TTabelaProdutos);

        jLabel1.setText("Pesquisar Produto");

        TPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TPesquisaKeyReleased(evt);
            }
        });

        BExcluir.setText("Excluir");
        BExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BExcluirActionPerformed(evt);
            }
        });

        BAlterarProduto.setText("Alterar");
        BAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAlterarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TPesquisa)
                            .addComponent(jLabel1))
                        .addGap(2, 2, 2)
                        .addComponent(BPesquisar)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(BAlterarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(BExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BExcluir)
                    .addComponent(BAlterarProduto))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limparTabela()
    {
        if(TTabelaProdutos.getRowCount()>0)
        {
            for(int i=TTabelaProdutos.getRowCount()-1; i>=0;i--)
            {
                ((DefaultTableModel) TTabelaProdutos.getModel()).removeRow(0);
            }
        }
    }
    public void buscarProduto()
    {

        Cadastrar_produto cp = new Cadastrar_produto();
        List list = cp.read(TPesquisa.getText());
        int num=TTabelaProdutos.getSelectedRowCount();
        DefaultTableModel dtm = (DefaultTableModel)TTabelaProdutos.getModel();
        limparTabela();
        

        for(int i = 0; i<list.size(); i++){
            //String ferramenta="Sim";
            CadProdPOJO cad = (CadProdPOJO)list.get(i);
            
            
            
            dtm.addRow(new Object[]{cad.getCodigo(), cad.getNome(), cad.getMarca()});
        }
    }
    private void BPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPesquisarActionPerformed
       
        
        buscarProduto();
      
        
        
     
    }//GEN-LAST:event_BPesquisarActionPerformed

    private void BExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BExcluirActionPerformed
        if(TTabelaProdutos.getSelectedRow()>=0){
            if(JOptionPane.showConfirmDialog(this, "Deseja realmente Excluir ?")==0){
                Cadastrar_produto cp = new Cadastrar_produto();
                cp.excluirproduto(Integer.parseInt(""+TTabelaProdutos.getValueAt(TTabelaProdutos.getSelectedRow(), 0 )));
                limparTabela();
                buscarProduto();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um Produto");
        }
            
    }//GEN-LAST:event_BExcluirActionPerformed

    private void BAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAlterarProdutoActionPerformed
        int codigo = Integer.parseInt(""+TTabelaProdutos.getValueAt(TTabelaProdutos.getSelectedRow(), 0));
        alterarproduto ap = new alterarproduto(codigo);
            ap.setVisible(true);
    }//GEN-LAST:event_BAlterarProdutoActionPerformed

    private void TPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TPesquisaKeyReleased
          buscarProduto();
    }//GEN-LAST:event_TPesquisaKeyReleased

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
            java.util.logging.Logger.getLogger(BuscarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAlterarProduto;
    private javax.swing.JButton BExcluir;
    private javax.swing.JButton BPesquisar;
    private javax.swing.JTextField TPesquisa;
    private javax.swing.JTable TTabelaProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}