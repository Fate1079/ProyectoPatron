/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

import Modelo.PerroDTO;
import java.util.ArrayList;
import java.util.List;

public class GestorPerroObservable {

    private final List<ObservadorPerro> observadores = new ArrayList<>();

    public void agregarObservador(ObservadorPerro observador) {
        observadores.add(observador);
    }

    public void notificarObservadores(PerroDTO perro) {
        for (ObservadorPerro obs : observadores) {
            obs.notificar(perro);
        }
    }
}

