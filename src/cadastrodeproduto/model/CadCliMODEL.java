
package cadastrodeproduto.model;

import cadastrodeproduto.pojo.CadCliPOJO;
import cadastrodeproduto.pojo.CadProdPOJO;


public class CadCliMODEL {
    
    
    public void verificar_campos_cli (CadCliPOJO pj) throws IllegalArgumentException
    
    {
            if(pj.getNome().equals("")){
            pj.setErro("Preencha o Nome");
            throw new IllegalArgumentException();
        }
    
    
    
    } 
    
    
    
    
}
