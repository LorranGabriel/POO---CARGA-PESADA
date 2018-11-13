/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import modelo.Seguro;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author 20181bsi0172
 */
public class SeguroBD implements InterfaceBD{

    @Override
    public ArrayList select() throws SQLException{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(Object obj) throws SQLException {
       Connection c;
        c = ConexaoBD.getInstance();
        Statement stmt;
        Seguro novo = (Seguro)obj;
        ResultSet rs;
        stmt = c.createStatement();
        rs = stmt.executeQuery("INSERT INTO SEGURO(status, DATA_VENCIMENTO, FIM_CONTRATO, VALOR) values('"+ novo.getStatus() + 
            "','"+ novo.getData_vencimento() +"','"+ novo.getFim_contrato() +"'," +novo.getValor()+ ") RETURNING id");
        novo.setId_seguro(5);
        rs.close();
        stmt.close();
        c.close();
    }

    @Override
    public void delet(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Object obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
