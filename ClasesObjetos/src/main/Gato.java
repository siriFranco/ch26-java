package main;

public class Gato extends Mascota {
	
	/*
	public Gato(String nombre, String raza, int edad){
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}*/ 
	
	@Override //para indicar sobreescritura
	public void dormir() {
		super.dormir(); //Super = clase padre
		System.out.println("El gato duerme!"); //sobreescritura de métodos, tomado de Mascota
	}
	
}
