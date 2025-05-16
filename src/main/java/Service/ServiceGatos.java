/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Modelo.GatoDTO;
import Repositorios.RepositorioGato;
import java.sql.SQLException;
import java.util.ArrayList;


public class ServiceGatos {

    private final RepositorioGato repositorio;

    public ServiceGatos() {
        this.repositorio = new RepositorioGato();
    }

    public boolean guardar(GatoDTO gato) throws SQLException {
        return repositorio.guardar(gato);
    }

    public ArrayList<GatoDTO> obtenerGatos() {
        return repositorio.getGatos();
    }

    public GatoDTO buscar(int codigo) {
        return repositorio.BuscarGato(codigo);
    }

    public boolean eliminar(int codigo) throws SQLException {
        return repositorio.eliminar(codigo);
    }

    public boolean editar(GatoDTO gato) throws SQLException {
        return repositorio.editar(gato);
    }
}

