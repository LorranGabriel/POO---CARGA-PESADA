/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoBD;

import cargapesada.Modelo.Seguro;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 20181bsi0172
 */
public class SeguroBD implements InterfaceBD{

    @Override
    public ArrayList select() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(Object updateObj) {
       Connection c = null;
        c = ConexaoBD.getInstance();
        Statement stmt = null;
        Seguro novo = (Seguro)updateObj;
        ResultSet rs = null;
        try {
            stmt = c.createStatement();
            rs = stmt.executeQuery("INSERT INTO SEGURO(status, DATA_VENCIMENTO, FIM_CONTRATO, VALOR) values('"+ novo.getStatus() + 
                "','"+ novo.getData_vencimento() +"','"+ novo.getFim_contrato() +"'," +novo.getValor()+ ") RETURNING id");
            
            while (rs.next()){
                novo.setId_seguro(rs.getShort("id"));
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(SeguroBD.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
        
        }
        
        
    }

    @Override
    public void delet(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Object updateObj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
