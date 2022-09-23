package programacion_de_aplicaciones;
import java.util.InputMismatchException;
import java.util.Scanner;
//
public class Ingresar {
    Scanner s;
    Estudiante st;
    Profesor pr;
    public Ingresar() {
    }
    public void IngresaDatos(){
        try{
            s = new Scanner(System.in);
            System.out.print("Ingrese el nombre: ");
            String nombre = s.nextLine();
            System.out.print("Ingrese el apellido: ");
            String apellido = s.nextLine();
            System.out.print("Ingrese la edad (solo numeros): ");
            int edad = s.nextInt();
            System.out.println("Si la persona a ingresar es Estudiante, ingrese \"E\"");
            System.out.print("Si es profesor, ingrese \"P\":\n");
            String es = s.next();
            if(es.equals("E")){
                System.out.println("En que ramo va el estudiante");
                String ramo = s.next();
                System.out.println("En que semestre va el estudiante (solo numeros)");
                int semestre = s.nextInt();
                st = new Estudiante(semestre,nombre,apellido,edad,ramo);
                st.guardar();
            }else if(es.equals("P")){
                System.out.println("¿que titulo tiene el profesor?");
                String titulo = s.next();
                pr = new Profesor(titulo,nombre, apellido,edad);
                pr.guardar();
            }
            
        }catch(InputMismatchException e){
            System.out.println("Hubo un error al ingresar los datos\nPor favor, intente nuevamente");
            s = null;
            IngresaDatos();
        }   
        
    }
}
