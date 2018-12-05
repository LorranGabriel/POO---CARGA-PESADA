
import modelo.Contato;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lorran
 */
class Testa {
    
    
    
    public boolean Contatocheck (Contato numero){
        String cont = numero.getTelefone3();
        boolean flag = true;
        if (cont.contains("^[a-Z]")){
            flag =false;
        }
        return flag;
    }
    
    
}
