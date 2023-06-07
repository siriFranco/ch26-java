package org.generation;

public class Pokemon {
	// atributos de instancia (non-static-fields)
	String nombre;
	int alturaCm;
	double pesoKg;
	
	// atributos de clase (static-fields)
	static String nacimiento = "Ovíparos";
	
	//métodos constructores	
	//	Debe tener el mismo nombre de mi clase
	//	Los métodos constructores no tienen retorno
	Pokemon(String nombrePokemon, int alturaCmPk, double pesoKgPk){
		System.out.println("Has creado un Pokemon " + nombrePokemon);
		nombre = nombrePokemon;
		alturaCm = alturaCmPk;
		pesoKg = pesoKgPk;
	}
	
	// métodos de instancia
	
	// métodos de clase
}
