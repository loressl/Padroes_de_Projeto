package Decorator.Use_a_Cabeca.classes;

import Decorator.Use_a_Cabeca.interfaces.Beverage;

public class Decaf extends Beverage{

	public Decaf() {
		this.setDescription("Decaf Coffee");
	}
	
	@Override
	public double cost() {
		return 1.05;
	}

}
