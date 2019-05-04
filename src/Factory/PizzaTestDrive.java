package Factory;

import Factory.classes.Pizza.ChicagoStylePizzaStore;
import Factory.classes.Pizza.NYStylePizzaStore;
import Factory.classes.Pizza.Pizza;
import Factory.classes.Pizza.PizzaStore;

public class PizzaTestDrive {
	
	public static void main(String[] args) {
		PizzaStore nyStore = new NYStylePizzaStore();
		PizzaStore chicagoStore = new ChicagoStylePizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
		
	}
}
