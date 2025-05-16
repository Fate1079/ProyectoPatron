/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

import Modelo.Gato;

/**
 *
 * @author MI PC
 */
public class ValidadorVacuna {
    private ValidacionVacunaStrategy estrategia;

    public void setEstrategia(ValidacionVacunaStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void ejecutarValidacion(Gato gato) {
        if (estrategia != null) {
            estrategia.validar(gato);
        }
    }
}
