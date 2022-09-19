package programacion_de_aplicaciones;
//
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
