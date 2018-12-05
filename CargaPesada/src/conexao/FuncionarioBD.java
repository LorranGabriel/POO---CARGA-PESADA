/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import modelo.Funcionario;
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
public class FuncionarioBD implements InterfaceBD{
    
    @Override
    public ArrayList select(String condicao) throws SQLException {
        ArrayList listFuncionarios = new ArrayList();
        Connection c;
        Statement stmt;
        c = ConexaoBD.getInstance();
        stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM funcionario;");
        while (rs.next()) {

            //OS DOIS CAMPOS PREENCHIDOS NAO ACEITAM NULL, PROCURAR SOLUÇÃO

            Funcionario funcionario = new Funcionario();
            funcionario.setIdFuncionario(rs.getInt("id"));
            funcionario.setNome(rs.getString("nome"));
            funcionario.setCpf(rs.getString("cpf"));
            funcionario.setCargo(rs.getString("cargo"));
            funcionario.setSalario(rs.getFloat("salario"));
            funcionario.setCargo(rs.getString("sexo"));
            funcionario.setCpf(rs.getString("data_cadastro"));
            funcionario.setCpf(rs.getString("data_nascimento"));
            //Classes que compõe um funcionario

            //funcionario.setContato(rs.getString("CONTATO"));
            //funcionario.setEndereco(rs.getString("MOTORISTA"));

            listFuncionarios.add(funcionario);
        }
        rs.close();
        stmt.close();
        c.close();

        return listFuncionarios;
    }

    @Override
    public void insert(Object obj) throws SQLException {
        Connection c;
        c = ConexaoBD.getInstance();
        Statement stmt;
        Funcionario novo = (Funcionario)obj;
        ResultSet rs;
        stmt = c.createStatement();
        rs = stmt.executeQuery("INSERT INTO FUNCIONARIO(NOME, CPF, CARGO, SALARIO, SEXO, DATA_CADASTRO, DATA_NASCIMENTO) values('"
                + novo.getNome()+"','" + novo.getCpf()+ "','" + novo.getCargo()+ "',"
                + novo.getSalario()+ ",'"+ novo.getSexo()+"','" + novo.getDataCadastro() +"','"+ novo.getDataNascimento() +"')");
        rs.close();
        stmt.close();
        c.close();  
    }

    @Override
    public void delet(int id) throws SQLException {
        Connection c = null;
        Statement stmt = null;
        c = ConexaoBD.getInstance();
        stmt = c.createStatement();
        String sql = "DELETE from FUNCIONARIO where ID=" + id + ";";
        stmt.executeUpdate(sql);
        stmt.close();
        c.close();
       
    }

    @Override
    public void update(Object obj) throws SQLException {
        Connection c;
        Statement stmt;
        c = ConexaoBD.getInstance();
        stmt = c.createStatement();
        Funcionario novo = (Funcionario)obj;
        String sql = "UPDATE FUNCIONARIO "
                + "SET NOME ="+ novo.getNome() + ", "
                + "CPF="+ novo.getCpf()+ ", "
                + "CARGO="+ novo.getCargo()+ ", "
                + "SALARIO="+ novo.getSalario()+ ", "
                + "SEXO="+ novo.getSexo()+ ", "
                + "DATA_CADASTRO="+ novo.getDataCadastro()+ ", "
                + "DATA_NASCIMENTO="+ novo.getDataNascimento()+ " "
                + "WHERE id ="+ novo.getIdFuncionario()+ ";";
        stmt.executeUpdate(sql);
        stmt.close();
        c.close();
    }

}
