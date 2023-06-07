package org.generation;

import java.util.Date;

public class OperacionesMath {	
	
	// atributos.
	// atributos de instancia (non-static fields)
	// atributos de clase ( static fields)
	
	//hay que indicar si tiene retorno ó no, con void
	void sumaEnterosSinRetorno(int a, int b){
		Date date = new Date(); // instancionando un objeto de tipo Date, importarlo
		System.out.printf("%tT %d + %d = %d %n", date, a, b, a+b );
	}
	
	int sumaEnteros (int a, int b) {
		return a + b ;
	}
	
	double sumaFlotantes ( double a, double b ) {
		return a + b ;
	}
	
	// sobrecarga de métodos overload
	// funciones con el mismo nombre pero con diferentes parámetros
	
	int suma (int a, int b) {
		return a + b ;
	}
	
	int suma (short a, short b) {
		return a + b ;
	}
	
	double suma (double dataA, double dataB) {
		return dataA + dataB ;
	}
	
	double suma (double dataA, double dataB, boolean redondear) {
		if (redondear)
		return  Math.round(dataA + dataB) ;
		return dataA + dataB;
	}
	
	// estos de aquí están de más, porque el double está arriba
	/*
	double suma (int a, double b) {
		return a + b ;
	}
	
	double suma (double a, int b) {
		return a + b ;
	}
	*/
	
	// esto no es posible, se repite los parámetros
	// float suma (double dataA, int dataB) {
	//	return a + b ;
	//}
	
	double squareRoot( double a) {
		return Math.sqrt(a);
	}
	
	/*
	 * Obtener la raiz cuadrada de un número 
	 * @param a valor a obtener la raíz cuadrada
	 * @return raíz cuadrada redondeada
	 */	
	
	int squareRoot (int a) {
		return (int)(Math.round(Math.sqrt(a)));
	}
	
	// Métodos estáticos (Static Method) 
	/* Se asocian a la clase, en lugar de la instancia, se pueden invocar sin 
	 * instanciar un objeto.
	 */
	
	static double valorPi() {
		return Math.PI;			
		}
	
	static double piPorNumero ( int numero ) {
		return numero * valorPi();
	}
	
	
}
