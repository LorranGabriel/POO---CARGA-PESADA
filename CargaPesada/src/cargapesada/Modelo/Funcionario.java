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
public class Funcionario {

    private int id_funcionario;
    private String nome;
    private long cpf;
    private float salario;
    private String cargo;
    private int id_endereco;
    private int id_contato;

    //private Endereco endereco;
    //private Contato contato;


    public int getId_funcionario() {
        return id_funcionario;
    }

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }

    public float getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }
 

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
 

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

}
