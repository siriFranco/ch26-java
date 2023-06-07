package com.mundoanimal;

public abstract class Canine extends Animal {

	public Canine(String name) {
		super(name); //inicializando el constructor de mi clase up
	}
	
	@Override
	public String eat(String food) {
		return "El canino" + super.getName() + " come " + food ; //inicializando el constructor de mi clase up
	}
	
	public String eat(String food, double kg) {
		return "El canino" + super.getName() + " come " + kg + "kg. de" + food ; //inicializando el constructor de mi clase up
	}
	
	
	public String showPicture() {
		
	}
	
}
