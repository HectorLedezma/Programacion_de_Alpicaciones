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

        i = c.iterator();
        while(i.hasNext());
            Persona e = i.next();
            if(e.getNombre()==nombre){
                System.out.println(e);
                found=true
            }
        }
        if (!found){
            System.out.println("No se encontró registro");
    
        }
         System.out.println("-------------------------");
}
}

