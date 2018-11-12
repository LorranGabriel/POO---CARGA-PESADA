package modelo;

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

    private int id_veiculo;
    private String nome_veiculo;

    public String getNome_veiculo() {
        return nome_veiculo;
    }

    public void setNome_veiculo(String nome_veiculo) {
        this.nome_veiculo = nome_veiculo;
    }
    private String chassi;
    private String placa;
    private String status;
    private String tipoCombustivel;
    private String categoria;
    private int id_seguro;
    private int id_modelo;   //referente ao ID
    private int id_motorista;
    private int id_financiamento;


    public int getId_veiculo() {
        return id_veiculo;
    }

    public String getChassi() {
        return chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public String getStatus() {
        return status;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getId_seguro() {
        return id_seguro;
    }

    public void setId_seguro(int id_seguro) {
        this.id_seguro = id_seguro;
    }

    public int getId_modelo() {
        return id_modelo;
    }

    public void setId_modelo(int id_modelo) {
        this.id_modelo = id_modelo;
    }

    public int getId_motorista() {
        return id_motorista;
    }

    public void setId_motorista(int id_motorista) {
        this.id_motorista = id_motorista;
    }

    public int getId_financiamento() {
        return id_financiamento;
    }

    public void setId_financiamento(int id_financiamento) {
        this.id_financiamento = id_financiamento;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setId_veiculo(int id_veiculo) {
        this.id_veiculo = id_veiculo;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
}