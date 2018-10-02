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
public class Financiamento {
    int id_financiamento;
    float valorParcela;
    int parcelasTotais;
    int parcelasPagas;
    String bancoFinanciador;

    public Financiamento(float valorParcela, int parcelasTotais, int parcelasPagas, String financiador) {
        this.valorParcela = valorParcela;
        this.parcelasTotais = parcelasTotais;
        this.parcelasPagas = parcelasPagas;
        this.bancoFinanciador = bancoFinanciador;
    }
    
    
}
