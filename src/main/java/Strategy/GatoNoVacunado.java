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
public class GatoNoVacunado implements ValidacionVacunaStrategy {
    @Override
    public void validar(GatoDTO gato) {
        System.out.println("⚠️ El gato NO está vacunado. Tener cuidado.");
    }
}