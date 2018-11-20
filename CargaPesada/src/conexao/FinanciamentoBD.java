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
                ArrayList listFinanciamento = new ArrayList();
        Connection c;
        Statement stmt;
        c = ConexaoBD.getInstance();
        stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM ENDERECO;");
        while (rs.next()) {

            //OS DOIS CAMPOS PREENCHIDOS NAO ACEITAM NULL, PROCURAR SOLUÇÃO
            Financiamento financiamento = new Financiamento();
            financiamento.setId_financiamento(rs.getInt("id"));
            financiamento.setValorParcela(rs.getFloat("VALOR_PARCELA"));
            financiamento.setParcelasTotais(rs.getInt("PARCELAS_TOTAIS"));
            financiamento.setParcelasPagas(rs.getInt("PARCELAS_PAGAS"));
            financiamento.setId_financiamento(rs.getInt("FINANCIADOR"));
            financiamento.setidVeiculo(rs.getString("ID_VEICULO"));



            listFinanciamento.add(financiamento);
        }
        
        rs.close();
        stmt.close();
        c.close();
        
        return listFinanciamento;
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
