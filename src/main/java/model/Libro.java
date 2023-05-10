package model;

public class Libro {
	private String titulo;
	private String autor;
	private Date fecha;
	private String genero;

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String aTitulo) {
		this.titulo = aTitulo;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String aAutor) {
		this.autor = aAutor;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date aFecha) {
		this.fecha = aFecha;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String aGenero) {
		this.genero = aGenero;
	}
}