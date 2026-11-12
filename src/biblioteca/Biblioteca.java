package biblioteca;

import java.util.List;

import java.util.ArrayList;

public class Biblioteca {
	//atributos
	private List<Libro> libros;
	private List<Socio> socios;
	
	//constructor
	public Biblioteca() {
		this.libros = new ArrayList<Libro>();
		this.socios = new ArrayList<Socio>();
	}
	
	public boolean registrarLibro(Libro libro) {
		for (Libro existente : libros) {
			if (existente.getCodigo().equals(libro.getCodigo())) {
				return false;
				
			}
		}
		libros.add(libro);
		return true;
	}
	public boolean eliminarLibro(String codigo) {
		for (Libro libro : libros) {
			if (libro.getCodigo().equals(codigo)) {
				if (libro.isDisponible()) {
					libros.remove(libro);
					return true;
				} else {
					return false;
					
				}
			}
		}
		return false;
	}
	public Libro buscarLibroPorCodigo(String codigo) {
		for (Libro libro : libros) {
		    if (libro.getCodigo().equals(codigo)) {
		        return libro;
		    }
		}
		return null;
	}
	public List<Libro> buscarLibrosPorTitulo(String titulo) {
		List<Libro> resultados = new ArrayList<Libro>();
		for (Libro libro : libros) {
		    if (libro.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
		        resultados.add(libro);
		    }
		}
		return resultados;
	}
	public void listarLibros() {
		for (Libro libro : libros) {
		    System.out.println(libro);
		}
	}
	public boolean registrarSocio(Socio socio) {
		for (Socio existente : socios) {
		    if (existente.getNumeroSocio() == socio.getNumeroSocio()) {
		        return false;
		    }
		}
		socios.add(socio);
		return true;
	}
	public Socio buscarSocio(int numeroSocio) {
		for (Socio socio : socios) {
		    if (socio.getNumeroSocio() == numeroSocio) {
		        return socio;
		    }
		}
		return null;
	}
	public void listarSocios() {
		for (Socio socio : socios) {
		    System.out.println(socio);
		}
	}
	public boolean prestarLibro(String codigo, int numeroSocio) {
		Libro libro = buscarLibroPorCodigo(codigo);
		Socio socio = buscarSocio(numeroSocio);
		if (libro == null || socio == null) {
		    return false;
		}
		if (!libro.isDisponible()) {
		    return false;
		}
		libro.setDisponible(false);
		socio.agregarLibroPrestado(libro);
		return true;
	}
	public boolean devolverLibro(String codigo, int numeroSocio) {
		Libro libro = buscarLibroPorCodigo(codigo);
		Socio socio = buscarSocio(numeroSocio);
		if (libro == null || socio == null) {
		    return false;
		}
		if (!socio.getLibrosPrestados().contains(libro)) {
		    return false;
		}
		socio.quitarLibroPrestado(libro);
		libro.setDisponible(true);
		return true;
	}
	public void consultarPrestamos(int numeroSocio) {
		Socio socio = buscarSocio(numeroSocio);
		if (socio == null) {
		    System.out.println("Socio no encontrado.");
		    return;
		}
		List<Libro> prestamos = socio.getLibrosPrestados();
		if (prestamos.isEmpty()) {
		    System.out.println("El socio no tiene libros prestados.");
		    return;
		}
		for (Libro libro : prestamos) {
		    System.out.println(libro);
		}
	}
}
