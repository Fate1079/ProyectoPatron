/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositorios;

import Modelo.Perro;
import Singleton.DatabaseConfig;
import Strategy.ComportamientoPeligroso;
import Strategy.ComportamientoTranquilo;
import Strategy.IComportamientoRaza;
import Strategy.ValidadorComportamiento;
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
        listaPerro = new ArrayList<>();
    }

    public ArrayList<Perro> getPerro() {
        return listaPerro;
    }

    public boolean guardar(Perro perro) throws SQLException {
        ValidadorComportamiento validador = new ValidadorComportamiento();

        if (perro.getRaza().equalsIgnoreCase("Bulldog") || perro.getRaza().equalsIgnoreCase("Pastor Alemán")) {
            validador.setEstrategia(new ComportamientoPeligroso());
        } else {
            validador.setEstrategia((IComportamientoRaza) new ComportamientoTranquilo());
        }

        validador.ejecutarValidacion(perro);

        String consulta = "INSERT INTO perro (codigo, nombre, edad, raza, direccion) VALUES (?, ?, ?, ?, ?)";

        try (Connection conexion = DatabaseConfig.getInstance().getConnection(); PreparedStatement ps = conexion.prepareStatement(consulta)) {

            ps.setInt(1, perro.getCodigo());
            ps.setString(2, perro.getNombre());
            ps.setInt(3, perro.getEdad());
            ps.setString(4, perro.getRaza());
            ps.setString(5, perro.getDireccion());

            ps.executeUpdate();
            return true;
        }
    }

    public Perro buscarPerro(int codigo) {
        String query = "SELECT * FROM perro WHERE codigo = ?";

        try (Connection conn = DatabaseConfig.getInstance().getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {

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

    public boolean eliminar(int codigo) throws SQLException {
        String consulta = "DELETE FROM perro WHERE codigo = ?";

        try (Connection conexion = DatabaseConfig.getInstance().getConnection(); PreparedStatement ps = conexion.prepareStatement(consulta)) {

            ps.setInt(1, codigo);

            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;
        }
    }

    public boolean editar(Perro perro) throws SQLException {
        String consulta = "UPDATE perro SET nombre = ?, edad = ?, raza = ?, direccion = ? WHERE codigo = ?";

        try (Connection conexion = DatabaseConfig.getInstance().getConnection(); PreparedStatement ps = conexion.prepareStatement(consulta)) {

            ps.setString(1, perro.getNombre());
            ps.setInt(2, perro.getEdad());
            ps.setString(3, perro.getRaza());
            ps.setString(4, perro.getDireccion());
            ps.setInt(5, perro.getCodigo());

            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;
        }
    }
}
