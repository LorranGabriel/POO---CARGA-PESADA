/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoBD;

import cargapesada.Modelo.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 20181bsi0172
 */
public class ClienteBD implements InterfaceBD{

    @Override
    public ArrayList select() {
        ArrayList listCliente = new ArrayList();
        Connection c = null;
        Statement stmt = null;
        try {
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
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return listCliente;
    }

    @Override
    public void insert(Object updateObj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delet(int id) {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("com.postgresql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/CargaPesada");
            stmt = c.createStatement();
            String sql = "DELETE from CLIENTE where ID=" + id + ";";
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": "
                    + e.getMessage());
        }
    }

    @Override
    public void update(Object updateObj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
