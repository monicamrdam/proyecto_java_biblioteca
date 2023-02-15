import java.util.ArrayList;

/**
 * Write a description of class ControladorSocios here.
 * Controla la gestión de los Socios
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControladorSocios
{
    private static final String NOMBRE_ARCHIVO = "socios.txt";
    private static final String SEPARADOR_CAMPO = ";";
    private static final String SEPARADOR_REGISTRO ="\n";
    
    public static void solicitarDatosParaRegistrar(){
        
    
    }
    public static void registrar(Socio socio){
        
    }
    public static ArrayList<Socio> obtener(){
        ArrayList<Socio> socios= new ArrayList<>();
        return socios;
    }
    public static void imprimirSocios(ArrayList<Socio> socios){
    }
    public static void impirmirSociosNoFiables(ArrayList<Socio> socios){
        
    }
    public static int buscarSocioPorNumero(String numero, ArrayList<Socio> socios){
        int i=0;
        return i;
    }
    public static Socio impirmirSociosyPedirSeleccion(){
        ArrayList<Socio> socios= new ArrayList<>();
        return socios.get(0);
    }
}
