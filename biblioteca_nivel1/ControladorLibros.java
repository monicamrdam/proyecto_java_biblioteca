import java.util.ArrayList;

/**
 * Write a description of class ControladorLibros here.
 * Controla los libros
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControladorLibros
{
    private static final String NOMBRE_ARCHIVO= "libros.txt";
    private static final String SEPARADOR_CAMPO =";";
    private static final String SEPARADOR_REGISTRO ="\n";
    
    public static void solicitarDatosParaRegistrar(){
        
    }
    public static void registrar(Material libro){
        
    }
    public static void guardarLibros(ArrayList<Material> libros){
        
    }
    public static ArrayList<Material> obtener(){
        ArrayList<Material> libros= new ArrayList<>();
        return libros;
    }
    public static int buscarPorCodigo(String codigo, ArrayList<Material> libros){
        return -1;
    }
    public static void marcarComoPrestados(String codigoLibro){

    }
    public static void cambiarSignatura(String codigoLibro, String nuevaSignatura, String nuevoLocalización ){
    
    }
    public static void solicitarDatosParaCambiarSignatura(){
        
    }
    public static void imprimirLibros(){
        
    }
    public static Material imprimirLibrosYPedirSeleccion(){
        ArrayList<Material> libros = new ArrayList<>();
        return libros.get(2);
    }
}
