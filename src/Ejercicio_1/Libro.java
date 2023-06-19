package Ejercicio_1;

public class Libro extends Autor{
	
	private String titulo;
	private float precio;
	private int stock;
	Autor autor;
	
	public Libro() {		
		this.setTitulo("");
		this.setPrecio(0);
		this.setStock(0);
		this.setAutor(null);
	}
	
	public Libro(String titulo, float precio, int stock, Autor autor) {		
		this.setTitulo(titulo);
		this.setPrecio(precio);
		this.setStock(stock);
		this.setAutor(autor);
	}
	
	public void setTitulo(String titulo) {this.titulo = titulo;}	
	public void setAutor(Autor autor) {this.autor = autor;}	
	public void setPrecio(float precio) {this.precio = precio;}	
	public void setStock(int stock) {this.stock = stock;}
	
	public String getTitulo() {return this.titulo;}	
	public float getPrecio() {return this.precio;}	
	public int getStock() {return this.stock;}	
	public Autor getAutor() {return this.autor;}
	
	
	public void ImprimirLibro() {		
		System.out.print("\nTitulo: "+ this.getTitulo() +
						"\nPrecio: "+ this.getPrecio() + 
						"\nStock: "+ this.getStock() + 
						this.autor.toString());
	}
	
	public void ImprimirAutorLibro(){		
		this.autor.ImprimirInfoAutor();
	}

	
	public void ImprimirLibroyAutor(){		
		System.out.println("\n\nEl libro, "+ this.getTitulo() +
					" de " + this.autor.getNombreApellido() + 
					". Se vende a $ " + this.getPrecio() + " pesos.");
	}
}
