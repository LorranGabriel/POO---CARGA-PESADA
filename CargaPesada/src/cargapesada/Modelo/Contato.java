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
public class Contato
{
    
    private int id_contato;
    private int telefone1;
    private int telefone2;
    private String email;

    public Contato(int telefone1, int telefone2, String email) 
    {
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.email = email;
    }

    public int getId_contato() {
        return id_contato;
    }

    public void setId_contato(int id_contato) {
        this.id_contato = id_contato;
    }

    public int getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(int telefone1) {
        this.telefone1 = telefone1;
    }

    public int getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(int telefone2) {
        this.telefone2 = telefone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
}
