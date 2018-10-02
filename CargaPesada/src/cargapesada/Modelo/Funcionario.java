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
public class Funcionario {
    int id_funcionario;
    String nome;
    long cpf;
    float salario;
    String cargo;
    Endereco endereco;
    Contato contato;

    public Funcionario(String nome, long cpf, float salario, String cargo, Endereco endereco, Contato contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.cargo = cargo;
        this.endereco = endereco;
        this.contato = contato;
    }

    
    
}
