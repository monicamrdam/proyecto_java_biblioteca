import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.time.*;
import java.time.format.*;

/**
 * Write a description of class ControlPrestamos here.
 * Clase controlar los prestamos de libros a los usuarios
 * @author (monicamrmda) 
 * @version (16/02/2023)
 */
public class ControlPrestamos
{
    //Declaramos las variables que usaremos en el archivo.tx
    private static final String NOMBRE_ARCHIVO ="prestamos.txt";
    private static final String SEPARADOR_CAMPO=";";
    private static final String SEPARADOR_REGISTRO= "\n";
    
    /*Utilizaremos tres métodos para registrar, listar
    ControladorPrestamos.imprimirPrestamos(ControladorPrestamos.obtener());
    ControladorPrestamos.solicitarDatosYCrearPrestamo(); */
    public static void registrar(Prestamo prestamo){
       ControlLibros.marcarComoPrestado(prestamo.getCodigoLibro());
       try {
            BufferedWriter bufW = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO, true));
            bufW.write(prestamo.getCodigoLibro() + SEPARADOR_CAMPO + prestamo.getNumeroUsuario() + SEPARADOR_CAMPO + prestamo.getFechaFormateada() + SEPARADOR_REGISTRO);
            bufW.close();
        }catch (IOException e) {
            System.out.println("Error al registrar el prestamo: " + e.getMessage());
        }
    }
   public static ArrayList <Prestamo> obtener(){
       ArrayList <Prestamo> prestamos = new ArrayList<>();
       FileReader fileReader=null;
       BufferedReader bufR=null;
        try {
            fileReader= new FileReader(NOMBRE_ARCHIVO);
            bufR= new BufferedReader(fileReader);
            String linea;
            while((linea = bufR.readLine())!=null){
                String [] arrayPrestamo= linea.split(SEPARADOR_CAMPO);
                prestamos.add (new Prestamo(arrayPrestamo[0], arrayPrestamo[1], LocalDateTime.parse(arrayPrestamo[2], new DateTimeFormatterBuilder().parseCaseInsensitive().append(DateTimeFormatter.ofPattern ("yyy--MM--dd HH:mm:ss")).toFormatter())));
            }
        } catch (IOException e) {
            System.out.println("Excepción leyendo archivo: " + e.getMessage());
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
                if (bufR != null) {
                    bufR.close();
                }
            } catch (IOException e) {
                System.out.println("Excepción cerrando: " + e.getMessage());
            }
        }
       return prestamos;
   }
    public static void solicitarDatosYCrearPrestamo() {
        Libro libro = ControlLibros.imprimirLibrosYPedirSeleccion();
        Usuarios usuario = ControlUsuarios.imprimirUsuariosYPedirSeleccion();
        ControlPrestamos.registrar(new Prestamo(libro.getCodigo(), usuario.getNumero(), LocalDateTime.now()));
        System.out.println("Prestamo registrado correctamente");
    }
    public static void imprimirPrestamos(ArrayList<Prestamo> prestamos) {
        System.out
                .println("+-----+------------------------------+------------------------------+--------------------+");
        System.out.printf("|%-5s|%-30s|%-30s|%-20s|\n", "No", "Codigo libro", "No. Socio", "Fecha");
        System.out
                .println("+-----+------------------------------+------------------------------+--------------------+");

        for (int x = 0; x < prestamos.size(); x++) {
            Prestamo prestamo = prestamos.get(x);
            System.out.printf("|%-5d|%-30s|%-30s|%-20s|\n", x, prestamo.getCodigoLibro(), prestamo.getNumeroUsuario(),
                    prestamo.getFechaFormateada());
            System.out.println(
                    "+-----+------------------------------+------------------------------+--------------------+");
        }
    }
     public static int cantidadLibrosPrestados(String numeroUsuario, ArrayList<Prestamo> prestamos) {
        int cantidad = 0;
        for (int x = 0; x < prestamos.size(); x++) {
            Prestamo prestamo = prestamos.get(x);
            if (prestamo.getNumeroUsuario().equals(numeroUsuario)) {
                cantidad++;
            }
        }
        return cantidad;
    }
    
}
