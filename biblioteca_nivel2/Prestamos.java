
/**
 * Write a description of class Prestamos here.
 * Clase prestamos
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prestamos
{
    private int id;
    private String usuario;
    private String material;
    private String titulo;
    private String fecha_prestamo;
    private String fecha_dev;
    private int estado;
    
    public Prestamos(int id, String usuario, String material, String fecha_prestamo, String fecha_dev, int estado) {
        this.id = id;
        this.usuario = usuario;
        this.material = material;
        this.titulo = titulo;
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_dev = fecha_dev;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getMaterial() {
        return material;
    }

    public void setLibro(String material) {
        this.material = material;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha_prestamo() {
        return fecha_prestamo;
    }

    public void setFecha_prestamo(String fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public String getFecha_dev() {
        return fecha_dev;
    }

    public void setFecha_dev(String fecha_dev) {
        this.fecha_dev = fecha_dev;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
