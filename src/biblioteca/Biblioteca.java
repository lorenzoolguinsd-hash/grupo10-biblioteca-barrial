package biblioteca;

import java.util.List;

import java.util.ArrayList;

public class Biblioteca {
	//atributos
	private List<Libro> libros;
	private List<Socio> socios;
	private int[] contadoresCodigos = new int[27];
	
	//constructor
	public Biblioteca() {
		this.libros = new ArrayList<Libro>();
		this.socios = new ArrayList<Socio>();
	}
	public String generarCodigoLibro(String titulo) {
	    String prefijo;
	    int posicion;

	    char inicial = Character.toUpperCase(titulo.charAt(0));
	    
	    if (inicial == 'Á' || inicial == 'À' || inicial == 'Ä') {
	        inicial = 'A';
	    } else if (inicial == 'É' || inicial == 'È' || inicial == 'Ë') {
	        inicial = 'E';
	    } else if (inicial == 'Í' || inicial == 'Ì' || inicial == 'Ï') {
	        inicial = 'I';
	    } else if (inicial == 'Ó' || inicial == 'Ò' || inicial == 'Ö') {
	        inicial = 'O';
	    } else if (inicial == 'Ú' || inicial == 'Ù' || inicial == 'Ü') {
	        inicial = 'U';
	    } else if (inicial == 'Ñ') {
	        inicial = 'N';
	    }

	    if (inicial >= 'A' && inicial <= 'Z') {
	        prefijo = String.valueOf(inicial);
	        posicion = inicial - 'A';
	    } else {
	        prefijo = "NN";
	        posicion = 26;
	    }
	    
	    if (contadoresCodigos[posicion] >= 9999) {
	        return null;
	    }
	    contadoresCodigos[posicion]++;

	    return prefijo + String.format("%04d", contadoresCodigos[posicion]);
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
	public void mostrarLibrosAgrupados(List<Libro> resultados) {
	    List<Libro> librosMostrados = new ArrayList<Libro>();

	    for (Libro libro : resultados) {
	        boolean yaMostrado = false;

	        for (Libro mostrado : librosMostrados) {
	            if (mostrado.getTitulo().equalsIgnoreCase(libro.getTitulo())
	                    && mostrado.getAutor().equalsIgnoreCase(libro.getAutor())) {
	                yaMostrado = true;
	                break;
	            }
	        }

	        if (!yaMostrado) {
	            int total = 0;
	            int disponibles = 0;

	            for (Libro existente : libros) {
	                if (existente.getTitulo().equalsIgnoreCase(libro.getTitulo())
	                        && existente.getAutor().equalsIgnoreCase(libro.getAutor())) {
	                    total++;

	                    if (existente.isDisponible()) {
	                        disponibles++;
	                    }
	                }
	            }

	            int prestados = total - disponibles;

	            System.out.println(libro.getTitulo() + " - " + libro.getAutor()
	                    + " [" + total + "] Disponibles [" + disponibles
	                    + "] Prestados [" + prestados + "]");

	            librosMostrados.add(libro);
	        }
	    }
	}
	
	public void listarLibros() {
	    mostrarLibrosAgrupados(libros);
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
