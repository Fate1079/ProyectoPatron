/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ANDRES FELIPE
 */
public class AdministradorDTO extends PersonaDTO{
    
    public AdministradorDTO(String nombre, String Contraseña, String edad) {
        super(nombre, Contraseña, edad);
    }

    public String getNombre() {
        return nombre="123";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return Contraseña="123";
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    
}
