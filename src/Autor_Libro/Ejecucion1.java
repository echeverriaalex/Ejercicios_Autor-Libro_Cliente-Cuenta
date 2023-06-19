package Autor_Libro;

public class Ejecucion1 {
	
	public static void Ejecucion() {
		
		// Punto A
		System.out.print("\nPunto A: inicializar AUTOR\n");
		
		// creo el objeto autor
		Autor autor = new Autor();
		
		// creo variables para almacenar los datos del autor
		String nombre = "Joshua";
		String apellido = "Bloch";
		String email = "joshua@email.com";
		char genero = 'M';
		
		
		// B
		System.out.print("\nPunto B: imprimir AUTOR\n");
		// inicializo el autor usando los datos almacenados en las variables anteriores
		autor = new Autor(nombre, apellido, email, genero);
		
		// tambien puedo inicializar el autor asi, sin el uso de variables
		autor = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
		
		// forma de imprimir toda la info del autor
		autor.ImprimirInfoAutor();
		
		// forma de imprimir 2 
		System.out.println("\n" + autor.toString());
		
		// otra fomra de imprimir 3
		System.out.println("\n" + autor.ImprimirInfoBuilder());
		
		
		// C
		System.out.print("\nPunto C: inicializar LIBRO\n");
		// hago lo mismo que en el punto A y B
		Libro libro = new Libro();
		String titulo= "Effective Java";
		float costo= 450;
		int cantidad= 150;
		// inicializo el libro usando los datos almacenados en las variables anteriores
		libro = new Libro(titulo, costo, cantidad, autor);
		
		// tambien puedo inicializar el libro asi, sin el uso de variables y el obejo autor
		// creado previamente
		libro = new Libro("Effective Java", 450, 150, autor);	
		
		// D
		System.out.print("\nPunto D: Imprima por pantalla el libro instanciado\n\n");
		libro.ImprimirLibro();
		
		// E
		System.out.print("\n\nNuevas modificaciones a LIBRO\n");
		// Modifique el precio del libro “Effective Java” a 500 
		// pesos y aumente la cantidad en 50 copias
		libro.setPrecio(500);
		libro.setStock(libro.getStock() + 50);		
		libro.ImprimirLibro();
		
		// F
		System.out.print("\n\nPunto F: Imprima por pantalla los atributos del Autor Joshua,"+
									"accediendo desde el Libro Effective Java \n");		
		libro.ImprimirAutorLibro();
		
		// G
		System.out.print("\n\nPunto G: Agregue un método a la clase Libro que posibilite imprimir en pantalla el\r\n"
				+ "siguiente mensaje: “El libro, {título} de {nombre del autor}. Se vende a\r\n"
				+ "{precio} pesos.”\n");
		libro.ImprimirLibroyAutor();
	}
}