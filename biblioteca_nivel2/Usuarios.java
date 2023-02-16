
/**
 * Write a description of class Usuarios here.
 * Clase usuarios
 * @author (monicamrdam) 
 * @version (16/02/2023)
 */
public class Usuarios
{
    private int id;
    private String usuario;
    private String contraseña;
    private String nombre;
    private String email;
    public Usuarios(int id, String usuario, String contraseña, String nombre, String email){
        this.id=id;
        this.usuario=usuario;
        this.contraseña=contraseña;
        this.nombre=nombre;
        this.email=email;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
     public String getUsuario(){
        return usuario;
    }
    public void setUsuario(String usuario){
        this.usuario=usuario;
    }
     public String getContraseña(){
        return contraseña;
    }
    public void setContraseña(String contraseña){
        this.contraseña=contraseña;
    }
     public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
     public String getEmail(){
        return email;
    }
    public void setString(String email){
        this.email=email;
    }
}
