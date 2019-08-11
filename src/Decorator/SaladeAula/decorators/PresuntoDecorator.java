package Decorator.SaladeAula.decorators;

import Decorator.SaladeAula.interfaces.Pizza;
import Decorator.SaladeAula.interfaces.PizzaDecorator;

public class PresuntoDecorator extends PizzaDecorator{

	public PresuntoDecorator(Pizza pizza) {
		super(pizza);
	}

	@Override
	public void montar() {
		super.montar();
		System.out.println(" + presunto");
	}
}
