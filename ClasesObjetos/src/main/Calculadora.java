package main;

public class Calculadora {
	
	public int suma(int... numeros ) { // recibe n cantidad de números int
		int suma = 0;
		
		System.out.println(numeros.length);
		
		for(int numero : numeros)
			suma += numero;
			return suma;
	}
	
	public float suma(float... numeros ) { // recibe n cantidad de números int
		int suma = 0;
		
		System.out.println(numeros.length);
		
		for(double numero : numeros)
			suma += numero;
			return suma;
	}
	
	//sumar enteros
	public int suma(int valor1, int valor2) {
		return valor1 + valor2;
	}
	
	
	//sumar flotantes
	public int suma(int valor1, int valor2, int valor3) {
		return valor1 + valor2 + valor3;
	}
	
	public int suma() {
		return 0;
	}
	
	//sumar doubles
		public double suma(double valor1, double valor2) {
			return valor1 + valor2;
		}
	
	
}
