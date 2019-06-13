package Factory_Method.Pizza;

import Factory_Method.Pizza.classes.Pizza;
import Factory_Method.Pizza.factory.ChicagoStylePizzaStore;
import Factory_Method.Pizza.factory.NYStylePizzaStore;
import Factory_Method.Pizza.factory.PizzaStore;

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
