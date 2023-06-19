package Cliente_Cuenta;

public class Cliente {
	
	private int id;
	private String nombre;
	private char genero; // (M o F)
	
	public Cliente(){		
		this.setNombre("");
		this.setId(0);
		this.setGenero(' ');
	}
	
	public Cliente(int id, String nombre, char genero){
		this.setNombre(nombre);
		this.setId(id);
		this.setGenero(genero);
	}
	
	public void setId(int id) {this.id = id;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public void setGenero(char genero) {this.genero = genero;}

	public int getId() {return this.id;}
	public String getNombre() {return this.nombre;}
	public char getGenero(){return this.genero;}	
	
	public String CompletarGenero(){		
		if(getGenero() == 'M')
			return "Masculino"; 
		else
			return "Femenino";
	}
	
	@Override
	public String toString() {
		return "\nNombre: " + this.getNombre() + 
				"\nGenero: " + this.CompletarGenero() + 
				"\nIdentificacion: " + this.getId();
	}
	
	public String getInfoCliente() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nNombre: " + this.getNombre());
		builder.append("\nGenero: " + this.CompletarGenero());
		builder.append("\nIdentificacion: " + this.getId());		
		return builder.toString();
	}
	
	public void ImprimirCliente() {		
		System.out.println("\nNombre: " + this.getNombre() + 
							"\nGenero: " + this.CompletarGenero() + 
							"\nIdentificacion: " + this.getId());
	}
}