package biblioteca;

import java.util.List;

import java.util.ArrayList;

public class Socio {
	//atributos
	private int numeroSocio;
	private String nombre;
	private List<Libro> librosPrestados;

	//constructor
	public Socio(int numeroSocio, String nombre) {
	this.numeroSocio = numeroSocio;
	this.nombre = nombre;
	this.librosPrestados = new ArrayList<Libro>();
	}

	//getters
	public int getNumeroSocio() {
		return numeroSocio;
	}
	public String getNombre() {
		return nombre;
	}
	public List<Libro> getLibrosPrestados(){
		return new ArrayList<Libro>(librosPrestados);
	}
	
	public void agregarLibroPrestado(Libro libro) {
		librosPrestados.add(libro);
	}
	public void quitarLibroPrestado(Libro libro) {
		librosPrestados.remove(libro);
	}
	
	@Override
	public String toString() {
		return "N.º de socio: " + numeroSocio +
				", Nombre: " + nombre +
				", Libros prestados: " + librosPrestados.size();
	}
}
