package main;

public class Mascota {

	String nombre;
	String raza;
	int edad;
	
	public void dormir() {
		System.out.println("La mascota duerme");
		// void no retorna un valor
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Constructor
	public Mascota() {
		
	}
	
	public Mascota(String nombre, String raza, int edad){
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}
	
}
