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
    private String numeroUsuario;
    private LocalDateTime fechaFormateada;
    
    public Prestamo(String codigoLibro, String numeroUsuario, LocalDateTime fechaFormateada ) {
        this.codigoLibro = codigoLibro;
        this.numeroUsuario = numeroUsuario;
        this.fechaFormateada = fechaFormateada;
  
    }
    
    public String getCodigoLibro() {
        return codigoLibro;
    }
    
     public String getNumeroUsuario() {
        return numeroUsuario;
    }
    
    public LocalDateTime getFecha() {
        return fechaFormateada;
    }
    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }
     public void setNumeroUsuario(String numeroUsuario) {
        this.numeroUsuario = numeroUsuario;
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
        return "Prestamo{" + "codigoLibro=" + codigoLibro + ", numeroUsuario=" + numeroUsuario + ", fecha="
                + this.getFechaFormateada() + '}';
    }
}
