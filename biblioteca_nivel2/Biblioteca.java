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
            System.out.println("1. Registrar usuario\n2. Ver usuario\n3. Registrar libro\n4. Ver libro\n5. Registrar prestamo\n6. Ver prestamos\n0. Salir\nElige:");
            opcion=sc.nextLine();
            switch(opcion){
            case "1":
                System.out.println("Has seleccionado registrar usuario");
                ControlUsuarios.solicitarDatosParaRegistrar();
                break;
            case "2":
                System.out.println("Has seleccionado ver usuarios");
                ControlUsuarios.imprimirUsuarios(ControlUsuarios.obtener());
                break;
            case "3":
                System.out.println("Has seleccionado registrar libro");
                ControlLibros.solicitarDatosParaRegistrar();
                break;
            case "4":
                System.out.println("Has seleccionado ver libros");
                ControlLibros.imprimirLibros(ControlLibros.obtener());
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
