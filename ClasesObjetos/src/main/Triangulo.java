package main;

public class Triangulo extends Figura {

	/*
	float base;
	float altura;
	
	float areaAntes() {
		// float area = (this.base * this.altura) /2;
		// return area;
		return (this.base * this.altura) /2; //opción más limpia
	}
	*/
	
	private float base;
	private float altura;
	
	public Triangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public float area() {
		return(base * altura)/ 2;
	}
	
	
	
	
	
}
