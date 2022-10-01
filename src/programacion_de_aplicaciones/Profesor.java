package programacion_de_aplicaciones;



//
public class Profesor extends Persona {
    String titulo;

    public Profesor(String RUT,String titulo, String nombre, String apellido, int edad,int t) {
        super(RUT,nombre, apellido, edad,t);
        this.titulo = titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

   
}
