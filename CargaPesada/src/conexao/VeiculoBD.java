/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import modelo.Veiculo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 20181bsi0172
 */
public class VeiculoBD implements InterfaceBD{

    @Override
    public ArrayList select(String condicao) throws SQLException {
        ArrayList listVeiculos = new ArrayList();
        Connection c;
        Statement stmt;
        c = ConexaoBD.getInstance();
        stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM VEICULO;");
        while (rs.next()) {
            Veiculo veiculo = new Veiculo();
            veiculo.setIdVeiculo(rs.getInt("id"));
            veiculo.setPlaca(rs.getString("PLACA"));
            veiculo.setChassi(rs.getString("CHASSI"));
            veiculo.setStatus(rs.getString("STATUS"));
            veiculo.setTipoCombustivel(rs.getString("TIPO_COMBUSTIVEL"));
            veiculo.setIdCategoria(rs.getInt("ID_CATEGORIA"));
            veiculo.setIdModelo(rs.getInt("ID_MODELO"));
            veiculo.setIdSeguro(rs.getInt("ID_SEGURO"));
            veiculo.setIdFinanciamento(rs.getInt("ID_FIANCIAMENTO"));

            //Classes que compõe um motorista

            //veiculo.setModelo(rs.getString("MODELO"));
            //veiculo.setMotorista(rs.getString("MOTORISTA"))*/;
            //veiculo.setSeguro(rs.getInt("SEGURO"));
            //veiculo.setFinanciamento(rs.getInt("FIANCIAMENTO"));
            listVeiculos.add(veiculo);
        }
        rs.close();
        stmt.close();
        c.close();

        return listVeiculos;
    }

    @Override
    public void insert(Object obj) throws SQLException {
                Connection c;
        c = ConexaoBD.getInstance();
        Statement stmt;
        Veiculo novo = (Veiculo)obj;
        stmt = c.createStatement();
        stmt.executeQuery("INSERT INTO VEICULO(NOME, CHASSI, PLACA, STATUS, "
                + "COMBUSTIVEL, ID_CATEGORIA, ID_FINANCIAMENTO, ID_SEGURO, ID_MODELO, ID_MOTORISTA) values("
                +"'"+ novo.getNomeVeiculo()+
                "','"+ novo.getChassi()+ 
                "','"+ novo.getPlaca()+ 
                "','"+ novo.getStatus()+ 
                "','"+ novo.getTipoCombustivel()+
                "',"+ novo.getIdCategoria()+
                ","+ novo.getIdFinanciamento()+
                ","+ novo.getIdSeguro()+
                ","+ novo.getIdModelo()+
                ",NULL) RETURNING id");
        
        stmt.close();
        c.close();  
    }

    @Override
    public void delet(int id) throws SQLException {
        Connection c;
        Statement stmt;
        c = ConexaoBD.getInstance();
        stmt = c.createStatement();
        String sql = "DELETE from VEICULO where ID=" + id + ";";
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
        Veiculo novo = (Veiculo)obj;
        String sql = "UPDATE VEICULO "
                + "SET NOME ="+ novo.getNomeVeiculo() + ", "
                + "CHASSI="+ novo.getChassi() + ", "
                + "PLACA="+ novo.getPlaca() + ", "
                + "COMBUSTIVEL="+ novo.getTipoCombustivel() + ", "
                + "ID_CATEGORIA="+ novo.getIdCategoria() + ", "
                + "ID_MODELO="+ novo.getIdModelo() + ", "
                + "ID_MOTORISTA="+ novo.getIdMotorista() + " "
                + "WHERE id ="+ novo.getIdModelo() + ";";
        stmt.executeUpdate(sql);
        stmt.close();
        c.close();    
    }
    
}
