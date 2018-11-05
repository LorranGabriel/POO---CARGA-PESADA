/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import modelo.Veiculo;
import java.sql.Connection;
import java.sql.DriverManager;
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
    public ArrayList select() {
        ArrayList listVeiculos = new ArrayList();
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("com.postgresql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/CargaPesada");
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM VEICULO;");
            while (rs.next()) {
                Veiculo veiculo = new Veiculo(null, null, null, null, null, null, null, null);
                veiculo.setId_veiculo(rs.getInt("id"));
                veiculo.setPlaca(rs.getString("PLACA"));
                veiculo.setChassi(rs.getString("CHASSI"));
                veiculo.setStatus(rs.getString("STATUS"));
                veiculo.setTipoCombustivel(rs.getString("TIPO_COMBUSTIVEL"));
                veiculo.setCategoria(rs.getString("TIPO_COMBUSTIVEL"));

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
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return listVeiculos;
    }

    @Override
    public void insert(Object updateObj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delet(int id) {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("com.postgresql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/CargaPesada");
            stmt = c.createStatement();
            String sql = "DELETE from VEICULO where ID=" + id + ";";
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
