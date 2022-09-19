package programacion_de_aplicaciones;
import java.util.InputMismatchException;
import java.util.Scanner;
//
public class Programacion_de_Aplicaciones {
    public static void main(String[] args) {
        boolean err = true;
        Scanner s;
        int op;
        while(err){
            s = new Scanner(System.in);
            System.out.println("Selecciona una opcion.\n"+
                               "1) Ingresar\n"+
                               "2) Buscar\n"+
                               "3) Modificar\n"+
                               "0) Salir");
            try{
                op = s.nextInt();
                if(op < 0 || op > 3){
                    System.out.println("Por favor ingresa una opcion valida");
                }else{
                    switch(op){
                        case 0: System.exit(op);
                        case 1:(new Ingresar()).IngresaDatos();break;
                        case 2:break;
                        case 3:break;
                    }
                    err = false;
                }
            }catch(InputMismatchException e){
                System.out.println("Por favor ingresa una opcion valida");
                s = null;
            }
        }
    }
}
