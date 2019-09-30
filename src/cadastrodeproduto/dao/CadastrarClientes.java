/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrodeproduto.dao;

import static cadastrodeproduto.dao.Cadastrar_produto.cn;
import cadastrodeproduto.pojo.CadCliPOJO;
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
public class CadastrarClientes {

    
     public static ConPooling cn = ConPooling.getInstance();
   
     public int inserir_cliente(CadCliPOJO cpj)
     {
        Connection con = cn.getConnection();
        int n=0;
        String sql = "insert into usuarios (nome,telefone,cpf,rg,email) values(?,?,?,?,?);";
        try{
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, cpj.getNome());
            p.setInt(2, cpj.getTelefone());
            p.setString(3, cpj.getCpf());
            p.setInt(4, cpj.getRg());
            p.setString(5, cpj.getEmail());
            
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
            String sql="select * from usuarios where nome like  ?;";
            Connection con = cn.getConnection();//nao muda
            PreparedStatement p = con.prepareStatement(sql);//nao muda
            p.setString(1, nome+"%");
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                CadCliPOJO cp = new CadCliPOJO();
                cp.setNome(rs.getString("nome"));
                cp.setTelefone(rs.getInt("telefone"));
                cp.setCpf(rs.getString("cpf"));
                cp.setRg(rs.getInt("rg"));
                cp.setEmail(rs.getString("email"));
                cp.setCodigo(rs.getInt("codigo"));
          
                lista.add(cp);
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(CadastrarClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        return lista;
     
  }
      
      
       public int alterar_cliente(CadCliPOJO cliente){
           Connection con = cn.getConnection();
           String sql = "update usuarios set nome = ?, telefone = ?, cpf = ?, rg = ?,email = ? where codigo = ?; ";
           int confirmar=0;
           try {
               PreparedStatement p = con.prepareStatement(sql);
               p.setString(1, cliente.getNome());
               p.setInt(2, cliente.getTelefone());
               p.setString(2, cliente.getCpf());
               p.setInt(2, cliente.getRg());
               p.setString(1, cliente.getEmail());
               p.setInt(3, cliente.getCodigo());
               
               confirmar=p.executeUpdate();
               
               if (confirmar > 0 ){
                JOptionPane.showMessageDialog(null, "Alterado Com Sucesso","Alterar Cliente",1);
               }
           } catch (Exception e) {
              
           }
           
           return confirmar;
       }
       
//       
       public void excluirproduto (int codigo){
           
           Connection con = cn.getConnection();
           String sql = "delete from usuarios where codigo="+codigo;
           try {
               PreparedStatement p = con.prepareStatement(sql);
               p.executeUpdate();
           } catch (Exception e) {
           }
       }
       
       public CadCliPOJO verificar_login_usuario_unico(int codigo){
        
        CadCliPOJO cpp = new CadCliPOJO();
        Connection con = cn.getConnection();
        System.out.println(codigo+"");
        String sql =("select * from usuarios where codigo = "+codigo+";");
        try {
                PreparedStatement p = con.prepareStatement(sql);
                ResultSet rs = p.executeQuery();
                rs.next();
                cpp.setCodigo(rs.getInt("codigo"));
                cpp.setNome(rs.getString("nome"));
                cpp.setTelefone(rs.getInt("telefone"));
                cpp.setCpf(rs.getString("cpf"));
                cpp.setRg(rs.getInt("rg"));
                cpp.setEmail(rs.getString("email"));
                
                
                System.out.println(rs.getInt("codigo"));
                }
         catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
        }
        
        return cpp;
       }
       
       
}
