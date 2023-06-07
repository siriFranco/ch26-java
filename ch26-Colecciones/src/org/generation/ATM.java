package org.generation;

public class ATM {

	// atributos de instancia (non-static fields)
	String serialNumber; // null
	double balance; // 0.0
	
	// atributos de clase (static fields)
	//static String bankName;
	static String bankName = "BBVA"; // 01 Inicializacion
	static int counterATM;
	
	// bloque de inicializacion de atributos de instancia
	// se ejecuta cuando se crea la instancia
	{
		serialNumber="--";
		balance = 100_000.00;
		
	}
	
	// bloque de inicialización de atributos de clase
	static {
		bankName = "Santander S.A de C.V."; // 02 Inicializacion
		counterATM = 1;
	}
	
	ATM(double balance){
		this.balance = balance;
		this.serialNumber =  Integer.toString(counterATM ++);
	}
	
	// constructores
	ATM (String serialNumber, double balance){
		// this.serialNumber = serialNumber; Sr se quita, aparecerá en serialNumber "---" porque se estableció anteriormente
		// this.balance = balance;
		
		// llamar otro constructor, se usa this().
		// Tiene que ser la primera línea! 
		this(balance); // ATM() esto hace que se llame al constructor de arriba, es decir al ATM (double balance)...
		// al hacer esto, no se le asiga el número de serie que se implementa en ATMTest, los A1, A2
	}
	
	// métodos de instancia
	double getBalance() {
		return this.balance;
	}
	
	// método de clase
	static String getBankName() {
		return "Bank: " + bankName;
	}
	
	static {
		bankName = "Citibanamex S.A de C.V.";
	}
	
}
