import java.time.LocalDateTime;
import java.time.format.*;

/**
 * Write a description of class Prestamos here.
 * Clase prestamos
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prestamo
{
    private String codigoLibro;
    private String numeroSocio;
    private LocalDateTime fechaFormateada;
    
    public Prestamo(String codigoLibro, String numeroSocio, LocalDateTime fechaFormateada ) {
        this.codigoLibro = codigoLibro;
        this.numeroSocio = numeroSocio;
        this.fechaFormateada = fechaFormateada;
  
    }
    
    public String getCodigoLibro() {
        return codigoLibro;
    }
    
     public String getNumeroSocio() {
        return numeroSocio;
    }
    
    public LocalDateTime getFecha() {
        return fechaFormateada;
    }
    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }
     public void setNumeroSocio(String numeroSocio) {
        this.numeroSocio = numeroSocio;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fechaFormateada = fechaFormateada;
    }
    public String getFechaFormateada() {
        String formato = "yyyy-MM-dd HH:mm:ss";
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern(formato);
        return formateador.format(this.fechaFormateada);
    }
    @Override
    public String toString() {
        return "Prestamo{" + "codigoLibro=" + codigoLibro + ", numeroSocio=" + numeroSocio + ", fecha="
                + this.getFechaFormateada() + '}';
    }
}
