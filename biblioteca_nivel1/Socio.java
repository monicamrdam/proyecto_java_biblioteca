
/**
 * Write a description of class Socio here.
 * Funcionalidades del socio de la biblioteca
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Socio
{
    // instance variables - replace the example below with your own
    private String numero, nombre, direccion;
    
    /**
     * Constructor for objects of class Socio
     */
    public Socio(String numero, String nombre, String direccion)
    {
        this.numero = numero;
        this.nombre = nombre;
        this.direccion = direccion;
    }

     public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Socio{" + "numero=" + numero + ", nombre=" + nombre + ", direccion=" + direccion + '}';
    }
}
