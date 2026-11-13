package biblioteca;

import java.util.Scanner;

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
			System.out.print("Seleccione una opción: ");
			int opcion = scanner.nextInt();
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
		System.out.print("Seleccione una opción: ");
		
		opcion = scanner.nextInt();
		
		switch (opcion) {

		    case 1:
		        // Registrar libro
		    	scanner.nextLine();
		    	System.out.print("Ingrese el código del libro: ");
		    	String codigo = scanner.nextLine();

		    	System.out.print("Ingrese el título del libro: ");
		    	String titulo = scanner.nextLine();

		    	System.out.print("Ingrese el autor del libro: ");
		    	String autor = scanner.nextLine();
		    	Libro libro = new Libro(codigo, titulo, autor);
		    	
		    	if (biblioteca.registrarLibro(libro)) {
		    	    System.out.println("Libro registrado correctamente.");
		    	} else {
		    	    System.out.println("No se pudo registrar el libro. El código ya existe.");
		    	}
		        break;
	
		    case 2:
		        // Buscar libro
		    	scanner.nextLine();
		    	
		    	System.out.print("Ingrese el código del libro: ");
		    	String codigoBuscado = scanner.nextLine();
		    	Libro libroEncontrado = biblioteca.buscarLibroPorCodigo(codigoBuscado);
		    	
		    	if (libroEncontrado != null) {
		    	    System.out.println(libroEncontrado);
		    	} else {
		    	    System.out.println("Libro no encontrado.");
		    	}
		        break;
	
		    case 3:
		        biblioteca.listarLibros();
		        break;
	
		    case 4:
		        // Eliminar libro
		    	scanner.nextLine();

		    	System.out.print("Ingrese el código del libro que desea eliminar: ");
		    	String codigoEliminar = scanner.nextLine();
		    	boolean eliminado = biblioteca.eliminarLibro(codigoEliminar);
		    	
		    	if (eliminado) {
		    	    System.out.println("Libro eliminado correctamente.");
		    	} else {
		    	    System.out.println("No se encontró un libro con ese código.");
		    	}
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
	private static void menuSocios(Biblioteca biblioteca, Scanner scanner) {
	    int opcion = -1;

	    do {
	        System.out.println("\n===== GESTIÓN DE SOCIOS =====");
	        System.out.println("1. Registrar socio");
	        System.out.println("2. Buscar socio");
	        System.out.println("3. Listar socios");
	        System.out.println("0. Volver al menú principal");
	        System.out.print("Seleccione una opción: ");

	        opcion = scanner.nextInt();

	        switch (opcion) {
	            case 1:
	                // Registrar socio
	            	scanner.nextLine();

	            	System.out.print("Ingrese el número de socio: ");
	            	int numeroSocio = scanner.nextInt();

	            	scanner.nextLine();

	            	System.out.print("Ingrese el nombre del socio: ");
	            	String nombre = scanner.nextLine();

	            	Socio socio = new Socio(numeroSocio, nombre);

	            	if (biblioteca.registrarSocio(socio)) {
	            	    System.out.println("Socio registrado correctamente.");
	            	} else {
	            	    System.out.println("No se pudo registrar el socio. El número ya existe.");
	            	}
	                break;
	            case 2:
	                // Buscar socio
	            	scanner.nextLine();

	            	System.out.print("Ingrese el número de socio: ");
	            	int numeroSocioBuscado = scanner.nextInt();

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
	        System.out.print("Seleccione una opción: ");

	        opcion = scanner.nextInt();

	        switch (opcion) {
	            case 1:
	                // Registrar préstamo
	            	scanner.nextLine();

	            	System.out.print("Ingrese el número de socio: ");
	            	int numeroSocio = scanner.nextInt();

	            	scanner.nextLine();

	            	System.out.print("Ingrese el código del libro: ");
	            	String codigoLibro = scanner.nextLine();
	            	boolean prestado = biblioteca.prestarLibro(codigoLibro, numeroSocio);
	            	
	            	if (prestado) {
	            	    System.out.println("Préstamo registrado correctamente.");
	            	} else {
	            	    System.out.println("No se pudo realizar el préstamo. Verifique el socio, el libro y su disponibilidad.");
	            	}
	            	
	                break;
	            case 2:
	                // Registrar devolución
	            	scanner.nextLine();

	            	System.out.print("Ingrese el número de socio: ");
	            	int numeroSocioDevolucion = scanner.nextInt();

	            	scanner.nextLine();

	            	System.out.print("Ingrese el código del libro: ");
	            	String codigoLibroDevolucion = scanner.nextLine();

	            	boolean devuelto = biblioteca.devolverLibro(codigoLibroDevolucion, numeroSocioDevolucion);

	            	if (devuelto) {
	            	    System.out.println("Libro devuelto correctamente.");
	            	} else {
	            	    System.out.println("No se pudo realizar la devolución. Verifique el socio, el libro y el préstamo.");
	            	}
	                break;
	            case 3:
	                // Consultar préstamos
	            	scanner.nextLine();

	            	System.out.print("Ingrese el número de socio: ");
	            	int numeroSocioConsulta = scanner.nextInt();

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

}
