package Decorator.Use_a_Cabeca.decorador;

import Decorator.Use_a_Cabeca.Beverage;

public class Soy extends CondimentDecorator{

	//referente ao café
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public double cost() {
		return 0.15 + beverage.cost();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+ ", Soja";
	}

}
