package com.mundoanimal;

public class Animal {
	private String name= "---";
	private String type= "---";
	double sizeM;
	double weightKg;
	boolean Alive;
	
	public Animal() {
		
	}
	
	public Animal(String name) {
			this.name = name;
		}
	
	public String makeNoise()
	
	public String eat (String food) {
		return this.name + " esta comiendo " + food;
	}
	
	public String sleep(int minutes) {
		return this.name + " duerme " + minutes + "minutos" ;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public double getSizeM() {
		return sizeM;
	}
	
	public void setSizeM(double sizeM) {
		this.sizeM = sizeM;
	}
	
	public double getWeightKg() {
		return weightKg;
	}
	
	public void setWeightKg(double weightKg) {
		this.weightKg = weightKg;
	}
	
	public boolean isAlive() {
		return Alive;
	}
	
	public void setAlive(boolean alive) {
		Alive = alive;
	}

}
