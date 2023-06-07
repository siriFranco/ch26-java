package org.generation;

public class OperacionesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Java 07 Funciones");
		
		OperacionesMath operaciones;
		operaciones = new OperacionesMath();
		
		operaciones.sumaEnterosSinRetorno(35, 5); //40 
		//esto no se guarda porque es de tipo void
		
		int resultadoSuma = operaciones.sumaEnteros(10, 9);
		System.out.println( resultadoSuma );
		System.out.println( operaciones.sumaEnteros(4, 5) );
		
		System.out.println(operaciones.sumaFlotantes(4.5, 5.5));
		System.out.println(operaciones.sumaFlotantes(4.01, 5.02));
		
		System.out.println(operaciones.suma(3, 3));
		System.out.println(operaciones.suma(3.5, 3.4));
		System.out.println(operaciones.suma(3.5, 3.4, true));
		
		System.out.println(operaciones.squareRoot(9));
		System.out.println(operaciones.squareRoot(9.0));
		
		//Usar método estático
		// System.out.println( operaciones.valorPi() ); 
		//esto funciona pero debe llamarse de otra forma
		System.out.println( OperacionesMath.valorPi() );
		// A partir de la clase, usar el método estático, esta es la
		// forma correcta
		System.out.println( OperacionesMath.piPorNumero(3) );
	}

}
