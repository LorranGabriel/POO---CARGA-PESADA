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

    private int idVeiculo;
    private String chassi;
    private String placa;
    private String status;
    private String tipoCombustivel;
    private int idCategoria;
    private int idSeguro;
    private int idModelo;   //referente ao ID
    private int idMotorista;
    private int idFinanciamento;
    private String nomeVeiculo;

    public String getChassi() {
        return this.chassi;
    }

    public int getIdCategoria() {
        return this.idCategoria;
    }

    public int getIdFinanciamento() {
        return this.idFinanciamento;
    }

    public int getIdModelo() {
        return this.idModelo;
    }

    public int getIdMotorista() {
        return this.idMotorista;
    }

    public int getIdSeguro() {
        return this.idSeguro;
    }

    public int getIdVeiculo() {
        return this.idVeiculo;
    }

    public String getNomeVeiculo() {
        return this.nomeVeiculo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public String getStatus() {
        return this.status;
    }

    public String getTipoCombustivel() {
        return this.tipoCombustivel;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public void setIdFinanciamento(int idFinanciamento) {
        this.idFinanciamento = idFinanciamento;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }

    public void setIdMotorista(int idMotorista) {
        this.idMotorista = idMotorista;
    }

    public void setIdSeguro(int idSeguro) {
        this.idSeguro = idSeguro;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public void setNomeVeiculo(String nomeVeiculo) {
        this.nomeVeiculo = nomeVeiculo;
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