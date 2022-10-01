package programacion_de_aplicaciones;

import java.util.Scanner;

public class Buscar {
    boolean found;
    Scanner s;
    public Buscar() {
	}
    public void BuscarDatos(){
        boolean found = false;
        System.out.print("Ingrese nombre a buscar");
        String nombre = s.nextLine();

        Object i = Persona.iterator();
        while(((Scanner) i).hasNext());
            String e = ((Scanner) i).next();
            if(e==nombre){
                System.out.println(e);
               found = true; 
            }
        if (!found){
            System.out.println("No se encontro registro");
        }
    }
}