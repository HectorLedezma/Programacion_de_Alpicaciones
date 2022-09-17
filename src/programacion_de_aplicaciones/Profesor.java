/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion_de_aplicaciones;

public class Profesor extends Persona {
    String titulo;

    public Profesor(String titulo, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.titulo = titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
}
