/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 20181bsi0172
 */
public class MotoristaDB implements InterfaceBD{

    @Override
    public ArrayList select() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
            String sql = "DELETE from MOTORISTA where ID=" + id + ";";
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
