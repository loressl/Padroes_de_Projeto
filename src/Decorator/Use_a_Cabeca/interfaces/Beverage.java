package Decorator.Use_a_Cabeca.interfaces;

public abstract class Beverage {
	
	private String description= "Unknown Beverage";

	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public abstract double cost();
}
