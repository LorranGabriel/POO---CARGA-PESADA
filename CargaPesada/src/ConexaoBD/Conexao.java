/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 20171BSI0367
 */
public class Conexao {
    private static Connection instance = null;        
    
    private Conexao() {
    }
    public static synchronized Connection getInstance() {
        if (instance == null) {
            try {
                Connection c = null;
                
                 String USUARIO = "postgres";
                 String SENHA = "serra";
                 String URL = "jdbc:postgresql://127.0.0.1:5432/CargaPesada";
                 String DRIVER = "org.postgresql.Driver";
                
                //Class.forName("org.sqlite.JDBC");
                //c = DriverManager.getConnection("jdbc:sqlite:veiculo.db");
                c =  DriverManager.getConnection(URL, USUARIO, SENHA);
                c.setAutoCommit(true);
                
                instance = c;
            } catch (Exception e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
            }
        }
        return instance;
   }
    
}
