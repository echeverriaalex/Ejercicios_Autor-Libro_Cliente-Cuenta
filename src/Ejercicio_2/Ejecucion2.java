package Ejercicio_2;

public class Ejecucion2 {

	public static void Ejecucion() {
		
		// Punto A
		System.out.print("\nPunto A: crear un cliente e imprimir su info \n");
		Cliente cliente = new Cliente();
		cliente = new Cliente(25,"Alex Echeverria", 'M');
		cliente.ImprimirCliente();
		
		// Punto B
		System.out.println("\n\nCrear una Cuenta bancaria para el Cliente "
				+ "anterior con un saldo inicial de 10000.");
		Cuenta cuenta = new Cuenta();
		cuenta = new Cuenta(cliente.getId(), 10000, cliente);
		cuenta.ImprimirCuenta();
	}
}
