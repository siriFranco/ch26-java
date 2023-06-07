package main;

public class Perro extends Mascota {
	
	/* String nombre;
	String raza;
	int edad;
	//Códgio repetido, se enviará a Mascota
	*/
	
	//Parámetros
	
	/* void establecerAtributos(String nombrePerro, String razaPerro, int edadPerro )  { //parámetro dentro de paréntesis
		nombre = nombrePerro;
		raza = razaPerro;
		edad = edadPerro;
	} 
	//se puede eliminar la palabra perro, porque se deduce, ya que estamos en la clase "Perro"
	//en ese caso, usamos this, lo hace más legible
	
	void establecerAtributos(String nombre, String raza, int edad )  { //parámetro dentro de paréntesis
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}
	
	
	void comer() {
		System.out.println("El perro se encuentra comiendo");
		// void no retorna un valor
	}
	
	void dormir() {
		System.out.println("La mascota duerme");
		// void no retorna un valor
	}
	
	void ladrar() {
		System.out.println("El perro se encuentra ladrando");
		// void no retorna un valor
	}
	
	
	public Perro(String nombre, String raza, int edad){
		super(nombre, raza, edad);
	}
	*/ 
	
	@Override //para indicar sobreescritura
	public void dormir() {
		super.dormir(); //Super = clase padre
		System.out.println("El perro duerme!"); //sobreescritura de métodos, tomado de Mascota
	}
	
	
	
	
	
	
	
}
