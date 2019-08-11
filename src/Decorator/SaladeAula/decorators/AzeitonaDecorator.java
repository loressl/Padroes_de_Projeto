package Decorator.SaladeAula.decorators;

import Decorator.SaladeAula.interfaces.Pizza;
import Decorator.SaladeAula.interfaces.PizzaDecorator;

public class AzeitonaDecorator extends PizzaDecorator{
	
	public AzeitonaDecorator(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public void montar() {
		super.montar();
		System.out.println(" + azeitona");
	}
}
