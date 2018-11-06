/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 20171BSI0367
 */
public class ConexaoBD {
    private static Connection instance = null;        
    
    private ConexaoBD() {
    }
    public static synchronized Connection getInstance() {
        if (instance == null) {
            try {
                Connection c = null;
                
                 String USUARIO = "nqygzcvg";
                 String SENHA = "Mr6i5_qmB1mEiJRKTbiQPDB1qXaHGqZ1";
                 //String URL = "jdbc:postgresql://localhost:5432/CARGAPESADA_4";
                 String URL = "jdbc:postgresql://stampy.db.elephantsql.com:5432/nqygzcvg";
              
                
             
                c =  DriverManager.getConnection(URL, USUARIO, SENHA);
                c.setAutoCommit(true);
                instance = c;
                System.out.println("Banco Conectado!");
            } catch (Exception e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
            }
        }
        return instance;
    }
    
}
