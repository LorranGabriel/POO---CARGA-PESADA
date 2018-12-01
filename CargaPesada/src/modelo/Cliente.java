package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 20181bsi0172
 */
public class Cliente
    {
        private int idCliente;
        private String nome;
        private long cnpj;
        private long cpf;
        private int idEndereco;
        private int idContato;
        private String dataCadastro;
        private String tipoCliente;
        private String email;

    public long getCnpj() {
        return this.cnpj;
    }

    public long getCpf() {
        return this.cpf;
    }

    public String getDataCadastro() {
        return this.dataCadastro;
    }

    public String getEmail() {
        return this.email;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public int getIdContato() {
        return this.idContato;
    }

    public int getIdEndereco() {
        return this.idEndereco;
    }

    public String getNome() {
        return this.nome;
    }

    public String getTipoCliente() {
        return this.tipoCliente;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setIdContato(int idContato) {
        this.idContato = idContato;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
 
        
}
