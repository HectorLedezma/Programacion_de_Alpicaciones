package programacion_de_aplicaciones;
//
public class Persona {
    String RUT;
    String nombre;
    String apellido;
    int edad;
    int t;

    public Persona(String RUT,String nombre, String apellido, int edad,int t) {
        this.RUT = RUT;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public void guardar(){
    }

    public String getNombre() {
        return nombre;
    }

    public static Object iterator() {
        return null;
    }
}
