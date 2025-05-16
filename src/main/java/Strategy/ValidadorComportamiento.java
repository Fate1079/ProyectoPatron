/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

import Modelo.Perro;

/**
 *
 * @author MI PC
 */
public class ValidadorComportamiento {
    private IComportamientoRaza estrategia;

    public void setEstrategia(IComportamientoRaza estrategia) {
        this.estrategia = estrategia;
    }

    public void ejecutarValidacion(Perro perro) {
        estrategia.validar(perro);
    }
}
