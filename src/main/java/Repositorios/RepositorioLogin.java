/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositorios;

import Modelo.VeterinarioDTO;
import Singleton.DatabaseConfig;
import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author ANDRES FELIPE
 */
public class RepositorioLogin {
    
    public static boolean register(VeterinarioDTO veterinario) {
    String query = "INSERT INTO users (id, username, password, edad, experencia) VALUES (?, ?, ?, ?, ?)";

    try (java.sql.Connection conn = DatabaseConfig.getInstance().getConnection();
         PreparedStatement ps = conn.prepareStatement(query)) {

        String hashedPassword = hashPassword(veterinario.getContraseña());

        ps.setInt(1, veterinario.getCodigo());
        ps.setString(2, veterinario.getNombre());
        ps.setString(3, hashedPassword);
        ps.setString(4, veterinario.getEdad());
        ps.setString(5, veterinario.getExperencia());

        int result = ps.executeUpdate();
        return result > 0;

    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}

    public static boolean login(String username, String password) {
        String query = "SELECT password FROM users WHERE username = ?";

        try (java.sql.Connection conn = DatabaseConfig.getInstance().getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String storedPasswordHash = rs.getString("password");
                return checkPassword(password, storedPasswordHash);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    private static String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    private static boolean checkPassword(String password, String storedHash) {
        return BCrypt.checkpw(password, storedHash);
    }
}
