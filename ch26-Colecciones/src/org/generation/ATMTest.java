package org.generation;

public class ATMTest {

	public static void main(String[] args) {
		/* Para utilizar los atributos / métodos de clase
		 * no se requiere una instancia. Se usa directamente de la clase
		 */
		
		// System.out.println( ATM.getBankName() );
		
		String firstBankName = ATM.getBankName(); // atributo
		String bankName = ATM.getBankName(); // método
		System.out.println( firstBankName );
		System.out.println( bankName );
		
		// Instanciar un objeto de la clase
		ATM cajeroA;
		//Marca error porque en ATM.java tiene 2 atributos -> cajeroA = new ATM(); 
		 cajeroA = new ATM("A1", 50_000.00); //(serialNumber, double balance)
		 ATM cajeroB = new ATM("A2", 75_000.00); //(serialNumber, double balance)
		 ATM cajeroC = new ATM(60_000); //(serialNumber (como no tiene, toma el numero de counterATM, double balance)
		 ATM cajeroD = new ATM(65_000); //(serialNumber, double balance)
		 ATM cajeroE = new ATM(70_000);
		 
		 
		 System.out.println(cajeroA.getBalance());
		 System.out.println(cajeroB.getBalance());
		 System.out.println(cajeroA.serialNumber + " $" + cajeroA.getBalance() );
		 System.out.println(cajeroB.serialNumber + " $" + cajeroB.getBalance() );
		 System.out.println(cajeroC.serialNumber + " $" + cajeroC.getBalance() );
		 System.out.println(cajeroD.serialNumber + " $" + cajeroD.getBalance() );
		 System.out.println(cajeroE.serialNumber + " $" + cajeroE.getBalance() );
	}

}
