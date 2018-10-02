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
public class Servico {
    int id_servico;
    String status;
    String destino;
    String origem;
    float valor_contrato;
    String data_inicio;
    String data_fim;
    Cliente cliente;
    Funcionario funcionario;
    Veiculo veiculo;

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
    
}
