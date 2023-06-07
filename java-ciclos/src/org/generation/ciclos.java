package org.generation;

public class ciclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * Sintaxis:
		 * 
		 * for (expresion_inicial ; comparacion; expresion_final)
		 * 
		 */
		
		// imprimir 5 veces "hola"
		
		// esto imprimira un solo hola
		for (int i = 1; i<= 5; i++ );
			System.out.println("hola ");
			
		// esto imprimira cinco hola, el punto y coma influye al final de la primer linea
		for (int i = 1; i<= 5; i++ )
			System.out.println("hola ");
		
		// esto imprimira cinco hola, el punto y coma influye al final de la primer linea
		int j;
			for (j = 1; j <= 5; ++j );
			System.out.println("hola " + j);
			
		for (int i = 1; i <= 3; i++) {
			for (int k = 1; k <= 10; k++){
				System.out.println(i + " * " + k + " = " + (i * k) );
				System.out.printf( "Tabla %05d * %2d = %2d 0x%03x %n " , i, k, i*k, i*k );
				// el 05d son 5 digitos para el numero de tabla, 
				//el 2d son dos digitos para k, que seria el acomodo del multiplicante
				//el = 2d es para acomodar el resultado
				// el 0x%03x es para ingresar el formato hexagonal
				//el n es para saltos de linea
				}
		}
		
		int iteraciones = 1;
		for ( ; ; ) {
			if ( iteraciones > 5 ) {
				break;
			}
				System.out.println("Iteracion " + iteraciones ++);
			
		}
		
		outerLoop:
			for (int i = 0; i < 5; i++) {
				for (int l = 0; l < 5; l++) {
					System.out.println(i + "" + l);
					if (i == 2 && l == 2) break outerLoop;					
				}
			}
		
		// Imprimir numeros impares del 1 al 20 (incluyendo)
		// 1, 3, 5, 7, 9, 11
		/*
			for (int i = 0; i < 20; i++) {
					if ( i % 2 == 0 ) 
						continue;
					System.out.println(i);
				}
			}
			*/
		// ------------
	boolean bandera = false;
	if ( bandera= true)
		System.out.println("Banderita, banderita, banderita tricolor");
	// se reasigna el valor de bandera porque se puso = y no ==
		
		
		
	}

}
