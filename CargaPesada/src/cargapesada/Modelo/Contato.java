/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargapesada.Modelo;

/**
 *
 * @author 20181bsi0172
 */
public class Contato {
    int id_contato;
    int telefone1;
    int telefone2;
    String email;

    public Contato(int telefone1, int telefone2, String email) {
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.email = email;
    }
    
    
}
