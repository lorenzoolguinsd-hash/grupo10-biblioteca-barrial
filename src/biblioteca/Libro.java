package biblioteca;

public class Libro {
	//atributos
	private String codigo;
	private String titulo;
	private String autor;
	private boolean disponible;

	//constructor
	public Libro(String codigo, String titulo, String autor) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.disponible = true;
	}
	
	//getters
	public String getCodigo() {
		return codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public boolean isDisponible() {
		return disponible;
	}
	
	//setters
	public void setDisponible(boolean disponible) {
		this.disponible=disponible;
	}
	
	@Override
	public String toString() {
		return "Código: " + codigo +
				", Título: " + titulo +
				", Autor: " + autor +
				", Disponible: " + disponible;
	}
}
