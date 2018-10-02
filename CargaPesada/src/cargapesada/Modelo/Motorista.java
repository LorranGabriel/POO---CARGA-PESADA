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
public class Motorista {
    
    int id_motorista;
    String nome;
    long cpf;
    long cnh;
    float salario;

    public Motorista(String nome, long cpf, long cnh, float salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.cnh = cnh;
        this.salario = salario;
    }
    
}
