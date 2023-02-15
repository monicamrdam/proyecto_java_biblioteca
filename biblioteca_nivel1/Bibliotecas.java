import java.util.Scanner;

/**
 * Write a description of class Bibliotecas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bibliotecas
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String eleccion = "";
        do{
            System.out.println(
                    "1. Registrar socio\n2. Registrar libro\n3. Registrar prestamo\n4. Ver socios\n5. Ver libros\n6. Ver prestamos\n7. Ver socios no fiables\n8. Cambiar localizacion de libro\n9. Salir\nElige:");
            eleccion = sc.nextLine();
            switch(eleccion){
                case "1":
                    break;
                case "9":
                    break;
                
            }
        }while(!eleccion.equals("9"));
    }
}
