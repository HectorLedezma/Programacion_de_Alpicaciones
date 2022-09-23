package programacion_de_aplicaciones;
//
public class Estudiante extends Persona{
    int semestre;
    String ramo;
//
    public Estudiante(String RUT,int semestre, String nombre, String apellido, int edad, String ramo, int t) {
        super(RUT,nombre, apellido, edad, t);
        this.semestre = semestre;
    }
//
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
//   
}
