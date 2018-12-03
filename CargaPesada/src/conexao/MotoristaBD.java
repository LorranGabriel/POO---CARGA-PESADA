/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Motorista;
/**
 *
 * @author 20181bsi0172
 */
public class MotoristaBD implements InterfaceBD{

    @Override
    public ArrayList select(String condicao) throws SQLException {
        
        ArrayList listMotorista = new ArrayList();
        Connection c;
        Statement stmt;
        c = ConexaoBD.getInstance();
        stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM MOTORISTA;");
        while (rs.next()) {

            //OS DOIS CAMPOS PREENCHIDOS NAO ACEITAM NULL, PROCURAR SOLUÇÃO

            Motorista motorista = new Motorista();
            motorista.setIdMotorista(rs.getInt("ID"));
            motorista.setCategoriaCnh(rs.getNString("CATEGORIA_CNH"));
            motorista.setCnh(rs.getString("CNH"));
            motorista.setCpf(rs.getString("CPF"));
            motorista.setDataVencimento(rs.getNString("DATA_VENCIMENTO"));
            motorista.setIdFuncionario(rs.getInt("ID_FUNCIONARIO"));


            //Classes que compõe um funcionario

            //funcionario.setContato(rs.getString("CONTATO"));
            //funcionario.setEndereco(rs.getString("MOTORISTA"));

            listMotorista.add(motorista);
        }
        rs.close();
        stmt.close();
        c.close();

        return listMotorista;    
    }

    @Override
    public void insert(Object obj) throws SQLException {
        Connection c;
        c = ConexaoBD.getInstance();
        Statement stmt;
        Motorista novo = (Motorista)obj;
        ResultSet rs;
        stmt = c.createStatement();
        rs = stmt.executeQuery("INSERT INTO MOTORISTA(CNH, DATA_VENCIMENTO, CATEGORIA_CNH, ID_FUNCIONARIO) values("
                + novo.getCnh()+",'" + novo.getDataVencimento()+ "','" + novo.getCategoriaCnh()+","+ novo.getIdFuncionario() +"')");
        rs.close();
        stmt.close();
        c.close();      }

    @Override
    public void delet(int id) throws SQLException {
        Connection c;
        Statement stmt;
        c = ConexaoBD.getInstance();
        stmt = c.createStatement();
        String sql = "DELETE from MOTORISTA where ID=" + id + ";";
        stmt.executeUpdate(sql);
        stmt.close();
        c.close();
    }

    @Override
    public void update(Object obj) throws SQLException{
        Connection c;
        Statement stmt;
        c = ConexaoBD.getInstance();
        stmt = c.createStatement();
        Motorista novo = (Motorista)obj;
        String sql = "UPDATE MOTORISTA "
                + "SET CNH ="+ novo.getCnh() + ", "
                + "DATA_VENCIMENTO="+ novo.getDataVencimento() + ", "
                + "CATEGORIA_CNH="+ novo.getCategoriaCnh() + ", "
                + "ID_FUNCIONARIO="+ novo.getIdFuncionario() + " "
                + "WHERE id ="+ novo.getIdMotorista() + ";";
        stmt.executeUpdate(sql);
        stmt.close();
        c.close();  
    }
    
}
