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
 * @author 20162bsi0325
 */
public class SelectFuncionarios {
    public synchronized ArrayList selectTable() {
        ArrayList listFuncionarios = new ArrayList();
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("com.postgresql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/CargaPesada");
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
}
