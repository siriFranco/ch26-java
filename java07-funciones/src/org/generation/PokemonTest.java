package org.generation;

public class PokemonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Los Pokemon son " + Pokemon.nacimiento);
		
		
		Pokemon pikachu = new Pokemon("Pikachu", 41, 6); //los paréntesis invocan un método
		Pokemon vamoACalmarnos = new Pokemon("Pikachu de agua", 50, 9);
		
		System.out.println(pikachu.nombre);
		System.out.println(vamoACalmarnos.nombre);
	}

}
