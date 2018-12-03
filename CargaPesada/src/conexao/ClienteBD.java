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
import java.util.ArrayList;

/**
 *
 * @author 20181bsi0172
 */
public class ClienteBD implements InterfaceBD{

    @Override
    public ArrayList select(String condicao) throws SQLException{
        ArrayList listCliente = new ArrayList();
        Connection c;
        Statement stmt;
        c = ConexaoBD.getInstance();
        stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM CATEGORIA;");
        while (rs.next()) {

            //OS DOIS CAMPOS PREENCHIDOS NAO ACEITAM NULL, PROCURAR SOLUÇÃO
            Cliente cliente = new Cliente();
            cliente.setIdCliente(rs.getInt("id"));
            cliente.setNome(rs.getString("nome"));
            cliente.setCnpj(rs.getString("CNPJ"));
            cliente.setCpf(rs.getString("CPF"));

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
                + ""+ novo.getNome() +"','" + novo.getTipo_cliente()+ "','" + novo.getCnpj()+ "','"
                + novo.getCpf() + "','"+ novo.getData_atual() + "') return id");
         if(rs.next()){
            novo.setIdCliente(rs.getInt(1));
        }
        stmt.executeQuery("INSERT INTO ENDERECO_CLIENTE(ID_CLIENTE, ID_ENDERECO) values('"
                + ""+ novo.getIdCliente() +"','" + novo.getId_endereco()+"')");
        
        stmt.executeQuery("INSERT INTO CONTATO_CLIENTE(ID_CONTATO, ID_CLIENTE) values('"
                + ""+ novo.getIdContato() +"','" + novo.getIdCliente()+"')");
        
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
                + "SET NOME ="+ novo.getTipo_cliente()+ ", "
                + "CNPJ="+ novo.getCnpj() + ","
                + "CPF="+ novo.getCpf() + ","
                + "DATA_CADASTRO="+ novo.getData_atual() + " "
                + "WHERE id ="+ novo.getIdCliente() + ";";
        stmt.executeUpdate(sql);
        stmt.close();
        c.close();
    }
    
}
