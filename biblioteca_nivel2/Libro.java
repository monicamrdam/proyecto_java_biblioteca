
/**
 * Write a description of class Libro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Libro
{
    private String codigo;
    private String titulo;
    private String autor;
    private String localizacion;
    private String signatura;
    private boolean disponible;
    public Libro(String codigo,String titulo,String autor, String localizacion,String signatura,boolean disponible)
    {
        this.codigo=codigo;
        this.titulo=titulo;
        this.autor=autor;
        this.localizacion=localizacion;
        this.signatura=signatura;
        this.disponible=disponible;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
     public String getLocalizacion() {
        return localizacion;
    }
    public String getSignatura() {
        return signatura;
    }
    public boolean isDisponible() {
        return disponible;
    }
     public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
     public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
     public void setSignatura(String signatura) {
        this.signatura = signatura;
    }
     public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    @Override
    public String toString() {
        return "Libro{" + "codigo=" + codigo + ", titulo=" + titulo + ", autor=" + autor + ", localizacion="
                + localizacion + ", signatura=" + signatura + ", disponible=" + disponible + '}';
    }
}
