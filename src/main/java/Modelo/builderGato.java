/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ANDRES FELIPE
 */
public class builderGato {
    private String vacunado;
        private String detalleAlergia;
        private String nombre;
        private int edad;
        private int codigo;
        private Gato gato;
        
        public builderGato(){
            this.gato = new Gato(vacunado, detalleAlergia, nombre, edad, codigo);
        }
        
        public void setVacunado(String vacunado){
            this.vacunado=vacunado;
            this.gato.vacunado=vacunado;
        }
        
        public void setDetalle(String detalle){
            this.detalleAlergia= detalle;
            this.gato.DetalleAlergia=detalle;
        }
       
        
          public void setcodigo(int codigo){
            this.codigo= codigo;
            this.gato.codigo=codigo;
        }
          
            public void setedad(int edad){
            this.edad= edad;
            this.gato.edad=edad;
            }
            
            public void setNombre(String nombre){
            this.nombre= nombre;
            this.gato.nombre=nombre;
        }
            
            //si//
        
}
