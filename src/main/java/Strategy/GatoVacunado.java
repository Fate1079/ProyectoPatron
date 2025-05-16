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
public class GatoVacunado implements ValidacionVacunaStrategy {
    @Override
    public void validar(Gato gato) {
        System.out.println("✅ El gato está vacunado. Es seguro.");
    }
}