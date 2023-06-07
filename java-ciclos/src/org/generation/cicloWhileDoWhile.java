package org.generation;
import java.util.Scanner;

public class cicloWhileDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Mientras la condicion sea verdadera, se realiza un nuevo ciclo
		 * 
		 */
		
		// Scanner sc = new Scanner ( System.in );
		var sc = new Scanner ( System.in );
		System.out.println( sc );
		// var no existe en la version 8 de Java
		
		
		
		boolean active = false;
		
		while ( active ) {
			System.out.println("Bienvenido Alexis");
			System.out.println("Quieres seguir activo (s/n)?");
			char response = sc.nextLine().toLowerCase().charAt(0);
			if( response != 's') active = false; //break;
		}
		
		do {
			System.out.println("Bienvenida Patito");
			System.out.println("Quieres seguir activa (s/n)?");
			char response = sc.nextLine().toLowerCase().charAt(0);
			if( response == 's') active = true; //break;
			else active = false;
		} while (active);
		
		System.out.println("Gracias por tu visita");
		
		while( sc.nextLine().toLowerCase().charAt(0) == 's' );
		// while( sc.nextLine().toLowerCase().charAt(0) == 's' ) si no se le pone ; al final, seguirá activo
		// y cada que pongas algo que inicie con s, seguirá respondiendo adios
		System.out.println("Adios");
		
		sc.close();
		
	}

}
