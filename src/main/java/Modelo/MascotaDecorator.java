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
    protected String raza;

    public MascotaDecorator(IMascota mascota, String raza) {
        this.mascota = mascota;
        this.raza = raza;
    }

    @Override
    public String getNombre() {
        return mascota.getNombre() + " (" + raza + ")";
    }

    @Override
    public int getEdad() {
        return mascota.getEdad(); 
    }
    
      public int getEdadEnMeses() {
        return mascota.getEdad() * 12;
    }

    @Override
    public int getCodigo() {
        return mascota.getCodigo();
    }

    @Override
    public void mostrarDatos() {
        mostrarDatosBase();
        mostrarDatosExtra();
    }

    protected void mostrarDatosBase() {
        mascota.mostrarDatos();
    }

    protected void mostrarDatosExtra() {
        System.out.println("Raza: " + raza);
    }
}

