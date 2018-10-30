/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoBD;

import cargapesada.Modelo.Funcionario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 20181bsi0172
 */
public class FuncionarioBD implements InterfaceBD{
    
    @Override
    public ArrayList select() {
        ArrayList listFuncionarios = new ArrayList();
        Connection c = null;
        Statement stmt = null;
        try {
            c = ConexaoBD.getInstance();
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM VEICULO;");
            while (rs.next()) {
                
                //OS DOIS CAMPOS PREENCHIDOS NAO ACEITAM NULL, PROCURAR SOLUÇÃO
                
                Funcionario funcionario = new Funcionario(null, 12345678996L, 1500.45F, null, null, null);
                funcionario.setId_funcionario(rs.getInt("id"));
                funcionario.setNome(rs.getString("NOME"));
                funcionario.setSalario(rs.getFloat("SALARIO"));
                funcionario.setCargo(rs.getString("CARGO"));
                funcionario.setCpf(rs.getLong("CPF"));
                
                
                //Classes que compõe um funcionario
                
                //funcionario.setContato(rs.getString("CONTATO"));
                //funcionario.setEndereco(rs.getString("MOTORISTA"));
                
                listFuncionarios.add(funcionario);
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return listFuncionarios;
    }

    @Override
    public void insert() {
        
    }

    @Override
    public void delet(int id) {
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

    @Override
    public void update(Object updateObj) {
        Funcionario updateFuncionario = (Funcionario) updateObj;
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
