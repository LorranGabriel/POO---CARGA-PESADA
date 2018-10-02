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
public class Endereco {
    int id_endereco;
    String endereco;
    String logradouro;
    int numero;
    int cep;

    public Endereco(String endereco, String logradouro, int numero, int cep) {
        this.endereco = endereco;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
    }
    
    
    
}
