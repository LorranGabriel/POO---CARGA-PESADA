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
import modelo.Servico;
/**
 *
 * @author 20181bsi0172
 */
public class ServicoBD implements InterfaceBD{

    @Override
    public ArrayList select(String condicao) throws SQLException {
         ArrayList listServico = new ArrayList();
        Connection c;
        Statement stmt;
        c = ConexaoBD.getInstance();
        stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM SERVICO;");
        while (rs.next()) {

            //OS DOIS CAMPOS PREENCHIDOS NAO ACEITAM NULL, PROCURAR SOLUÇÃO

            Servico servico = new Servico();
            servico.setDataFim(rs.getNString("DATA_FIM"));
            servico.setDataInicio(rs.getNString("DATA_INICIO"));
            servico.setIdDestino(rs.getInt("ID_ENDERECO_DESTINO"));
            servico.setIdOrigem(rs.getInt("ID_ENDERECO_ORIGEM"));
            servico.setIdFuncionario(rs.getInt(rs.getInt("ID_FUNCIONARIO")));
            servico.setIdServico(rs.getInt("ID"));
            servico.setIdVeiculo(rs.getInt("ID_VEICULO"));
            servico.setStatus(rs.getNString("STATUS"));
            servico.setValorContrato(rs.getFloat("VALOR_CONTRATO"));
            //Classes que compõe um funcionario

            //funcionario.setContato(rs.getString("CONTATO"));
            //funcionario.setEndereco(rs.getString("MOTORISTA"));

            listServico.add(servico);
        }
        rs.close();
        stmt.close();
        c.close();

        return listServico;    
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
                "',"+ novo.getValorContrato()+ 
                ",'"+ novo.getDataInicio()+ 
                "','"+ novo.getDataFim()+ 
                "',"+ novo.getIdCliente()+
                ","+ novo.getIdFuncionario()+
                ","+ novo.getIdVeiculo()+
                ","+ novo.getIdDestino()+
                ","+ novo.getIdOrigem() +")");
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
                Connection c;
        Statement stmt;
        c = ConexaoBD.getInstance();
        stmt = c.createStatement();
        Servico novo = (Servico)obj;
        String sql = "UPDATE SERVICO "
                + "SET STATUS ="+ novo.getStatus() + ", "
                + "VALOR_CONTRATO="+ novo.getValorContrato() + ", "
                + "DATA_INICIO="+ novo.getDataInicio() + ", "
                + "DATA_FIM="+ novo.getDataFim() + ", "
                + "ID_CLIENTE="+ novo.getIdCliente() + ", "
                + "ID_FUNCIONARIO="+ novo.getIdFuncionario() + ", "
                + "ID_VEICULO="+ novo.getIdVeiculo() + ", "
                + "ID_ENDERECO_DESTINO="+ novo.getIdDestino() + ", "
                + "ID_ENDERECO_ORIGEM="+ novo.getIdOrigem() + " "
                + "WHERE id ="+ novo.getIdServico() + ";";
        stmt.executeUpdate(sql);
        stmt.close();
        c.close();   
    }
    
}
