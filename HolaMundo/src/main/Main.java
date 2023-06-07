package main;

public class Main {

	public static void main(String[] args) {
		//Operadores aritméticos
		
		int variableX = 50, variableY = 10;
		int resultado;
		
		resultado = variableX + variableY;
		System.out.println(resultado);
		
		resultado = variableX - variableY;
		System.out.println(resultado);
		
		resultado = variableX * variableY;
		System.out.println(resultado);
		
		resultado = variableX / variableY;
		System.out.println(resultado);
		
		variableX++; //aumenta 1, queda 51
		System.out.println(variableX);
		
		variableX--; //decrementa 1 queda 50 porque anteriormente iba 51
		System.out.println(variableX);
		
		variableX += 100; //variableX = variableX + 100;
		System.out.println(variableX);
		
		variableX /= 5; //variableX = variableX / 5;
		System.out.println(variableX);

		// ------------------ CASTING --------------------------------
		float variableZ = 5.5f;
		resultado = variableX + (int)variableZ;
		System.out.println(resultado);
		
		// resultado = (float)variableX + variableZ; para que funcione, hay que convertir a float resultado en la línea 9
		System.out.println(resultado);
		
		// ------------------ BOOLEAN --------------------------------
		int var1 = 100, var2 = 200;
		boolean resultado1;
		
		resultado1 = var1 > var2;
		System.out.println(resultado1);
		
		resultado1 = var1 < var2;
		System.out.println(resultado1);
		
		resultado1 = var1 == var2;
		System.out.println(resultado1);
		
		resultado1 = var1 != var2;
		System.out.println(resultado1);
		
		
		System.out.println("-----------------------Operador ternario--------------------");
		String mensaje = 10 > 9 ? "Es mayor" : "Es menor";
		int enteros = true ? 1 : 0;
		
		System.out.println(mensaje);
		System.out.println(enteros);
		
		String mensajeS = "Good morning, world!";
		String mensajeS2 =  new String ("Hi world");
		System.out.println(mensajeS);
		System.out.println(mensajeS2);
		
		System.out.println("-----------------------String-----------------------");
		String mensajeString = "Hola soy un String";
		
		int cantidad = mensajeString.length();
		
		boolean contiene = mensajeString.contains("hola");
		boolean comienzaCon = mensajeString.startsWith("Hola");
		boolean terminaCon = mensajeString.endsWith("g");
	
		System.out.println(cantidad);
		System.out.println(contiene); //false porque está con minúscula
		System.out.println(comienzaCon);
		System.out.println(terminaCon);
		
		String nuevoString =  mensajeString.concat("Hola, soy Siria");
		System.out.println(nuevoString);
		
		
		String mensajeString2 = "";
		float valor = 10.84449f;
		mensajeString2 = String.format("El total %d es %.2f %s", 3, valor, "MX");
		System.out.println(mensajeString2);
		System.out.printf("El total %d es %.2f %s", 3, valor, "MX");
		
		int cantidad2 = 10;
		boolean mayor = cantidad > 5;

		String resultado2 = String.format("La cantidad es mayor a %d : %b", cantidad2, mayor);
		System.out.println(resultado2);
		
		String uno = "Uno";
		String dos = "Dos";
		String tres = "Tres";

		String resultado3 = String.format("%3$s - %2$s - %1$s", uno, dos, tres); // %, posición, $, tipo
		System.out.println(resultado3);
		
		System.out.println("-----------------------String cadena---------------------");
		String cadena1 = "hola";
		String cadena2 = "Hola";
		boolean resultado4 = cadena2.equals(cadena1);
		System.out.println(resultado4);
		
		
		boolean resultado5 = cadena1.equalsIgnoreCase(cadena2);
		System.out.println(resultado5);
		
		System.out.println("-----------------------Condiciones-----------------------");
		
		String colorLuz = "Rojo";
		if ( colorLuz.equals("Verde") ) {
			
			System.out.println("Puede continuar");
			
		} else if ( colorLuz.equals("Amarillo") ){
			
			System.out.println("Alto parcial");
			
		} else if ( colorLuz.equals("Rojo") ) {
			
			System.out.println("Alto total");
			
		} 
		
		int promedio = 6;
		
		if (promedio >= 7) {
			if (promedio == 10) {
				System.out.println("Muchas felicidades");
			} else {
				System.out.println("Felicidades");
			} 
			} else {
				System.out.println("Es necesario repasar bloques");
			}
		
		System.out.println("-----------------------Switch-----------------------");
		
		String colorLuz2 = "Rojo";
		
			switch(colorLuz2) {
			
			case "Verde": 
				System.out.println("Puede continuar");
				break;
				
			case "Amarillo": 
				System.out.println("Alto parcial");
				break;
				
			case "Rojo": 
				System.out.println("Alto total");
				break;
				
			default: 
				System.out.println("Color no válido");
				break;
				
			}
			int numeroMes = 4;
			String estacion = "", mes = "";

			switch (numeroMes) {
			  case 12:
			    mes = "Diciembre";
			  case 1:
			    mes = "Enero";
			  case 2:
			    mes = "Febrero";
			    estacion = "Invierno";
			    break;
			  case 3:
			    mes = "Marzo";
			  case 4:
			    mes = "Abril";
			  case 5:
			    mes = "Mayo";
			    estacion = "Primavera";
			    break;
			  case 6:
			    mes = "Junio";
			  case 7:
			    mes = "Julio";
			  case 8:
			    mes = "Agosto";
			    estacion = "Verano";
			    break;
			  case 9:
			    mes = "Septiembre";
			  case 10:
			    mes = "Octubre";
			  case 11:
			    mes = "Noviembre";
			    estacion = "Otoño";
			    break;
			}

			System.out.println("El mes de " + mes + " se encuentra en la estación " + estacion);
	
			System.out.println("-----------------------While-----------------------");
			
	
			System.out.println("-----------------------For each-----------------------");
			int calificaciones [] = { 9, 8, 7, 10, 10, 9, 8, 8, 10, 9};
			int suma = 0;
			
			for (int valorPorIndice : calificaciones) {
				suma += valorPorIndice;
			}
			
			float promedio2 = suma / calificaciones.length;
			System.out.println("El promedio es de " + promedio2);
	
			System.out.println("-----------------------For each-----------------------");
			
			int valores [] = new int[10];
			for(int indice = 0; indice < valores.length; indice ++) {
				valores [indice] = indice;
			}
			for(int valor1 : valores) {
				System.out.println(valor1);
			}
			
			System.out.println("-----------------------Matrices-----------------------");
			
			int matriz [][] = new int [4][3]; // 4 filas y 3 columnas
			matriz[0][0] = 1; //primer corchete x, segundo corchete y
			matriz[0][1] = 2;
			matriz[0][2] = 3;
			
			matriz[1][0] = 1;
			matriz[1][1] = 2;
			matriz[1][2] = 3;
			
			matriz[2][0] = 1;
			matriz[2][1] = 2;
			matriz[2][2] = 3;
			
			matriz[3][0] = 1;
			matriz[3][1] = 2;
			matriz[3][2] = 3;
			
			System.out.println(matriz[0][0]);
		
			for(int posX = 0; posX < matriz.length; posX++) {
				for(int posY = 0; posY < matriz[posX].length; posY++) {
					matriz[posX][posY] = posY + 1;
				}
			} //Obtendremos los valores en Y
			
			for(int posX = 0; posX < matriz.length; posX++) {
				for(int posY = 0; posY < matriz[posX].length; posY++) {
					System.out.println(matriz[posX][posY]);
				}
			} //Obtendremos los valores de la matriz
			
			System.out.println("-----------------------Refactor-----------------------");

			for(int[] fila : matriz) {
				for(int celda : fila) {
					System.out.println(celda);
				}
			}
			
			System.out.println("-----------------------Arreglo-----------------------");
			
			int calificacionesVarias [][] = new int [5][3];
			
			calificacionesVarias[0] = new int[1];
			calificacionesVarias[1] = new int[2];
			calificacionesVarias[2] = new int[3];
			calificacionesVarias[3] = new int[4];
			calificacionesVarias[4] = new int[5];
			
			calificacionesVarias [0][0] = 8;
			
			calificacionesVarias [1][0] = 9;
			calificacionesVarias [1][1] = 10;
			
			calificacionesVarias [2][0] = 10;
			calificacionesVarias [2][1] = 10;
			calificacionesVarias [2][2] = 10;
			
			calificacionesVarias [3][0] = 10;
			calificacionesVarias [3][1] = 10;
			calificacionesVarias [3][2] = 10;
			calificacionesVarias [3][3] = 10;

			calificacionesVarias [4][0] = 9;
			calificacionesVarias [4][1] = 9;
			calificacionesVarias [4][2] = 10;
			calificacionesVarias [4][3] = 10;
			calificacionesVarias [4][4] = 10;
			
			for(int [] calificacionesPorAlumno : calificacionesVarias ) {
				for(int calificacion : calificacionesPorAlumno) {
					System.out.print(calificacion + " " );
				}
				System.out.println(" ");
			}
			
	}

}
