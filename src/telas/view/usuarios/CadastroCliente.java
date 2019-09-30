/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.view.usuarios;


import cadastrodeproduto.dao.CadastrarClientes;
import cadastrodeproduto.dao.Cadastrar_produto;
import cadastrodeproduto.pojo.CadProdPOJO;
import cadastrodeproduto.model.CadProdMODEL;
import javax.swing.JOptionPane;
import cadastrodeproduto.dao.Cadastrar_produto;
import cadastrodeproduto.model.CadCliMODEL;
import cadastrodeproduto.pojo.CadCliPOJO;

/**
 *
 * @author cedup
 */
public class CadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form CafastroProduto
     */
    public CadastroCliente() {
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
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        TCodCliente = new javax.swing.JTextField();
        LCadastroCliente = new javax.swing.JLabel();
        LNome = new javax.swing.JLabel();
        TNomeCli = new javax.swing.JTextField();
        TTelefoneCli = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BCadastrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TCpfCli = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TRgCli = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TEmailCli = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadastrodeproduto/icon/icons8-adicionar-imagem-80.png"))); // NOI18N

        jButton1.setText("Carregar Foto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TCodCliente.setEditable(false);
        TCodCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCodClienteActionPerformed(evt);
            }
        });

        LCadastroCliente.setText("Cadastro Cliente");

        LNome.setText("Nome");

        TNomeCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TNomeCliActionPerformed(evt);
            }
        });

        jLabel4.setText("Telefone");

        BCadastrar.setText("CADASTRAR");
        BCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCadastrarActionPerformed(evt);
            }
        });

        jLabel5.setText("CPF");

        jLabel6.setText("RG");

        jLabel7.setText("E-mail");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4)
                                .addComponent(LCadastroCliente)
                                .addComponent(TCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LNome)
                                .addComponent(jSeparator1)
                                .addComponent(TTelefoneCli)
                                .addComponent(BCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TCpfCli)
                            .addComponent(jLabel6)
                            .addComponent(TRgCli)
                            .addComponent(jLabel7)
                            .addComponent(TEmailCli))
                        .addGap(60, 60, 60))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButton1)))
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(LCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(LNome)
                .addGap(4, 4, 4)
                .addComponent(TNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TTelefoneCli, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TCpfCli, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TRgCli, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TEmailCli, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(BCadastrar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCadastrarActionPerformed
        
        CadCliPOJO ccp = new CadCliPOJO();
        CadCliMODEL ccm = new CadCliMODEL();
        CadastrarClientes cc = new CadastrarClientes();
        
        
        
        ccp.setNome(TNomeCli.getText());
        ccp.setCpf(TCpfCli.getText());
        ccp.setEmail(TEmailCli.getText());
        ccp.setTelefone(Integer.parseInt(TTelefoneCli.getText()));
        ccp.setRg(Integer.parseInt(TRgCli.getText()));
        
        try {
           ccm.verificar_campos_cli(ccp);
           int n = cc.inserir_cliente(ccp);
           
        
                }catch 
            (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, ccp.getErro()+ "Verifique Novamente !","Erro",2);
        }
        
        
        
        
        
        
    }//GEN-LAST:event_BCadastrarActionPerformed

    private void TNomeCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TNomeCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TNomeCliActionPerformed

    private void TCodClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCodClienteActionPerformed

    }//GEN-LAST:event_TCodClienteActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCadastrar;
    private javax.swing.JLabel LCadastroCliente;
    private javax.swing.JLabel LNome;
    private javax.swing.JTextField TCodCliente;
    private javax.swing.JTextField TCpfCli;
    private javax.swing.JTextField TEmailCli;
    private javax.swing.JTextField TNomeCli;
    private javax.swing.JTextField TRgCli;
    private javax.swing.JTextField TTelefoneCli;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
