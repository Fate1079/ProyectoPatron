/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Gato;
import Singleton.DatabaseConfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ANDRES FELIPE
 */
public class RepositorioGato {
    ArrayList<Gato>listaGato;

    public RepositorioGato() {
        listaGato=new ArrayList<>();
    }
    
    public ArrayList<Gato> getGatos(){
        return listaGato;
    }
    public boolean guardar(Gato gato) throws SQLException {
    String consulta = "INSERT INTO gato (codigo, nombre, edad, vacunado, detalle_alergia) VALUES (?, ?, ?, ?, ?)";
    
    try (Connection conexion = DatabaseConfig.getInstance().getConnection();
         PreparedStatement ps = conexion.prepareStatement(consulta)) {
        
        ps.setInt(1, gato.getCodigo());
        ps.setString(2, gato.getNombre());
        ps.setInt(3, gato.getEdad());
        ps.setString(4, gato.getVacunado());
        ps.setString(5, gato.getDetalleAlergia());
        
        ps.executeUpdate();
        
        return true;
    }
}

    
  public Gato BuscarGato(int codigo) {
    String query = "SELECT * FROM gato WHERE codigo = ?";

    try (Connection conn = DatabaseConfig.getInstance().getConnection();
         PreparedStatement ps = conn.prepareStatement(query)) {

        ps.setInt(1, codigo);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            return new Gato.Builder()
                .setVacunado(rs.getString("vacunado"))
                .setDetalleAlergia(rs.getString("detalle_alergia"))
                .setNombre(rs.getString("nombre"))
                .setCodigo(rs.getInt("codigo"))
                .setEdad(rs.getInt("edad"))
                .build();
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return null;
}
  public boolean eliminar(int codigo) throws SQLException {
    String consulta = "DELETE FROM gato WHERE codigo = ?";

    try (Connection conexion = DatabaseConfig.getInstance().getConnection();
         PreparedStatement ps = conexion.prepareStatement(consulta)) {

        ps.setInt(1, codigo);

        int filasAfectadas = ps.executeUpdate();
        return filasAfectadas > 0;
    }
}
    public boolean editar(Gato gato) throws SQLException {
    String consulta = "UPDATE gato SET nombre = ?, edad = ?, vacunado = ?, detalle_alergia = ? WHERE codigo = ?";

    try (Connection conexion = DatabaseConfig.getInstance().getConnection();
         PreparedStatement ps = conexion.prepareStatement(consulta)) {

        ps.setString(1, gato.getNombre());
        ps.setInt(2, gato.getEdad());
        ps.setString(3, gato.getVacunado());
        ps.setString(4, gato.getDetalleAlergia());
        ps.setInt(5, gato.getCodigo());

        int filasAfectadas = ps.executeUpdate();
        return filasAfectadas > 0;
    }
}
}
