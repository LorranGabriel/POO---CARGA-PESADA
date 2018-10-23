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
        System.out.println("Base de dados aberta ");   
        String insere;
        insere = "INSERT INTO CATEGORIA(nome) values('moretto') RETURNING id ";
        
        
        
        
        PreparedStatement sta;    //  PrepareStatement sta = c.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
        sta = c.prepareStatement(insere);
        
       // sta.executeUpdate();
       // ResultSet rsID = sta.getGeneratedKeys();
        ResultSet rsID = sta.executeQuery();
        if(rsID.next())
        {
            int id =  rsID.getInt("id");
            System.out.println("id = " + id);
        }
       
        c.close();        
    }
    
    
}
