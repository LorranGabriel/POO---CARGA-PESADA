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
public class Veiculo {
    int id_veiculo;
    String chassi;
    String placa;
    String status;
    String tipoCombustivel;
    String categoria;
    Seguro seguro;
    Modelo modelo;
    Motorista motorista;
    Financiamento financiamento;

    public Veiculo(String chassi, String placa, String status, String tipoCombustivel, String categoria, Seguro seguro, Modelo modelo, Motorista motorista, Financiamento financiamento) {
        this.chassi = chassi;
        this.placa = placa;
        this.status = status;
        this.tipoCombustivel = tipoCombustivel;
        this.categoria = categoria;
        this.seguro = seguro;
        this.modelo = modelo;
        this.motorista = motorista;
        this.financiamento = financiamento;
    }
    


    
    
    
   
}
