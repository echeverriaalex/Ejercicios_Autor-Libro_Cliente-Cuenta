package Ejercicio_1;

public class Autor {
	
	private String nombre;
	private String apellido;
	private String email;
	private char genero; // M o F
	
	public Autor() {		
		this.setNombre("");
		this.setApellido("");
		this.setEmail("");
		this.setGenero(' ');
	}
	
	public Autor(String nombre, String apellido, String email, char genero){
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setEmail(email);
		this.setGenero(genero);
	}
	
	public void setNombre(String nombre) {this.nombre = nombre;}	
	public void setApellido(String apellido) {this.apellido = apellido;}	
	public void setEmail(String email) {this.email = email;}	
	public void setGenero(char genero) {this.genero = genero;}
		
	public String getNombre() {return this.nombre;}	
	public String getApellido() {return this.apellido;}	
	public String getEmail() {return this.email;}	
	public char getGenero() {return this.genero;}

	public String getNombreApellido() {return getNombre()+" "+ getApellido();}	
	
	public String getGeneroCompleto(){
		char genero = this.getGenero();
		String generoProcesado = "";
		
		switch(genero){
			case 'M': generoProcesado = "Masculino";
				break;
			
			case 'F': generoProcesado = "Femenino";
				break;
		}
		return generoProcesado;
	}
	
	public void ImprimirInfoAutor() {		
		System.out.print("\nNombre: "+ this.getNombre());
		System.out.print("\nApellido: "+ this.getApellido());
		System.out.print("\nEmail: "+ this.getEmail());
		System.out.print("\nGenero: "+ this.getGenero());
		System.out.print("\nGenero completo: "+ this.getGeneroCompleto());
		System.out.print("\nNombre y Apellido: "+ this.getNombreApellido());
	}
	
	public void ImprimirAutor() {		
		System.out.print("\nNombre: "+ this.getNombre() + 
						"\nApellido: "+ this.getApellido() +
						"\nEmail: "+ this.getEmail() + 
						"\nGenero: "+ this.getGenero() +
						"\nGenero completo: "+ this.getGeneroCompleto() +
						"\nNombre y Apellido: "+ this.getNombreApellido());
	}
	
	public String ImprimirInfoBuilder() {		
		StringBuilder  builder= new StringBuilder();		
		builder.append("\nNombre: "+ this.getNombre());
		builder.append("\nApellido: "+ this.getApellido());
		builder.append("\nEmail: "+ this.getEmail());
		builder.append("\nGenero: "+ this.getGenero());
		builder.append("\nGenero completo: "+ this.getGeneroCompleto());
		builder.append("\nNombre y Apellido: "+ this.getNombreApellido());
		return builder.toString();
	}
	
	@Override
	public String toString() {
		return 	"\nNombre: "+ this.getNombre() + 
				"\nApellido: "+ this.getApellido()+ 
				"\nEmail: "+ this.getEmail() + 
				"\nGenero: "+ this.getGenero() + 
				"\nGenero completo: "+ this.getGeneroCompleto() + 
				"\nNombre y Apellido: "+ this.getNombreApellido(); 
	}
}