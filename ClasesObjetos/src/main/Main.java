package main;

public class Main {

	public static void main(String[] args) {
		
		/*
		Perro lassie = new Perro(); //Objeto creado (instancia)
		
		lassie.establecerAtributos("Lassie", "Collie", 4); //argumentos
		
		/* con el argumento anterior, se omite lo siguiente
		 * lassie.nombre = "Lassie";
		lassie.raza = "Collie";
		lassie.edad = 4; 
		
		
		System.out.println( "El nombre es " + lassie.nombre );
		System.out.println( "La raza es " + lassie.raza );
		System.out.println( "La edad es " + lassie.edad );
		
		lassie.comer();
		lassie.dormir();
		lassie.ladrar();
		*/
		
		/*
		Triangulo triangulo = new Triangulo();
		triangulo.base = 10;
		triangulo.altura = 20;
		
		float resultado = triangulo.area();
		System.out.println(resultado);
		*/
		
		System.out.println("--------------Modificador de acceso------------------");
				
		/* Usuario codi = new Usuario("Codi", "Pass");
		
		//codi.username = "Codi";
		// codi.password = "pass";
		//codi.setPassword("Pass");
		
		System.out.println(codi.username);
		//System.out.println(codi.password);
		System.out.println(codi.getPassword());
		
		codi.saluda();
		*/ 
		
		Usuario usuario = new Usuario("Codi");
		usuario.establecerRol();
		
		System.out.println("--------------Calculadora------------------");
		
		Calculadora calculadora = new Calculadora();
		
		float resultadoC = calculadora.suma(10, 20, 30, 5, 5, 5, 8);
		System.out.println("El resultado es " + resultadoC);
		
		System.out.println("--------------Herencia------------------");
		
		Gato gato = new Gato();
		Perro perro = new Perro();
		
		gato.dormir();
		perro.dormir();
		
		System.out.println(gato.getNombre());
		System.out.println(perro.getNombre());
		
		System.out.println("--------------Abstracta------------------");
		
		Figura figuras[] = new Figura[2];
		
		//Circulo circulos[];
		//Triangulo triangulos[];
		
		Figura circulo = new Circulo(9f);
		Figura triangulo = new Triangulo(10f, 5f);
		
		figuras[0] = circulo;
		figuras[1] = triangulo;
		
		//System.out.println(circulo.area());
		//System.out.println(triangulo.area());
		
		System.out.println(figuras[0].area());
		System.out.println(figuras[1].area());
		
		System.out.println("-------------Paquetes y API------------------");
		
		System.out.println(Math.PI );
		
		
		
		
		
		
		
	}

}
