package biblioteca;

import java.util.Scanner;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		Scanner scanner = new Scanner(System.in);
		boolean salir = false;

		while (!salir) {
			System.out.println("\n===== BIBLIOTECA BARRIAL =====");
			System.out.println("1. Gestión de libros");
			System.out.println("2. Gestión de socios");
			System.out.println("3. Gestión de préstamos");
			System.out.println("0. Salir");
			int opcion = leerEntero(scanner, "Seleccione una opción: ");
			switch (opcion) {

		    	case 1:
		    		// Gestión de libros
		    	    menuLibros(biblioteca, scanner);
		    		break;

		    	case 2:
		    		// Gestión de socios
		    		menuSocios(biblioteca, scanner);
		    		break;

		    	case 3:
		    		// Gestión de préstamos
		    	    menuPrestamos(biblioteca, scanner);
		    		break;

		    	case 0:
		    		salir = true;
		    		System.out.println("Saliendo del sistema...");
		    		break;

		    	default:
		    		System.out.println("Opción inválida.");
		    		break;
			}
		}
	}
	private static void menuLibros(Biblioteca biblioteca, Scanner scanner) {
		int opcion = -1;

		do {
		System.out.println("\n===== GESTIÓN DE LIBROS =====");
		System.out.println("1. Registrar libro");
		System.out.println("2. Buscar libro");
		System.out.println("3. Listar libros");
		System.out.println("4. Eliminar libro");
		System.out.println("0. Volver al menú principal");
		opcion = leerEntero(scanner, "Seleccione una opción: ");
		
		switch (opcion) {


		case 0:
		    System.out.println("Volviendo al menú principal...");
		    break;
		case 1:
		    // Registrar libro
		    String titulo = leerTextoNoVacio(scanner, "Ingrese el título del libro: ");
		    String autor = leerTextoNoVacio(scanner, "Ingrese el autor del libro: ");
		
		    int cantidad = leerEntero(scanner, "Ingrese la cantidad de ejemplares: ");
		
		    while (cantidad <= 0) {
		        System.out.println("La cantidad debe ser mayor que cero.");
		        cantidad = leerEntero(scanner, "Ingrese la cantidad de ejemplares: ");
		    }
		
		    int registrados = 0;
		
		    for (int i = 1; i <= cantidad; i++) {
		        String codigo = biblioteca.generarCodigoLibro(titulo);
		
		        if (codigo == null) {
		            System.out.println("Se alcanzó el límite de códigos disponibles.");
		            break;
		        }
		
		        Libro libro = new Libro(codigo, titulo, autor);
		
		        if (biblioteca.registrarLibro(libro)) {
		            registrados++;
		            System.out.println("Ejemplar registrado. Código: " + codigo);
		        } else {
		            System.out.println("No se pudo registrar el ejemplar.");
		        }
		    }
		
		    System.out.println("Se registraron " + registrados + " de " + cantidad + " ejemplares.");
		    break;

	
		    case 2:
		        // Buscar libro
		        System.out.println("\n===== BUSCAR LIBRO =====");
		        System.out.println("1. Buscar por código");
		        System.out.println("2. Buscar por título");

		        int tipoBusqueda = leerEntero(scanner, "Seleccione el tipo de búsqueda: ");

		        switch (tipoBusqueda) {

		            case 1:
		                // Buscar por código
		                String codigoBuscado = leerTextoNoVacio(scanner, "Ingrese el código del libro: ");

		                Libro libroEncontrado = biblioteca.buscarLibroPorCodigo(codigoBuscado);

		                if (libroEncontrado != null) {
		                    System.out.println(libroEncontrado);
		                } else {
		                    System.out.println("Libro no encontrado.");
		                }
		                break;

		            case 2:
		                // Buscar por título
		                String tituloBuscado = leerTextoNoVacio(scanner, "Ingrese el título o parte del título: ");

		                List<Libro> resultados = biblioteca.buscarLibrosPorTitulo(tituloBuscado);

		                if (resultados.isEmpty()) {
		                    System.out.println("No se encontraron libros con ese título.");
		                } else {
		                    System.out.println("\nLibros encontrados:");
		                    biblioteca.mostrarLibrosAgrupados(resultados);
		                }
		                break;

		            default:
		                System.out.println("Tipo de búsqueda inválido.");
		                break;
		        }
		        break;
	
		    case 3:
		        biblioteca.listarLibros();
		        break;
	
		    case 4:
		        // Eliminar libro
		    	
		    	String codigoEliminar = leerTextoNoVacio(scanner, "Ingrese el código del libro que desea eliminar: ");

		        Libro libroAEliminar = biblioteca.buscarLibroPorCodigo(codigoEliminar);

		        if (libroAEliminar == null) {
		            System.out.println("No se encontró un libro con ese código.");
		        } else if (!libroAEliminar.isDisponible()) {
		            System.out.println("No se puede eliminar el libro porque está prestado.");
		        } else {
		            boolean eliminado = biblioteca.eliminarLibro(codigoEliminar);

		            if (eliminado) {
		                System.out.println("Libro eliminado correctamente.");
		            } else {
		                System.out.println("No se pudo eliminar el libro.");
		            }
		        }
		        break;
		        
		    default:
		        System.out.println("Opción inválida.");
		        break;
			} 
		} while (opcion != 0);
		
	}
	private static void menuSocios(Biblioteca biblioteca, Scanner scanner) {
	    int opcion = -1;

	    do {
	        System.out.println("\n===== GESTIÓN DE SOCIOS =====");
	        System.out.println("1. Registrar socio");
	        System.out.println("2. Buscar socio");
	        System.out.println("3. Listar socios");
	        System.out.println("0. Volver al menú principal");
	        opcion = leerEntero(scanner, "Seleccione una opción: ");

	        switch (opcion) {
	            case 1:
	                // Registrar socio

	            	int numeroSocio = leerNumeroSocio(scanner, "Ingrese el número de socio: ");
	            	
	            	String nombre = leerTextoNoVacio(scanner, "Ingrese el nombre del socio: ");

	            	Socio socio = new Socio(numeroSocio, nombre);

	            	if (biblioteca.registrarSocio(socio)) {
	            	    System.out.println("Socio registrado correctamente.");
	            	} else {
	            	    System.out.println("No se pudo registrar el socio. El número ya existe.");
	            	}
	                break;
	            case 2:
	                // Buscar socio

	            	int numeroSocioBuscado = leerNumeroSocio(scanner, "Ingrese el número de socio: ");

	            	Socio socioEncontrado = biblioteca.buscarSocio(numeroSocioBuscado);

	            	if (socioEncontrado != null) {
	            	    System.out.println(socioEncontrado);
	            	} else {
	            	    System.out.println("Socio no encontrado.");
	            	}
	                break;
	            case 3:
	                biblioteca.listarSocios();
	                break;
	            case 0:
	                System.out.println("Volviendo al menú principal...");
	                break;
	            default:
	                System.out.println("Opción inválida.");
	                break;
	        }
	    } while (opcion != 0);
	}
	private static void menuPrestamos(Biblioteca biblioteca, Scanner scanner) {
	    int opcion = -1;

	    do {
	        System.out.println("\n===== GESTIÓN DE PRÉSTAMOS =====");
	        System.out.println("1. Registrar préstamo");
	        System.out.println("2. Registrar devolución");
	        System.out.println("3. Consultar préstamos de un socio");
	        System.out.println("0. Volver al menú principal");
	        opcion = leerEntero(scanner, "Seleccione una opción: ");

	        switch (opcion) {
	            case 1:
	                // Registrar préstamo

	            	int numeroSocio = leerNumeroSocio(scanner, "Ingrese el número de socio: ");
	            	
	            	String codigoLibro = leerTextoNoVacio(scanner, "Ingrese el código del libro: ");
	            	boolean prestado = biblioteca.prestarLibro(codigoLibro, numeroSocio);
	            	
	            	
	            	if (prestado) {
	            	    System.out.println("Préstamo registrado correctamente.");
	            	} else {
	            	    System.out.println("No se pudo realizar el préstamo. Verifique el socio, el libro y su disponibilidad.");
	            	}
	            	
	                break;
	            case 2:
	                // Registrar devolución

	            	int numeroSocioDevolucion = leerNumeroSocio(scanner, "Ingrese el número de socio: ");
	            	
	            	String codigoLibroDevolucion = leerTextoNoVacio(scanner, "Ingrese el código del libro: ");

	            	boolean devuelto = biblioteca.devolverLibro(codigoLibroDevolucion, numeroSocioDevolucion);

	            	if (devuelto) {
	            	    System.out.println("Libro devuelto correctamente.");
	            	} else {
	            	    System.out.println("No se pudo realizar la devolución. Verifique el socio, el libro y el préstamo.");
	            	}
	                break;
	            case 3:
	                // Consultar préstamos

	            	int numeroSocioConsulta = leerNumeroSocio(scanner, "Ingrese el número de socio: ");
	            	biblioteca.consultarPrestamos(numeroSocioConsulta);
	                break;
	            case 0:
	                System.out.println("Volviendo al menú principal...");
	                break;
	            default:
	                System.out.println("Opción inválida.");
	                break;
	        }

	    } while (opcion != 0);
	}
	private static int leerEntero(Scanner scanner, String mensaje) {
	    while (true) {
	        System.out.print(mensaje);
	        String entrada = scanner.nextLine();

	        try {
	            return Integer.parseInt(entrada.trim());
	        } catch (NumberFormatException e) {
	            System.out.println("Entrada inválida. Ingrese un número entero.");
	        }
	    }
	}
	private static int leerNumeroSocio(Scanner scanner, String mensaje) {
	    while (true) {
	        int numero = leerEntero(scanner, mensaje);

	        if (numero > 0) {
	            return numero;
	        }

	        System.out.println("El número de socio debe ser mayor que cero.");
	    }
	}
	private static String leerTextoNoVacio(Scanner scanner, String mensaje) {
	    while (true) {
	        System.out.print(mensaje);
	        String entrada = scanner.nextLine().trim();

	        if (!entrada.isEmpty()) {
	            return entrada;
	        }

	        System.out.println("Este campo no puede quedar vacío.");
	    }
	}

}
