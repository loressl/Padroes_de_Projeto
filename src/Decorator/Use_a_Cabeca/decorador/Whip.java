package Decorator.Use_a_Cabeca.decorador;

import Decorator.Use_a_Cabeca.Beverage;

public class Whip extends CondimentDecorator{

	//referente ao caf�
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public double cost() {
		return 0.10 + beverage.cost();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Creme";
	}

}
