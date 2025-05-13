/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author MI PC
 */
public abstract class MascotaDecorator implements IMascota {
    protected IMascota mascota;

    public MascotaDecorator(IMascota mascota) {
        this.mascota = mascota;
    }

    @Override
    public String getNombre() {
        return mascota.getNombre();
    }

    @Override
    public int getEdad() {
        return mascota.getEdad();
    }

    @Override
    public int getCodigo() {
        return mascota.getCodigo();
    }

    @Override
    public void mostrarDatos() {
        mascota.mostrarDatos();
    }
}
