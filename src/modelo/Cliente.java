package modelo;

import java.util.List;

public class Cliente {

	// Atributos

	private String rut;
	private String nombre;
	private String apellido;
	private String aniosCliente;
	private List<Categoria> nombreCategoria;

	// Constructores

	public Cliente(String rut, String nombre, String apellido, String aniosCliente, List<Categoria> estado) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.aniosCliente = aniosCliente;
		this.nombreCategoria = estado;
	}

	// Getters & Setters

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getAniosCliente() {
		return aniosCliente;
	}

	public void setAniosCliente(String aniosCliente) {
		this.aniosCliente = aniosCliente;
	}

	public List<Categoria> getEstado() {
		return nombreCategoria;
	}

	public void setEstado(List<Categoria> nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	//toString
	
	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", aniosCliente="
				+ aniosCliente + ", nombreCategoria=" + nombreCategoria + "]";
	}

}
