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
		
		// Punto C
		System.out.print("\nPunto C: operaciones de depósito y extracción \n");
		
		System.out.println("\nDeposito $300 en la cuenta");
		cuenta.depositar(300);
		System.out.println("La cuenta tiene un saldo de $ " + cuenta.getBalance());
		
		System.out.println("\nExtraigo $700 en la cuenta");
		System.out.println(cuenta.extraer(700));
		System.out.println("La cuenta tiene un saldo de $ " + cuenta.getBalance());
		
		System.out.println("\nPruebo con extraer $20000 en la cuenta, debe dar error\n");
		System.out.println(cuenta.extraer(11600));
		System.out.println("La cuenta tiene un saldo de $ " + cuenta.getBalance()+ "\n\n");
		
		System.out.println(cuenta.getHistorial());
		
		// Punto D
		
		
		
		// Punto E
	}
}
