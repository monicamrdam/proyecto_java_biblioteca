
/**
 * Write a description of class Usuarios here.
 * Clase usuarios
 * @author (monicamrdam) 
 * @version (16/02/2023)
 */
public class Usuarios
{
    private String numero;
    private String nombre;
    private String direccion;
    public Usuarios(String numero, String nombre, String direccion){
        this.numero=numero;
        this.nombre=nombre;
        this.direccion=direccion;
    }
     public String getNumero() {
        return numero;
    }
     public String getNombre() {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
     public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Usuario{" + "numero=" + numero + ", nombre=" + nombre + ", direccion=" + direccion + '}';
    }
}
