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
public class Cliente
    {
        private int idCliente;
        private String nome= "";

        private String cnpj = "";
        private String cpf= "";
        private int id_endereco;
        private String data_atual= "";
        private String tipo_cliente= "";

        private String email;
        private int idContato;

       
    public String getCnpj() {
        return this.cnpj;
    }
    
    public void setId_endereco(int id){
        this.id_endereco = id;
    }


    public String getData_atual() {
        return this.data_atual;
    }

    public String getEmail() {
        return this.email;
    }

    public int getIdCliente() {
        return this.idCliente;
    }



    public void setData_atual(String data) {
        this.data_atual = data;    
    }
    
    public int getIdContato() {
        return this.idContato;
    }

    public int getId_endereco() {
        return this.id_endereco;
    }

    public String getNome() {
        return this.nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo_cliente() {
        return this.tipo_cliente;

    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {

    

        this.cpf = cpf;
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

    public void setTipoCliente(String tipoCliente) {
        this.tipo_cliente = tipoCliente;
    }
 
        
}
