/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoBD;

//import java.sql.Connection;
//import java.sql.Statement;
import java.sql.*;
/**
 *
 * @author 20171BSI0367
 */
public class CategoriaBDtest {
    
    
    public CategoriaBDtest() throws SQLException
    {
        Connection c = null;
        c = ConexaoBD.getInstance();
        Statement stmt = null;
        
        stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery("INSERT INTO CATEGORIA(nome) values('ID RETU') RETURNING id");
           
        //PreparedStatement consulta = null;
        //insere = "select max(id) as ID from categoria";
        //consulta = c.prepareStatement("INSERT INTO CATEGORIA(nome) values('ID RETU') RETURNING id");
   
        
        //ResultSet rs = consulta.executeQuery();
        if(rs.next())
        {
            int id =  rs.getInt("id");
            System.out.println("Ultimo Id = " + id);
        }
        stmt.close();
        c.close();        
    }
    
    
}
