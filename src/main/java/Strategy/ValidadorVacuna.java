/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

import Modelo.GatoDTO;

/**
 *
 * @author MI PC
 */
public class ValidadorVacuna {
    private ValidacionVacunaStrategy estrategia;

    public void setEstrategia(ValidacionVacunaStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void ejecutarValidacion(GatoDTO gato) {
        if (estrategia != null) {
            estrategia.validar(gato);
        }
    }
}
