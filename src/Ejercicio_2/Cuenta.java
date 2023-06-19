package Ejercicio_2;

public class Cuenta extends Cliente {

	private int id;
	private float balance;
	Cliente cliente;
	
	public Cuenta() {
		this.setId(0);
		this.setBalance(0);
		this.cliente = new Cliente(); // o null
	}
	
	public Cuenta(int id, float balance, Cliente cliente) {		
		this.setId(id);
		this.setBalance(balance);
		this.cliente = cliente;
	}
	
	public void setId(int id) {this.id = id;}
	public void setBalance(float balance) {this.balance = balance;}
	public void setCliente(Cliente cliente) {this.cliente = cliente;}
	
	public int getId() {return id;}
	public float getBalance() {return balance;}
	public Cliente getCliente() {return this.cliente;}
	
	public void ImprimirCuenta() {		
		System.out.println("\nId cuenta: " + this.getId() + 
							"Balance: " + this.getBalance() +
							"\nInfo del Cliente \n" + this.cliente.toString());
	}
		
	@Override
	public String toString() {
		return 	"\nId cuenta: " + this.getId() + 
				"Balance: " + this.getBalance() +
				"\nInfo del Cliente \n" + this.cliente.toString();
	}
	
	public void depositar(float ingreso){this.balance += ingreso;}
	
	public String extraer(float extraccion) {		
		if(extraccion < this.balance) {
			this.balance -= extraccion;
			return "\n\nExtraccion exitosa disfrute sus $ " + extraccion + ",\n\n";
		}
		else
			return "\nError: el saldo es insuficiente para la extraccion de $ " + extraccion + ".\n\n";
	}
}
