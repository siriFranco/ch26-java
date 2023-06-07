package com.citibanamex;

public class Atm {
	private int serialNumber;
	private double balance; //se hace publica para usarla en otro paquete
	
	/* {
		balance = 10_000; // ó tambien se puede poner en la linea de arriba public double balance = 10_000; "
	}
	*/
	
	private static int counterAtm = 1; //es de clase, porque tiene static
	// se le añade public para que la clase lo lea en el otro paquete
	
	public Atm() {
		this.balance = 10_000;
		this.serialNumber = counterAtm ++;
	}
	
	public Atm(double balance){
		this(); // se invoca al constructor sin parámetros
		this.balance = balance;
	}
	
	
	public Atm(String balance){
		this( Double.parseDouble(balance) );
	}|
	
	
	// Para acceder a los atributos encapsulados se usa setter y getter
	public int getSerialNumber() {
		return this.serialNumber;
	}
	
	
	
	
	public double getBalance() {
		return this.balance;
	}
	
	private double setBalance( double balance ) {
		return this.balance = balance;
	}
	
	static public int getCounterAtm() {
		return counterAtm;
	}
	
	public double deposit (double amount) {
		if(amount>0) {
			// return this.balance += amount;
			return setBalance( this.balance + amount );
		} else {
			return 0;
		}
	}
	
	
}
