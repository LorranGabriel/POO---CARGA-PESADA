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
public class Endereco 
{

    private int idEndereco;
    private String endereco;
    private String estado;
    private String cidade;
    private String bairro ;
    private String referencia;
    private String logradouro;
    private String complemento;
    private int numero;
    private String cep;
   
    
    public String getComplemento() {
        return complemento;
    }

    public String getCep() {
        return this.cep;
    }

    public String getCidade() {
        return this.cidade;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getEstado() {
        return this.estado;
    }

    public int getIdEndereco() {
        return this.idEndereco;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getReferencia() {
        return this.referencia;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    public void setReferencia(String referencia){
        this.referencia = referencia;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}

