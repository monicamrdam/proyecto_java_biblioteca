
/**
 * Write a description of class Articulo here.
 * Clase articulo
 * @author (monicamrdam) 
 * @version (16/02/2023)
 */
public class Articulo
{
        private long id_articulo;
        private String titulo;
        private String autor;
        private int numpaginas;
    
        public Articulo(long id_articulo, String titulo, String autor, int numpaginas)
        {
        this.id_articulo=id_articulo;
        this.titulo=titulo;
        this.autor=autor;
        this.numpaginas=numpaginas;
        }
        public long getIdArticulo() {
	return id_articulo;
	}

	public void setIdeArticulo(long id_articulo) {
		this.id_articulo = id_articulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumpaginas() {
		return numpaginas;
	}

	public void setNumpaginas(int numpaginas) {
		this.numpaginas = numpaginas;
	}

	@Override
	public String toString() {
		return "Código de artículo: " + id_articulo + "\n Titulo: " + titulo + "\nAutor: " + autor + "\nNumpaginas: "
				+ numpaginas;
	}

}
