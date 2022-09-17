/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion_de_aplicaciones;

public class Estudiante extends Persona{
    int semestre;

    public Estudiante(int semestre, String nombre, String apellido, int edad, String ramo) {
        super(nombre, apellido, edad, ramo);
        this.semestre = semestre;
    }

    
    
}
