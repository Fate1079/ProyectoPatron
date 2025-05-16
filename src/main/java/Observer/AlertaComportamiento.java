/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

import Modelo.PerroDTO;

/**
 *
 * @author ANDRES FELIPE
 */
public class AlertaComportamiento implements ObservadorPerro {

    @Override
    public void notificar(PerroDTO perro) {
        if (perro.getRaza().equalsIgnoreCase("Bulldog") || perro.getRaza().equalsIgnoreCase("Pastor Alemán")) {
            System.out.println("⚠ Alerta: El perro " + perro.getNombre() + " es de raza peligrosa.");
        } else {
            System.out.println("✓ Información: El perro " + perro.getNombre() + " tiene un comportamiento tranquilo.");
        }
    }
}