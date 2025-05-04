/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ANDRES FELIPE
 */
public class Veterinario extends Persona {

    private String experencia;
    private int codigo;

    public Veterinario(String experencia, int codigo, String nombre, String Contraseña, String edad) {
        super(nombre, Contraseña, edad);
        this.experencia = experencia;
        this.codigo = codigo;
    }

    public static class Builder {
        private String nombre;
        private String Contraseña;
        private String edad;
        private String experencia;
        private int codigo;

        public Builder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder setContraseña(String Contraseña) {
            this.Contraseña = Contraseña;
            return this;
        }

        public Builder setEdad(String edad) {
            this.edad = edad;
            return this;
        }

        public Builder setExperencia(String experencia) {
            this.experencia = experencia;
            return this;
        }

        public Builder setCodigo(int codigo) {
            this.codigo = codigo;
            return this;
        }

        public Veterinario build() {
            return new Veterinario(experencia, codigo, nombre, Contraseña, edad);
        }
    }

    // Getters y Setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getExperencia() {
        return experencia;
    }

    public void setExperencia(String experencia) {
        this.experencia = experencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return Contraseña;
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

