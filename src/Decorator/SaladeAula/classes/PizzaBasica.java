package Decorator.SaladeAula.classes;

import Decorator.SaladeAula.interfaces.Pizza;

public class PizzaBasica implements Pizza{

	@Override
	public void montar() {
		System.out.println("Pizza");
		
	}

}
