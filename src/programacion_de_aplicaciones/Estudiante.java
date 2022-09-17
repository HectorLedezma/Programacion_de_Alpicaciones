package programacion_de_aplicaciones;

public class Estudiante extends Persona{
    int semestre;
    String ramo;

    public Estudiante(int semestre, String nombre, String apellido, int edad, String ramo) {
        super(nombre, apellido, edad);
        this.semestre = semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    
    
}
