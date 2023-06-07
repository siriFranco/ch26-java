package flujo_01;

import java.util.Scanner;

public class Condicional_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * Sintáxis
		 * 
		 * switch (expresión) {
		 * 	case valor1 : expresión;
		 * 				  break;
		 *  case valor2 : expresión;
		 * 				  break;
		 *  default : 	  expresión;
		 * 				  break;
		 * }
		 * 
		 * 
		 *  La expresión a evaluar debe ser un tipo entero, string ó enum.
		 *  La condicional Switch usa el método equals para comparar los Strings.
		 *  
		 *  
		 *  
		 */
		
		// ----------------------------------------
		/* Leer usando la clase Scanner un mes (1 - 12) e indicar el mes en texto.
		 * ej: "Escribe tu mes de nacimiento" 12
		 * 	Naciste en Diciembre
		 * 
		 */
		/* Scanner myScan;
		myScan = new Scanner (System.in);
		System.out.println("Escribe el mes que nacsite");
		String month = myScan.next();
		
		myScan.nextLine();
		switch(month) {
		case "1":
			System.out.println("Naciste en Enero");
		case "2":
			System.out.println("Naciste en Febrero");
		case "12":
			System.out.println("Naciste en Diciembre");
		default:
			System.out.println("¿Estás tratando de romper la Mátrix?");
		}
		myScan.close();
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println( "Mes de nacimiento" );
		System.out.println( "Introduce el número del mes" );
		if ( sc.hasNextInt() ) {
			String mesTxt = "";
			int mesNacimiento = sc.nextInt();
			sc.nextLine();
			// Switch para encontrar el mes
			switch (mesNacimiento) {
			case 1 :
				mes Txt = "Enero";
				break;
			}
		}
		
		
		// Estación correspondiente al mes de nacimiento.
		// ej. La estación es Invierno.
	}

}
