/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Modelo;
/**
 *
 * @author 20181bsi0172
 */
public class ModeloBD implements InterfaceBD{

    @Override
    public ArrayList select() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(Object obj) throws SQLException {
        Connection c;
        c = ConexaoBD.getInstance();
        Statement stmt;
        Modelo novo = (Modelo)obj;
        ResultSet rs;
        stmt = c.createStatement();
        rs = stmt.executeQuery("INSERT INTO MODELO(MODELO, MARCA, ANO, EIXO, PESO, ALTURA, LARGURA, COMPRIMENTO, COR) values('"
                + novo.getModelo()+"','" + novo.getMarca()+ "','" + novo.getAno()+ 
                "',"+ novo.getQuantEixos() + 
                "," + novo.getPeso() +
                "," + novo.getAltura() +
                ","+ novo.getLargura() +
                ","+ novo.getComprimento() +
                ",'"+ novo.getCor() +"')");
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
