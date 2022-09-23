package programacion_de_aplicaciones;
import java.util.ArrayList;
import java.util.InputMismatchException;
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
        Scanner s;
        int op;
        List<Persona> personas = new ArrayList<Persona>();
        //Persona [] = new Persona[1000];
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
                        case 1: personas.add((new Ingresar()).IngresaDatos());break;
                        case 2:break;
                        case 3: System.out.println(personas.get(0).nombre);
                            //(new Mostrar()).MostrarDatos();
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
