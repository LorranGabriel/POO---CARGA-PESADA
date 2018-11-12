/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JComboBox;

/**
 *
 * @author 20181bsi0172
 */
public class Seguro {
    
    public static int id_seguro = 50; //test
    private String status;
    private String data_vencimento;
    private String fim_contrato;
    private float Valor;
    //String status, String data_vencimento, String fim_contrato
    public Seguro() {
    }

    public float getValor() {
        return Valor;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }

    
    public static int getId_seguro() {
        return id_seguro;
    }

    public void setId_seguro(int id_seguro) {
        this.id_seguro = id_seguro;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getData_vencimento() {
        return data_vencimento;
    }

    public void setData_vencimento(String data_vencimento) {
        this.data_vencimento = data_vencimento;
    }

    public String getFim_contrato() {
        return fim_contrato;
    }

    public void setFim_contrato(String fim_contrato) {
        this.fim_contrato = fim_contrato;
    }
    
    
}
