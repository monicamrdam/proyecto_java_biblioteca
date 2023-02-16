import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Write a description of class ControlUsuarios here.
 * Clase controlar los usuarios
 * @author (monicamrmda) 
 * @version (16/02/2023)
 */
public class ControlUsuarios
{
    private static final String NOMBRE_ARCHIVO = "usuarios.txt";
    private static final String SEPARADOR_CAMPO = ";";
    private static final String SEPARADOR_REGISTRO = "\n";

    public static void solicitarDatosParaRegistrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero de usuario: ");
        String numero = sc.nextLine();
        System.out.println("Ingrese nombre de usuario: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese direccion de usuario: ");
        String direccion = sc.nextLine();
        ControlUsuarios.registrar(new Usuarios(numero, nombre, direccion));
        System.out.println("Registrado exitosamente");
    }

    public static void registrar(Usuarios usuario) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO, true));
            bufferedWriter.write(usuario.getNumero() + SEPARADOR_CAMPO + usuario.getNombre() + SEPARADOR_CAMPO
                    + usuario.getDireccion() + SEPARADOR_REGISTRO);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Error escribiendo en archivo: " + e.getMessage());
        }
    }

    public static ArrayList<Usuarios> obtener() {
        ArrayList<Usuarios> usuarios = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(NOMBRE_ARCHIVO);
            bufferedReader = new BufferedReader(fileReader);
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                String[] arrayUsuario = linea.split(SEPARADOR_CAMPO);
                usuarios.add(new Usuarios(arrayUsuario[0], arrayUsuario[1], arrayUsuario[2]));
            }
        } catch (IOException e) {
            System.out.println("Excepción leyendo archivo: " + e.getMessage());
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                System.out.println("Excepción cerrando: " + e.getMessage());
            }
            return usuarios;
        }
    }

    public static void imprimirUsuarios(ArrayList<Usuarios> usuarios) {
        ArrayList<Prestamo> prestamos = ControlPrestamos.obtener();
        System.out.println(
                "+-----+----------+----------------------------------------+----------------------------------------+--------------------+");
        System.out.printf("|%-5s|%-10s|%-40s|%-40s|%-20s|\n", "#", "No. socio", "Nombre", "Direccion",
                "Libros prestados");
        System.out.println(
                "+-----+----------+----------------------------------------+----------------------------------------+--------------------+");
        for (int x = 0; x < usuarios.size(); x++) {
            Usuarios usuario = usuarios.get(x);
            System.out.printf("|%-5s|%-10s|%-40s|%-40s|%-20s|\n", x + 1, usuario.getNumero(), usuario.getNombre(),
                    usuario.getDireccion(), ControlPrestamos.cantidadLibrosPrestados(usuario.getNumero(), prestamos));
            System.out.println(
                    "+-----+----------+----------------------------------------+----------------------------------------+--------------------+");
        }
    }

    public static int buscarUsuarioPorNumero(String numero, ArrayList<Usuarios> usuarios) {
        for (int x = 0; x < usuarios.size(); x++) {
            Usuarios usuario = usuarios.get(x);
            if (usuario.getNumero().equals(numero)) {
                return x;
            }
        }
        return -1;
    }

    public static Usuarios imprimirUsuariosYPedirSeleccion() {
        ArrayList<Usuarios> usuarios = ControlUsuarios.obtener();
        Scanner sc = new Scanner(System.in);
        while (true) {
            ControlUsuarios.imprimirUsuarios(usuarios);
            System.out.println("Ingrese el numero de socio: ");
            String numero = sc.nextLine();
            int indice = ControlUsuarios.buscarUsuarioPorNumero(numero, usuarios);
            if (indice == -1) {
                System.out.println("No existe socio con ese numero");
            } else {
                return usuarios.get(indice);
            }
        }
    }
}