package Ejercicio_2;

public class Cuenta extends Cliente {

	private int id;
	private float balance;
	Cliente cliente;
	private int limiteOperaciones = 10;
	private int operacionesRealizadas;
	private String historial = "";
	
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
	public int getOperacionesRealizadas() {return operacionesRealizadas;}
	public void setOperacionesRealizadas(int operacionesRealizadas) {this.operacionesRealizadas = operacionesRealizadas;}
	public String getHistorial() {return historial;}
	public void setHistorial(String historial) {this.historial = historial;}
	
	public void ImprimirCuenta() {		
		System.out.println("\nId cuenta: " + this.getId() + 
							"\nBalance: " + this.getBalance() +
							"\nInfo del Cliente \n" + this.cliente.toString());
	}
	
	public boolean checkOperacionesRealizadas() {		
		if(this.operacionesRealizadas <= this.limiteOperaciones) {
			return true; // operacion aceptada
		}
		else {
			return false;
		}		
	}
	
	public void registrarMovimiento(String movimiento) {		
		if(this.checkOperacionesRealizadas() == true) {
			this.setOperacionesRealizadas(this.getOperacionesRealizadas() + 1);
			this.setHistorial(this.getHistorial() + "\n" + movimiento);
		}		
		else {
			System.out.println("\nNo se puede registrar mas movimientos.");
		}
	}
		
	@Override
	public String toString() {
		return 	"\nId cuenta: " + this.getId() + 
				"\nBalance: " + this.getBalance() +
				"\nInfo del Cliente \n" + this.cliente.toString();
	}
	
	public void depositar(float ingreso){
		this.balance += ingreso;
		this.registrarMovimiento("\nSe realizo un deposito de $ " + ingreso);
	}
	
	public String pedirPrestado(float extraccionDeseada) {		
		boolean respuesta = this.checkLimiteNegatico(extraccionDeseada);		
		if(respuesta == true) {
			this.balance -= extraccionDeseada;
			this.registrarMovimiento("\nSe realizo un prestamo ");
			return "Prestamo aceptado, el limite de saldo negativo es $2000, su saldo actual es " + 
					this.getBalance() + "\nDisfrute sus $ " + extraccionDeseada;
		}
		else {
			return "Prestamo rechazado, el limite de saldo negativo es $2000, su saldo actual es " +
					this.getBalance() + "\nIntente con extraer menos de $ " + extraccionDeseada;
		}
	}
	
	public boolean checkLimiteNegatico(float extraccionDeseada) {		
		float limite = -2000;		
		if(this.balance - extraccionDeseada >= limite)
			return true;
		else
			return false;	
	}
	
	public String extraer(float extraccion) {		
		if(extraccion < this.balance) {
			this.balance -= extraccion;
			this.registrarMovimiento("\nSe realizo una extraccion de $ " + extraccion);
			return "Extraccion exitosa disfrute de sus $ " + extraccion;
		}
		else {
			System.out.println("El saldo es insuficiente para la extraccion de $ " + 
					extraccion + "\nSe intentara realizar un prestamo, espere ...");
			return this.pedirPrestado(extraccion);
		}
			
	}	
}