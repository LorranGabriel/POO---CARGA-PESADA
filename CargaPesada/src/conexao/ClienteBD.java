/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import modelo.Cliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 20181bsi0172
 */
public class ClienteBD implements InterfaceBD{

    @Override
    public ArrayList select() throws SQLException{
        ArrayList listCliente = new ArrayList();
        Connection c;
        Statement stmt;
        c = ConexaoBD.getInstance();
        stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM CATEGORIA;");
        while (rs.next()) {

            //OS DOIS CAMPOS PREENCHIDOS NAO ACEITAM NULL, PROCURAR SOLUÇÃO
            Cliente cliente = new Cliente();
            cliente.setId_cliente(rs.getInt("id"));
            cliente.setNome(rs.getString("nome"));
            cliente.setCnpj(rs.getLong("CNPJ"));
            cliente.setCpf(rs.getLong("CPF"));

            listCliente.add(cliente);
        }
        
        rs.close();
        stmt.close();
        c.close();
        
        return listCliente;
    }

    @Override
    public void insert(Object obj) throws SQLException {
        Connection c;
        c = ConexaoBD.getInstance();
        Statement stmt;
        Cliente novo = (Cliente)obj;
        ResultSet rs;
        stmt = c.createStatement();
        rs = stmt.executeQuery("INSERT INTO CLIENTE(NOME, TIPO_CLIENTE, CNPJ, CPF, DATA_CADASTRO) values('"
                + ""+ novo.getNome() +"','" + novo.getTipoCliente() + "','" + novo.getCnpj()+ "','"
                + novo.getCpf() + "','"+ novo.getDataAtual() + "')");
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
        String sql = "DELETE from CLIENTE where ID=" + id + ";";
        
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
        Cliente novo = (Cliente)obj;
        String sql = "UPDATE CLIENTE "
                + "SET NOME ="+ novo.getNome() + ", "
                + "TIPO_CLIENTE="+ novo.getTipoCliente() + ", "
                + "CNPJ="+ novo.getCnpj() + ","
                + "CPF="+ novo.getCpf() + ","
                + "DATA_CADASTRO="+ novo.getDataCadastro() + " "
                + "WHERE id ="+ novo.getId_cliente() + ";";
        stmt.executeUpdate(sql);
        stmt.close();
        c.close();
    }
    
}
