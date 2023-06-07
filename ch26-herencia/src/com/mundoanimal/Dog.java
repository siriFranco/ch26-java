package com.mundoanimal;

public class Dog extends Canine {

	public Dog(String name) {
		super(name);
	}
	
	@Override
	public String showPicture() {
		return "http://" + super.getName()+ ".com";
	}
	
	@Override
	public String eat(String food) {
		return "http://" + super.getName()+ ".com";
	}
	
}
