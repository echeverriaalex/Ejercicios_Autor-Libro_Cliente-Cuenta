package app;

import Autor_Libro.Ejecucion1;
import Cliente_Cuenta.Ejecucion2;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("\n------ Ejecutando el primer punto de la guia: Autor y Libro ------");
		Ejecucion1.Ejecucion();
		
		System.out.println("\n-------------------------------------\n");
		
		System.out.println("\n------ Ejecutando el segundo punto de la guia: Cliente y Cuenta ------ \n");
		Ejecucion2.Ejecucion();
	}
}
