package Decorator.SaladeAula.decorators;

import Decorator.SaladeAula.interfaces.Pizza;
import Decorator.SaladeAula.interfaces.PizzaDecorator;

public class FrangoDecorator extends PizzaDecorator{

	public FrangoDecorator(Pizza pizza) {
		super(pizza);
	}

	@Override
	public void montar() {
		super.montar();
		System.out.println(" + frango");
	}
}
