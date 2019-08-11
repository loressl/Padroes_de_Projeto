package Decorator.Use_a_Cabeca;

import Decorator.Use_a_Cabeca.classes.DarkRoast;
import Decorator.Use_a_Cabeca.classes.Espresso;
import Decorator.Use_a_Cabeca.classes.HouseBlend;
import Decorator.Use_a_Cabeca.decorador.Mocha;
import Decorator.Use_a_Cabeca.decorador.Soy;
import Decorator.Use_a_Cabeca.decorador.Whip;
import Decorator.Use_a_Cabeca.interfaces.Beverage;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(new Mocha(new Whip(beverage2)));
//		beverage2 = new Mocha(beverage2);
//		beverage2 = new Mocha(beverage2);
//		beverage2 = new Whip(beverage2);
		
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
		Beverage beverage3 = new Soy(new Mocha(new Whip(new HouseBlend())));
//		beverage3 = new Mocha(beverage3);
//		beverage3 = new Whip(beverage3);
		
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

	}

}
