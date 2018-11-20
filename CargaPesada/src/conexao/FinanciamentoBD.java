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
import modelo.Financiamento;
/**
 *
 * @author 20181bsi0172
 */
public class FinanciamentoBD implements InterfaceBD{

    @Override
    public ArrayList select() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(Object obj) throws SQLException {
        Connection c;
        c = ConexaoBD.getInstance();
        Statement stmt;
        Financiamento novo = (Financiamento)obj;
        ResultSet rs;
        stmt = c.createStatement();
        rs = stmt.executeQuery("INSERT INTO FINANCIAMENTO(VALOR_PARCELA, PARCELAS_TOTAIS, PARCELAS_PAGAS, FINANCIADOR, ID_VEICULO) values('"
                + novo.getValorParcela()+"," + novo.getParcelasTotais()+ "," + novo.getParcelasPagas()+ ",'"
                + novo.getBancoFinanciador()+ "','" + novo.getIdVeiculo() +"')");
        rs.close();
        stmt.close();
        c.close();
    }

    @Override
    public void delet(int id) throws SQLException {
        Connection c;
        Statement stmt;
        c = ConexaoBD.getInstance();
        stmt = c.createStatement();
        String sql = "DELETE from FINANCIAMENTO where ID=" + id + ";";
        
        stmt.executeUpdate(sql);
        stmt.close();
        c.close();
    }

    @Override
    public void update(Object obj) throws SQLException {
        Connection c;
        Statement stmt;
        c = ConexaoBD.getInstance();
        stmt = c.createStatement();
        Financiamento novo = (Financiamento)obj;
        String sql = "UPDATE FINANCIAMENTO "
                + "SET VALOR_PARCELA ="+ novo.getValorParcela() + ", "
                + "PARCELAS_TOTAIS="+ novo.getParcelasTotais() + ", "
                + "FINANCIADOR="+ novo.getBancoFinanciador() + ", "
                + "ID_VEICULO="+ novo.getIdVeiculo() + " "
                + "WHERE id ="+ novo.getId_financiamento() + ";";
        stmt.executeUpdate(sql);
        stmt.close();
        c.close();
    }
    
}
