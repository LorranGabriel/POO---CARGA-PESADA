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
    private int id_servico;
    private String status;
    private String destino;
    private String origem;
    private float valor_contrato;
    private String data_inicio;
    private String data_fim;
    private Cliente cliente;
    private Funcionario funcionario;
    private Veiculo veiculo;

    public Servico(String status, String destino, String origem, float valor_contrato, String data_inicio, String data_fim, Cliente cliente, Funcionario funcionario, Veiculo veiculo) {
        this.status = status;
        this.destino = destino;
        this.origem = origem;
        this.valor_contrato = valor_contrato;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.veiculo = veiculo;
    }
    
    public int getId_servico() {
        return id_servico;
    }

    public void setId_servico(int id_servico) {
        this.id_servico = id_servico;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public float getValor_contrato() {
        return valor_contrato;
    }

    public void setValor_contrato(float valor_contrato) {
        this.valor_contrato = valor_contrato;
    }

    public String getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(String data_inicio) {
        this.data_inicio = data_inicio;
    }

    public String getData_fim() {
        return data_fim;
    }

    public void setData_fim(String data_fim) {
        this.data_fim = data_fim;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    
}
