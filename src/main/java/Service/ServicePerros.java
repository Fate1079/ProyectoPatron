/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Modelo.PerroDTO;
import Repositorios.RepositorioPerro;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ANDRES FELIPE
 */


public class ServicePerros {

    private final RepositorioPerro repositorio;

    public ServicePerros() {
        this.repositorio = new RepositorioPerro();
    }

    public boolean guardar(PerroDTO perro) throws SQLException {
        return repositorio.guardar(perro);
    }

    public ArrayList<PerroDTO> obtenerPerros() {
        return repositorio.getPerro();
    }

    public PerroDTO buscar(int codigo) {
        return repositorio.buscarPerro(codigo);
    }

    public boolean eliminar(int codigo) throws SQLException {
        return repositorio.eliminar(codigo);
    }

    public boolean editar(PerroDTO perro) throws SQLException {
        return repositorio.editar(perro);
    }
}