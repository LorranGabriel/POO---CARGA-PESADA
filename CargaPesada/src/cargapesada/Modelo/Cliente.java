package cargapesada.Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 20181bsi0172
 */
public class Cliente {
    int id_cliente;
    String nome;
    long cnpj;
    long cpf;
    Endereco endereco;
    Contato contatus;

    public Cliente(String nome, long cnpj, long cpf, Endereco endereco, Contato contato) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contatus = contato;
    }
    
}
