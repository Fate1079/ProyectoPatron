/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Modelo.VeterinarioDTO;
import Repositorios.RepositorioLogin;

/**
 *
 * @author ANDRES FELIPE
 */


public class ServiceLogin {

    public boolean registrarVeterinario(VeterinarioDTO veterinario) {
        return RepositorioLogin.register(veterinario);
    }

    public boolean autenticarVeterinario(String usuario, String contraseña) {
        return RepositorioLogin.login(usuario, contraseña);
    }
}

