package Decorator.Use_a_Cabeca.classes;

import Decorator.Use_a_Cabeca.interfaces.Beverage;

public class DarkRoast extends Beverage{
	
	public DarkRoast() {
		this.setDescription("Most Excellent Dark Roast");
	}
	
	@Override
	public double cost() {
		return 0.99;
	}

}
