
package cadastrodeproduto.model;


import cadastrodeproduto.pojo.CadProdPOJO;

public class CadProdMODEL {
    
    public void verificar_campos (CadProdPOJO pj) throws IllegalArgumentException
    
    
    {
            if(pj.getNome().equals("")){
            pj.setErro("Preencha o Nome");
            throw new IllegalArgumentException();
        }
    
    
    
    } 
   
    
}
