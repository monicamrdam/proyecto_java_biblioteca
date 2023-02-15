
/**
 * Write a description of class Material here.
 * Materiales de la biblioteca
 * @author (monicamrdam) 
 * @version (15/02/2023)
 */
public class Material
{
    // instance variables - replace the example below with your own
    private String id, titulo, autor, localizacion, signatura;
    private boolean disponible;

    /**
     * Constructor for objects of class Material
     */
    public Material(String id, String titulo, String autor, String localizacion,String signatura, boolean disponible )
    {
        this.id= id;
        this.titulo=titulo;
        this.autor=autor;
        this.localizacion=localizacion;
        this.signatura=signatura;
        this.disponible=disponible;
        
    }
    // Get y Set
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id=id;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getAutor(){
        return autor;
    }
    
    public void setAutor(String autor){
        this.autor=autor;
    }
    public String getLocalizador(){
        return localizacion;
    }
    
    public void setLocalizador(String localizacion){
        this.localizacion=localizacion;
    }
    public String getSignatura(){
        return signatura;
    }
    
    public void setSignatura(String signatura){
        this.signatura=signatura;
    }
    public boolean isDisponible(){
        return disponible;
    }
    
    public void setDisponible(boolean disponible){
        this.disponible=disponible;
    }
    
    @Override
    public String toString(){
        return "Libro{" + "id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", localizacion="
                + localizacion + ", signatura=" + signatura + ", disponible=" + disponible + '}';
    }
}
