package org.generation;

import java.util.ArrayList;

public class ArrayListConceptos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * Una colección List es una colección ORDENADA, en la que
		 * se permiten elementos duplicados.
		 * 
		 * Se basa en un array redimensionable que crece su tamaño,
		 * según crece la colección de elementos.
		 * 
		 * Esta colección es la que mejor rendimiento tiene. 
		 * 
		 * Sintaxis: 
		 * ArrayList <object> varName;
		 */
		
		// Definir una coleccion de datos numericos
		int edad = 17;
		Integer age = 17;
		
		// ArrayList <int> calificaciones; Esto no se puede realizar
		ArrayList <Integer> calificaciones;
		
		//Definir una coleccion de Strings
		ArrayList <String> nombreLibros;
		nombreLibros = new ArrayList<>();
		
		// Agregar datos al ArrayList con el metodo add()
		// El primer elemento es el indice 0
		nombreLibros.add("Caperucita Roja");
		nombreLibros.add("Harry Potter");
		nombreLibros.add("Hansel y Gretel");
		nombreLibros.add("Libro Vaquero"); // indice 3
		nombreLibros.add("El Hobbit");
		// Se permite elementos duplicados
		nombreLibros.add("Libro Vaquero"); // indice 5
		
		// Obtener el tamano de la coleccion, size()
		int sizeArrayList = nombreLibros.size();
		System.out.println("Numero de elementos" + sizeArrayList );
		
		System.out.println( nombreLibros );
		
		// Mostrar un elemento en particular
		// Indicamos el numero del indice usando método get.
		System.out.println( "David recomienda " + nombreLibros.get(3) );
		
		// Remover un elemento de la colección
				// Indicamos el numero del indice usando método remove.
				System.out.println( "Elemento removido " + nombreLibros.remove(0) );
				
		System.out.println( nombreLibros );
		
		System.out.println( "Está Harry Potter..." + nombreLibros.contains("Harry Potter") );
		System.out.println( "Está Quihubole con..." + nombreLibros.contains("Quihubole") );
		
		// Iteramos una colección ArrayList
		// for loop
		
		for (int i = 0; i < nombreLibros.size() ; i++ ) {
			System.out.println("Libro " + nombreLibros.get(i) );
		}
		
		// for each loop
		for (String libro : nombreLibros ) {
			System.out.println("Libro a leer " + libro);
		}
		
		// for each de la coleccion
		nombreLibros.forEach( libro -> System.out.println(libro) );
		
		// Si se usa el metodo get en un indice existente, lo reemplaza
		nombreLibros.set(1, "Clean code"); // reemplazó Hansel y Gretel por Clean Code
		System.out.println( nombreLibros );
		ArrayList< String > books = nombreLibros;
	}

}
