package org.generation;

import java.util.ArrayList;

public class Bank {
	String address;
	int sucursalNumber;
	ArrayList<ATM> ATMs;
	
	{
		ATMs = new ArrayList<>();
	}
	
	static int counterBank = 1;
	
	Bank() {
		sucursalNumber = counterBank++;
	}

	Bank(String address){
		this(); // invoca al constructor por default
		this.address = address;
	}
	
	String getATMs() {
		String text = "";
		for ( ATM Atm : ATMs ) {
			text += Atm.serialNumber + " $" + Atm.balance + "\n";
		}
		return text;
	}
	
}
