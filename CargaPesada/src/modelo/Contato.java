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
public class Contato
{
    
    private int idContato;
    private int telefone1;
    private int telefone2;
    private int telefone3;
    private String email;

    public String getEmail() {
        return this.email;
    }

    public int getIdContato() {
        return this.idContato;
    }

    public int getTelefone1() {
        return this.telefone1;
    }

    public int getTelefone2() {
        return this.telefone2;
    }

    public int getTelefone3() {
        return this.telefone3;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdContato(int idContato) {
        this.idContato = idContato;
    }

    public void setTelefone1(int telefone1) {
        this.telefone1 = telefone1;
    }

    public void setTelefone2(int telefone2) {
        this.telefone2 = telefone2;
    }

    public void setTelefone3(int telefone3) {
        this.telefone3 = telefone3;
    }

    
}
