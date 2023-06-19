package Autor_Libro;

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
		System.out.print("\n\t*******************\n\t Info del Autor \n\t*******************\n");
		System.out.print("\n\t Nombre: "+ this.getNombre());
		System.out.print("\n\t Apellido: "+ this.getApellido());
		System.out.print("\n\t Email: "+ this.getEmail());
		System.out.print("\n\t Genero: "+ this.getGenero());
		System.out.print("\n\t Genero completo: "+ this.getGeneroCompleto());
		System.out.print("\n\t Nombre y Apellido: "+ this.getNombreApellido());
		System.out.print("\n\t--------------------------------\n");
	}
	
	public void ImprimirAutor() {		
		System.out.print("\n\t Nombre: "+ this.getNombre() + 
						"\n\t Apellido: "+ this.getApellido() +
						"\n\t Email: "+ this.getEmail() + 
						"\n\t Genero: "+ this.getGenero() +
						"\n\t Genero completo: "+ this.getGeneroCompleto() +
						"\n\t Nombre y Apellido: "+ this.getNombreApellido());
	}
	
	public String ImprimirInfoBuilder() {		
		StringBuilder  builder= new StringBuilder();		
		builder.append("\n\t\t Nombre: "+ this.getNombre());
		builder.append("\n\t\t Apellido: "+ this.getApellido());
		builder.append("\n\t\t Email: "+ this.getEmail());
		builder.append("\n\t\t Genero: "+ this.getGenero());
		builder.append("\n\t\t Genero completo: "+ this.getGeneroCompleto());
		builder.append("\n\t\t Nombre y Apellido: "+ this.getNombreApellido());
		return builder.toString();
	}
	
	@Override
	public String toString() {
		return 	"\n	Nombre: "+ this.getNombre() + 
				"\n	Apellido: "+ this.getApellido()+ 
				"\n	Email: "+ this.getEmail() + 
				"\n	Genero: "+ this.getGenero() + 
				"\n	Genero completo: "+ this.getGeneroCompleto() + 
				"\n Nombre y Apellido: "+ this.getNombreApellido(); 
	}
}