/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Servico;
/**
 *
 * @author 20181bsi0172
 */
public class ServicoBD implements InterfaceBD{

    @Override
    public ArrayList select() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(Object obj) throws SQLException {
        Connection c;
        c = ConexaoBD.getInstance();
        Statement stmt;
        Servico novo = (Servico)obj;
        ResultSet rs;
        stmt = c.createStatement();
        rs = stmt.executeQuery("INSERT INTO SERVICO(STATUS, VALOR_CONTRATO, DATA_INICIO, DATA_FIM, "
                + "ID_CLIENTE, ID_FUNCIONARIO, ID_VEICULO, ID_ENDERECO_DESTINO, ID_ENDERECO_ORIGEM) values("
                +"'"+ novo.getStatus()+
                "',"+ novo.getValor_contrato()+ 
                ",'"+ novo.getData_inicio()+ 
                "','"+ novo.getData_fim()+ 
                "',"+ novo.getId_cliente()+
                ","+ novo.getId_funcionario()+
                ","+ novo.getId_veiculo()+
                ","+ novo.getDestino()+
                ","+ novo.getOrigem() +")");
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
        String sql = "DELETE from SERVICO where ID=" + id + ";";
        stmt.executeUpdate(sql);
        stmt.close();
        c.close();
    }

    @Override
    public void update(Object obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
