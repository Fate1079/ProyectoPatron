/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

import Modelo.Perro;
import javax.swing.JOptionPane;

/**
 *
 * @author MI PC
 */
public class ComportamientoPeligroso implements IComportamientoRaza {
    @Override
    public void validar(Perro perro) {
        JOptionPane.showMessageDialog(null, "¡Cuidado! La raza " + perro.getRaza() + " es considerada peligrosa.");
    }
}