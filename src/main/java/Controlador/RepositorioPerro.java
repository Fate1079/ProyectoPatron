/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Perro;
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
public class RepositorioPerro {
    ArrayList<Perro> listaPerro;

    public RepositorioPerro() {
        listaPerro= new ArrayList<>();
    }
    public ArrayList<Perro> getPerro(){
        return listaPerro;
    }
    
   public boolean guardar(Perro perro) throws SQLException {
    String consulta = "INSERT INTO perro (codigo, nombre, edad, raza, direccion) VALUES (?, ?, ?, ?, ?)";

    try (Connection conexion = DatabaseConfig.getInstance().getConnection();
         PreparedStatement ps = conexion.prepareStatement(consulta)) {

        ps.setInt(1, perro.getCodigo());
        ps.setString(2, perro.getNombre());
        ps.setInt(3, perro.getEdad());
        ps.setString(4, perro.getRaza());
        ps.setString(5, perro.getDireccion());

        int resultado = ps.executeUpdate();
        return resultado > 0;
    }
}

  public Perro buscarPerro(int codigo) {
    String query = "SELECT * FROM perro WHERE codigo = ?";

    try (Connection conn = DatabaseConfig.getInstance().getConnection();
         PreparedStatement ps = conn.prepareStatement(query)) {

        ps.setInt(1, codigo);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            return new Perro.Builder()
                .setCodigo(rs.getInt("codigo"))
                .setNombre(rs.getString("nombre"))
                .setEdad(rs.getInt("edad"))
                .setRaza(rs.getString("raza"))
                .setDireccion(rs.getString("direccion"))
                .build();
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return null;
}



    public boolean EliminarPerro(int codigo){
        for(Perro perro:listaPerro){
            if(perro.getCodigo()==codigo){
                listaPerro.remove(perro);
                return true;
            }
        }
        return false;
    }
    
    public boolean EditarPerro(Perro nuevoPerro){
        for (int i = 0; i < listaPerro.size(); i++) {
            Perro get = listaPerro.get(i);
            if(get.getCodigo()==nuevoPerro.getCodigo()){
                listaPerro.set(i, nuevoPerro);
                return true;
            }
            
        }
        return false;
    }
}
