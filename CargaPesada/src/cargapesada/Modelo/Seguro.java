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
public class Seguro {
    int id_seguro;
    String status;
    String data_vencimento;
    String fim_contrato;
    
    public Seguro(String status, String data_vencimento, String fim_contrato) {
        this.status = status;
        this.data_vencimento = data_vencimento;
        this.fim_contrato = fim_contrato;
    }
    
}
