package com.codigofacilito.cursos;
import javax.swing.JOptionPane;

public class MainJavax {

	public static void main(String[] args) {
		
		String nombre = JOptionPane.showInputDialog(null, "¿Cuál es tu nombre?");
		int edad = Integer.parseInt(
				JOptionPane.showInputDialog(null, "¿Cuál es tu edad?"));
				
		String mensaje = "Hola " + nombre + " con una edad de " + edad;
		
		JOptionPane.showMessageDialog(null, mensaje);
		
		
		
		//System.out.println(nombre);
		//System.out.println(edad);
		
		
		
	}

}
