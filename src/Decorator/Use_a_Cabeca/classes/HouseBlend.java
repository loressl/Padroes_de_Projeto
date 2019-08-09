package Decorator.Use_a_Cabeca.classes;

import Decorator.Use_a_Cabeca.interfaces.Beverage;

public class HouseBlend extends Beverage{
	
	public HouseBlend() {
		this.setDescription("House Blend Coffee");
	}

	@Override
	public double cost() {
		return 0.89;
	}

}
