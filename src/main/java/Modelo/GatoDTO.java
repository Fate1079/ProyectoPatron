/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ANDRES FELIPE
 */
public class GatoDTO extends MascotaDTO {
    private String vacunado;
    private String detalleAlergia;

    private GatoDTO(Builder builder) {
        super(builder.nombre, builder.edad, builder.codigo);
        this.vacunado = builder.vacunado;
        this.detalleAlergia = builder.detalleAlergia;
    }

    public String getVacunado() {
        return vacunado;
    }

    public String getDetalleAlergia() {
        return detalleAlergia;
    }

    @Override
    public void mostrarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public static class Builder {
        private String vacunado;
        private String detalleAlergia;
        private String nombre;
        private int edad;
        private int codigo;

        public Builder setVacunado(String vacunado) {
            this.vacunado = vacunado;
            return this;
        }

        public Builder setDetalleAlergia(String detalleAlergia) {
            this.detalleAlergia = detalleAlergia;
            return this;
        }

        public Builder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder setEdad(int edad) {
            this.edad = edad;
            return this;
        }

        public Builder setCodigo(int codigo) {
            this.codigo = codigo;
            return this;
        }

        public GatoDTO build() {
            return new GatoDTO(this);
        }
    }
}