package Decorator.Use_a_Cabeca.classes;

import Decorator.Use_a_Cabeca.interfaces.Beverage;

public class Espresso extends Beverage{
	
	public Espresso() {
		this.setDescription("Expresso");
	}
	
	@Override
	public double cost() {
		return 1.99;
	}

}
