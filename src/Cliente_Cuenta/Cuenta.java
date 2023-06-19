package Cliente_Cuenta;

public class Cuenta{

	private int id;
	private float balance;
	Cliente cliente;
	private int limiteOperaciones = 10;
	private int operacionesRealizadas;
	private String historial;
	
	public Cuenta() {
		this.setId(0);
		this.setBalance(0);
		this.cliente = new Cliente(); // o null
		this.setHistorial("");
	}
	
	public Cuenta(int id, float balance, Cliente cliente) {		
		this.setId(id);
		this.setBalance(balance);
		this.cliente = cliente;
		this.setHistorial("");
	}
	
	public void setId(int id) {this.id = id;}
	public void setBalance(float balance) {this.balance = balance;}
	public void setCliente(Cliente cliente) {this.cliente = cliente;}
	public void setOperacionesRealizadas(int operacionesRealizadas) {this.operacionesRealizadas = operacionesRealizadas;}
	public void setHistorial(String historial) {this.historial = historial;}
	
	public int getId() {return id;}
	public float getBalance() {return balance;}
	public Cliente getCliente() {return this.cliente;}	
	public int getOperacionesRealizadas() {return operacionesRealizadas;}	
	public String getHistorial() {return historial;}
		
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
	
	public String getMensajeCLiente(int mensajeCliente, float monto) {
		String mensaje = "";
		switch (mensajeCliente) {
		case 1:		
			mensaje = "Extraccion exitosa disfrute de sus $ " + monto;
			break;
		case 2:		
			mensaje = "Deposito de $" + monto + " pesos " + "fue realizado con exito";
			break;
		case 3:		
			mensaje = "Prestamo aceptado, el limite de saldo negativo es $2000, su saldo actual es " + 
					this.getBalance() + "\nDisfrute sus $ " + monto;
			break;	
			
		case 4:		
			mensaje ="Prestamo rechazado, el limite de saldo negativo es $2000, su saldo actual es " +
					this.getBalance() + "\nIntente con extraer menos de $ " + monto;
			break;
		default:
			mensaje = "Estimado cliente, algo salio mal. Reintente.";
			break;
		}
		return mensaje;
	}
	
	public String getMensajeHistorial(int operacion, float monto) {
		String mensaje = "";
		switch (operacion) {
		case 1:		
			mensaje = "Se realizo un deposito de $ " + monto;
			break;
		case 2:		
			mensaje = "Se realizo un prestamo de $ " + monto;
			break;
		case 3:		
			mensaje = "Se realizo una extraccion de $ " + monto;
			break;		
		default:
			mensaje = "Algo salio mal.";
			break;
		}
		return mensaje;
	}
	
		
	@Override
	public String toString() {
		return 	"\nId cuenta: " + this.getId() + 
				"\nBalance: " + this.getBalance() +
				"\nInfo del Cliente \n" + this.cliente.toString();
	}
	
	public String depositar(float deposito){
		this.balance += deposito;
		// 1 es la operacion de depositar
		this.registrarMovimiento(getMensajeHistorial(1, deposito));
		return this.getMensajeCLiente(2, deposito);
	}
	
	public String pedirPrestado(float extraccionDeseada) {		
		boolean respuesta = this.checkLimiteNegatico(extraccionDeseada);		
		if(respuesta == true) {
			if(extraccionDeseada > this.getBalance()) {
				float prestamo = extraccionDeseada - this.getBalance();
				this.registrarMovimiento(getMensajeHistorial(2, prestamo));
			}			
			this.setBalance(this.getBalance() - extraccionDeseada);			
			
			return getMensajeCLiente(3, extraccionDeseada);
		}
		else {
			return getMensajeCLiente(4, extraccionDeseada);
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
			// 3 es la operacion de extraccion
			this.registrarMovimiento(getMensajeHistorial(3, extraccion));
			return this.getMensajeCLiente(1, extraccion);
		}
		else {
			System.out.println("El saldo es insuficiente para la extraccion de $ " + 
					extraccion + "\nSe intentara realizar un prestamo, espere ...");
			return this.pedirPrestado(extraccion);
		}
			
	}	
}