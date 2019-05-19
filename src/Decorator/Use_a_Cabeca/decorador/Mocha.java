package Decorator.Use_a_Cabeca.decorador;

import Decorator.Use_a_Cabeca.Beverage;

public class Mocha extends CondimentDecorator{

	//referente ao café
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public double cost() {
		return 0.20 + beverage.cost();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Moca";
	}

}
