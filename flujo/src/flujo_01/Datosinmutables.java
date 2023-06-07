package flujo_01;

import java.util.Scanner;

public class Datosinmutables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Dato inmutable: No se puede modificar.
		/*
		int nCuentaBancaria = 678;
		nCuentaBancaria = 999;
		
		String nombre = "Alex";
		String participante = "Sofi";
		nombre = "Alexis";
		participante = new String("Alex");
		
		// Operador == nos compara la referencia de los objetos
		// Para comparar el contenido en los Strings, se debe usar
		// el metodo equals()
		// if ( participante == "Alex" ) {
		if ( participante.equals( "Alex" )) {
			System.out.println("Los nombres concuerdan");
		}
		else System.out.println("Los nombres son diferentes");
		
		
		String texto = ( rango >= 1 && ramgo <= 10) ?
				"La seleccion esta en el rango":
				"Esta fuera de rango";
		System.out.println(texto);
		*/
		// ---------------------------------------------------------
		// -------------- Clase Scanner ----------------------------
		
		Scanner myScan;
		myScan = new Scanner( System.in );
		/*
		System.out.println("Escribe tu nombre");
		String myName = myScan.next(); // leer hasta /n 
		System.out.println("Escribe tu nombre: \n");		
		System.out.println("Tu nombre es" + myName);
		System myLastname = myScan.next();
		myScan.nextLine(); */
		
		System.out.println("Escribe tu edad en letras");
		String ageTxt = myScan.nextLine();
		
		if ( myScan.hasNextInt() ){ 
		int age = myScan.nextInt(ageTxt);
		myScan.nextLine();
		
		System.out.println("Tu edad es " + age );
		System.out.println("Pronto cumplirás " + ( age+1 ));
		} 
		else {
			System.out.println("Lo siento");			
		}
		myScan.close();
		
	}

}
