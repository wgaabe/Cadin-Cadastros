/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrodeproduto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import cadastrodeproduto.pojo.CadProdPOJO;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import cadastrodeproduto.pojo.CadProdPOJO;

/**
 *
 * @author cedup
 */
public class Cadastrar_produto {

    
     public static ConPooling cn = ConPooling.getInstance();
   
     public int inserir_produto(CadProdPOJO cpj)
     {
        Connection con = cn.getConnection();
        int n=0;
        String sql = "insert into auladoiss (nome,marca) values(?,?);";
        try{
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, cpj.getNome());
            p.setString(2, cpj.getMarca());
            
            
            n=p.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cadastrado Com Sucesso","Cadastro",1);
            
            
            
            
        }catch(SQLException e){
            cn.retConnection(con);
            JOptionPane.showMessageDialog(null, e ); //no lugar do e da para colocar uma mensagem de erro ex "ta errado"
        }
        return n;
        
        
    }
     
      public List read(String nome) {
        List  lista = new ArrayList();//nao muda
        
        try {
            String sql="select * from auladoiss where nome like  ?;";
            Connection con = cn.getConnection();//nao muda
            PreparedStatement p = con.prepareStatement(sql);//nao muda
            p.setString(1, nome+"%");
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                CadProdPOJO cp = new CadProdPOJO();
                cp.setCodigo(rs.getInt("codigo"));
                cp.setNome(rs.getString("nome"));
                cp.setMarca(rs.getString("marca"));
                
          
                lista.add(cp);
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(Cadastrar_produto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        return lista;
     
  }
      
      
       public int alterar_produto(CadProdPOJO produto){
           Connection con = cn.getConnection();
           String sql = "update auladoiss set nome = ?, marca = ? where codigo = ?; ";
           int confirmar=0;
           try {
               PreparedStatement p = con.prepareStatement(sql);
               p.setString(1, produto.getNome());
               p.setString(2, produto.getMarca());
               p.setInt(3, produto.getCodigo());
               
               confirmar=p.executeUpdate();
               
               if (confirmar > 0 ){
                JOptionPane.showMessageDialog(null, "Alterado Com Sucesso","Alterar Produto",1);
               }
           } catch (Exception e) {
               
           }
           
           return confirmar;
       }
       
       public CadProdPOJO verificar_login_usuario_unico(int codigo){
        
        CadProdPOJO jp = new CadProdPOJO();
        Connection con = cn.getConnection();
        System.out.println(codigo+"");
        String sql =("select * from auladoiss where codigo = "+codigo+";");
        try {
                PreparedStatement p = con.prepareStatement(sql);
                ResultSet rs = p.executeQuery();
                rs.next();
                jp.setCodigo(rs.getInt("codigo"));
                jp.setNome(rs.getString("nome"));
                jp.setMarca(rs.getString("marca"));
                
                
                System.out.println(rs.getInt("codigo"));
                }
         catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
        }
        
        return jp;
       }
       public void excluirproduto (int codigo){
           
           Connection con = cn.getConnection();
           String sql = "delete from auladoiss where codigo="+codigo;
           try {
               PreparedStatement p = con.prepareStatement(sql);
               p.executeUpdate();
           } catch (Exception e) {
           }
       }
}
