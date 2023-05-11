package model;

import java.util.ArrayList;

public class Biblioteca {
	private String nombre;
	private String direccion;
	private String horario;
	private ArrayList<Libro> libros;

	public Biblioteca(String nombre, String direccion, String horario) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.horario = horario;
	}
	/*Un método para buscar un libro en la base de datos por su autor.
	Un método para prestar un libro de la base de datos y actualizar la información en la base de datos.
	Un método para devolver un libro a la base de datos y actualizar la información en la base de datos.*/

	public
	public ArrayList<Libro> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String aNombre) {
		this.nombre = aNombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String aDireccion) {
		this.direccion = aDireccion;
	}

	public String getHorario() {
		return this.horario;
	}

	public void setHorario(String aHorario) {
		this.horario = aHorario;
	}

	@Override
	public String toString() {
		return "Biblioteca{" +
				"nombre='" + nombre + '\'' +
				", direccion='" + direccion + '\'' +
				", horario='" + horario + '\'' +
				'}';
	}
}