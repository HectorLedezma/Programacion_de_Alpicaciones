package programacion_de_aplicaciones;
import java.util.ArrayList;
import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


//
public class Programacion_de_Aplicaciones {
    
    public int checkP(Persona[] per){
        int c = 0;
        for(int i = 0;i<per.length;i++){
            if(per[i] != null){
                c = c+1;
            }
        }
        return c;
    }
    
    public static void main(String[] args) {
        boolean err = true;
        Scanner s = new Scanner(System.in);
        int op;
        Collection<Persona> personas = new ArrayList<Persona>();
        int it;
        while(err){
            s = new Scanner(System.in);
            System.out.println("Selecciona una opcion.\n"+
                               "1) Ingresar\n"+
                               "2) Buscar\n"+
                               "3) Mostrar\n"+
                               "4) Modificar\n"+
                               "0) Salir");
            try{
                op = s.nextInt();
                if(op < 0 || op > 4){
                    System.out.println("Por favor ingresa una opcion valida");
                }else{
                    //System.out.println(it);
                    switch(op){
                        case 0: System.exit(op);err = false;
                                break;
                        case 1: personas.add((new Ingresar()).IngresaDatos());
                                break;
                        case 2: boolean found = false;
                                System.out.println("Ingrese nombre a buscar");
                                String nombre = s.nextLine();
                                Iterator<Persona> i= personas.iterator();
                                while(i.hasNext()){
                                    Persona e = i.next();
                                    if(e.getNombre()== nombre){
                                    System.out.println(e);
                                    found =  true;
                                }
                            }
                            if (!found){
                                System.out.println("No se ha encontrado el nombre");
                            }
                            System.out.println("--------------------------");
                           
                            break;
                        case 3:  i= personas.iterator();
                                 while(i.hasNext()){
                                    Persona e = i.next(); 
                                    System.out.println(e);
                                    
                          
                        }
                            break;
                     
                    }
                    
                }
            }catch(InputMismatchException e){
                System.out.println("Por favor ingresa una opcion valida");
                s = null;
            }
        }
    }
}
