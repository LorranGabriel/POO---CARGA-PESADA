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
public class Motorista {
    
    private int idMotorista;
    private int idFuncionario;
    private String nome;
    private String dataVencimento;
    private String categoriaCnh;
    private String cpf;
    private String cnh;
    private float salario;

    public String getCategoriaCnh() {
        return this.categoriaCnh;
    }

    public String getCnh() {
        return this.cnh;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getDataVencimento() {
        return this.dataVencimento;
    }

    public int getIdFuncionario() {
        return this.idFuncionario;
    }

    public int getIdMotorista() {
        return this.idMotorista;
    }

    public String getNome() {
        return this.nome;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setCategoriaCnh(String categoriaCnh) {
        this.categoriaCnh = categoriaCnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public void setIdMotorista(int idMotorista) {
        this.idMotorista = idMotorista;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
