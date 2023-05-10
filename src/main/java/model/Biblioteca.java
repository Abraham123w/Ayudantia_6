package model;

public class Biblioteca {
	private String nombre;
	private String direccion;
	private String horario;

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
}