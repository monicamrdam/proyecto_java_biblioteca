import java.util.Scanner;

/**
 * Write a description of class Biblioteca here.
 * Clase Main
 * @author (monicamrdam) 
 * @version (16/02/2023)
 */
public class Biblioteca
{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String opcion="";
       
        do{
            System.out.println("1. Registrar socio\n2. Ver socio\n3. Registrar libro\n4. Ver libro\n5. Registrar prestamo\n6. Ver prestamos\n0. Salir\nElige:");
            opcion=sc.nextLine();
            switch(opcion){
            case "1":
                System.out.println("Has seleccionado registrar socio");
                break;
            case "2":
                System.out.println("Has seleccionado ver socio");
                break;
            case "3":
                System.out.println("Has seleccionado registrar libro");
                break;
            case "4":
                System.out.println("Has seleccionado ver libro");
                break;
            case "5":
                System.out.println("Has seleccionado registrar prestamo");
                ControlPrestamos.imprimirPrestamos(ControlPrestamos.obtener());
                break;
            case "6":
                System.out.println("Has seleccionado ver prestamos");
                ControlPrestamos.solicitarDatosYCrearPrestamo();
                break;
            case "0":
                break;
            default:
                System.out.println("Has seleccionado una opción incorrecta");
            }
        }while(!opcion.equals("0"));
        System.out.println("Programa finalizado");
        
    }
}
