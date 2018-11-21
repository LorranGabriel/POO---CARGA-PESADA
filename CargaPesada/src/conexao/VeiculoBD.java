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
    public ArrayList select() throws SQLException {
        ArrayList listVeiculos = new ArrayList();
        Connection c;
        Statement stmt;
        c = ConexaoBD.getInstance();
        stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM VEICULO;");
        while (rs.next()) {
            Veiculo veiculo = new Veiculo();
            veiculo.setId_veiculo(rs.getInt("id"));
            veiculo.setPlaca(rs.getString("PLACA"));
            veiculo.setChassi(rs.getString("CHASSI"));
            veiculo.setStatus(rs.getString("STATUS"));
            veiculo.setTipoCombustivel(rs.getString("TIPO_COMBUSTIVEL"));
            veiculo.setId_categoria(rs.getInt("ID_CATEGORIA"));
            

            //Classes que compõe um motorista

            //veiculo.setModelo(rs.getString("MODELO"));
            //veiculo.setMotorista(rs.getString("MOTORISTA"));
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
                +"'"+ novo.getNome_veiculo()+
                "','"+ novo.getChassi()+ 
                "','"+ novo.getPlaca()+ 
                "','"+ novo.getStatus()+ 
                "','"+ novo.getTipoCombustivel()+
                "','"+ novo.getId_categoria()+
                "','"+ novo.getId_financiamento()+
                "','"+ novo.getId_seguro()+
                "',"+ novo.getId_modelo()+
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
                + "SET NOME ="+ novo.getNome_veiculo() + ", "
                + "CHASSI="+ novo.getChassi() + ", "
                + "PLACA="+ novo.getPlaca() + ", "
                + "COMBUSTIVEL="+ novo.getTipoCombustivel() + ", "
                + "ID_CATEGORIA="+ novo.getId_categoria() + ", "
                + "ID_MODELO="+ novo.getId_modelo() + ", "
                + "ID_MOTORISTA="+ novo.getId_motorista() + " "
                + "WHERE id ="+ novo.getId_modelo() + ";";
        stmt.executeUpdate(sql);
        stmt.close();
        c.close();    
    }
    
}
