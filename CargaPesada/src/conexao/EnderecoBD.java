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
import modelo.Endereco;
/**
 *
 * @author 20181bsi0172
 */
public class EnderecoBD implements InterfaceBD{

    @Override
    public ArrayList select(String condicao) throws SQLException {
        ArrayList listEndereco = new ArrayList();
        Connection c;
        Statement stmt;
        c = ConexaoBD.getInstance();
        stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM ENDERECO;");
        while (rs.next()) {

            //OS DOIS CAMPOS PREENCHIDOS NAO ACEITAM NULL, PROCURAR SOLUÇÃO
            Endereco endereco = new Endereco();
            endereco.setIdEndereco(rs.getInt("id"));
            endereco.setEndereco(rs.getString("ENDERECO"));
            endereco.setLogradouro(rs.getString("LOGRADOURO"));
            endereco.setNumero(rs.getInt("NUMERO"));
            endereco.setCep(rs.getString("CEP"));
            endereco.setComplemento(rs.getString("COMPLEMENTO"));
            endereco.setCidade(rs.getString("CIDADE"));
            endereco.setEstado(rs.getString("ESTADO"));


            listEndereco.add(endereco);
        }
        
        rs.close();
        stmt.close();
        c.close();
        
        return listEndereco;
    }

    @Override
    public void insert(Object obj) throws SQLException {
        Connection c;
        c = ConexaoBD.getInstance();
        Statement stmt;
        Endereco novo = (Endereco)obj;
        ResultSet rs;
        stmt = c.createStatement();
        rs = stmt.executeQuery("INSERT INTO ENDERECO(ENDERECO, LOGRADOURO, NUMERO, CEP, COMPLEMENTO, CIDADE, ESTADO) values('"
                + novo.getEndereco()+"','" + novo.getLogradouro()+ "'," + novo.getNumero()+ ",'"
                + novo.getCep()+ "','"+ novo.getComplemento() + "','" + novo.getCidade() +"','"+novo.getEstado()+"') RETURNING id");
        if(rs.next()){
            novo.setIdEndereco(rs.getInt(1));
        }
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
        String sql = "DELETE from ENDERECO where ID=" + id + ";";
        
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
        Endereco novo = (Endereco)obj;
        String sql = "UPDATE ENDERECO "
                + "SET ENDERECO ="+ novo.getEndereco() + ", "
                + "LOGRADOURO="+ novo.getLogradouro() + ", "
                + "NUMERO="+ novo.getNumero() + ", "
                + "CEP="+ novo.getCep() + ", "
                + "COMPLEMENTO="+ novo.getComplemento() + ", "
                + "CIDADE="+ novo.getCidade() + ", "
                + "ESTADO="+ novo.getEstado() + " "
                + "WHERE id ="+ novo.getIdEndereco() + ";";
        stmt.executeUpdate(sql);
        stmt.close();
        c.close();
    }
    
}
