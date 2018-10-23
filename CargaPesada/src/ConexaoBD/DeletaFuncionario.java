/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoBD;

import java.sql.*;

/**
 *
 * @author 20162bsi0325
 */
public class DeletaFuncionario {

    public void deleta(int id) {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("com.postgresql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/CargaPesada");
            stmt = c.createStatement();
            String sql = "DELETE from FUNCIONARIO where ID=" + id + ";";
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": "
                    + e.getMessage());
        }
    }
}
