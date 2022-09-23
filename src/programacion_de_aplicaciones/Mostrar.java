
package programacion_de_aplicaciones;

import java.util.InputMismatchException;
import java.util.Iterator;

public class Mostrar extends Ingresar{


	public Mostrar() {
	}

    public void MostrarDatos(){
        try{  System.out.println("-------------------------");
        Iterator <Profesor> i = pr.iterator();
        while (i.hasNext()){
            Profesor e = i.next();
            System.out.println(e);}
      
    
        
    System.out.println("--------------------");
        }catch(InputMismatchException e){
            System.out.println("no Existen datos a mostrar");
            s = null;
}
}
}
