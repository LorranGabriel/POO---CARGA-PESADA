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
public class Servico 
{
    private int idServico;
    private String status;
    private int idDestino;
    private int idOrigem;
    private float valorContrato;
    private String dataInicio;
    private String dataFim;
    private int idCliente;
    private int idFuncionario;
    private int idVeiculo;

    public int getIdServico() {
        return this.idServico;
    }


    public String getStatus() {
        return this.status;
    }


    public int getIdDestino() {
        return this.idDestino;
    }


    public int getIdOrigem() {
        return this.idOrigem;
    }

    public float getValorContrato() {
        return this.valorContrato;
    }

    public String getDataInicio() {
        return this.dataInicio;
    }

    public String getDataFim() {
        return this.dataFim;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public int getIdFuncionario() {
        return this.idFuncionario;
    }

    public int getIdVeiculo() {
        return this.idVeiculo;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setIdDestino(int idDestino) {
        this.idDestino = idDestino;
    }

    public void setIdOrigem(int idOrigem) {
        this.idOrigem = idOrigem;
    }

    public void setValorContrato(float valorContrato) {
        this.valorContrato = valorContrato;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }
}
