package com.codigofacilito.main;
import java.util.Scanner;
import com.codigofacilito.cursos.*;


public class Main {

	public static void main(String[] args) {
		

		Java java = new Java();
		System.out.println( java.getTitulo());
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuál es tu nombre?");		
		String nombre = sc.nextLine();
		
		System.out.println("¿Cuál es tu edad?");		
		//int edad = Integer.parseInt(sc.nextLine());
		int edad = sc.nextInt(); //opción más corta
		
		System.out.println("¿Cuál es tu altura?");		
		float altura = sc.nextFloat();
		
		sc.nextLine(); // Captura el salto de nextFloat
		
		System.out.println("¿El curso es de tu agrado? (si/no)");		
		// boolean valor = sc.nextBoolean(); //arrojará error si no se da respuesta concreta boolean
		boolean valor = sc.nextLine().equals("si"); 
		
		System.out.println("Hola " + nombre + " de " + edad + " de " + altura);
		
		sc.close();
		
		
		
	}

}
