/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoBD;

/*
*
 *
 * @author 20162bsi0325

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import cargapesada.Modelo.*;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author 20162bsi0325
 */
public class SelectVeiculos {

    public synchronized ArrayList selectTable() {
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
}
