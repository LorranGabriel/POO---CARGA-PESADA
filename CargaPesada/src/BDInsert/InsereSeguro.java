/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDInsert;

import ConexaoBD.ConexaoBD;
import cargapesada.Modelo.Seguro;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author walla
 */
public class InsereSeguro {
    
    public void InsereNovo(Seguro novo) throws SQLException{
        Connection c = null;
        c = ConexaoBD.getInstance();
        Statement stmt = null;
        
        stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery("INSERT INTO SEGURO(status, DATA_VENCIMENTO, FIM_CONTRATO, VALOR) values('"+ novo.getStatus() + 
                "','"+ novo.getData_vencimento() +"','"+ novo.getFim_contrato() +"'," +novo.getValor()+ ") RETURNING id");
        
        
    }
    
}
