/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ANDRES FELIPE
 */
public class Gato extends Mascota {
    String vacunado;
  String DetalleAlergia;

    public Gato(String vacunado, String DetalleAlergia, String nombre, int edad, int codigo) {
        super(nombre, edad, codigo);
        this.vacunado = vacunado;
        this.DetalleAlergia = DetalleAlergia;
    }

   

    public String getVacunado() {
        return vacunado;
    }

    public void setVacunado(String vacunado) {
        this.vacunado = vacunado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDetalleAlergia() {
        return DetalleAlergia;
    }

    public void setDetalleAlergia(String DetalleAlergia) {
        this.DetalleAlergia = DetalleAlergia;
    }
    
    
}
