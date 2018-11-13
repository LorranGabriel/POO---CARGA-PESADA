/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author 20181bsi0172
 */
public class Financiamento 
{
    private int id_financiamento;
    private float valorParcela;
    private int parcelasTotais;
    private int parcelasPagas;
    private String bancoFinanciador;
    
    public int getId_financiamento() {
        return id_financiamento;
    }

    public void setId_financiamento(int id_financiamento) {
        this.id_financiamento = id_financiamento;
    }

    public float getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(float valorParcela) {
        this.valorParcela = valorParcela;
    }

    public int getParcelasTotais() {
        return parcelasTotais;
    }

    public void setParcelasTotais(int parcelasTotais) {
        this.parcelasTotais = parcelasTotais;
    }

    public int getParcelasPagas() {
        return parcelasPagas;
    }

    public void setParcelasPagas(int parcelasPagas) {
        this.parcelasPagas = parcelasPagas;
    }

    public String getBancoFinanciador() {
        return bancoFinanciador;
    }

    public void setBancoFinanciador(String bancoFinanciador) {
        this.bancoFinanciador = bancoFinanciador;
    }
    
    
    
}
