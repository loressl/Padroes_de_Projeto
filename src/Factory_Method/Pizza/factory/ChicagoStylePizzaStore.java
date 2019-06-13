package Factory_Method.Pizza.factory;

import Factory_Method.Pizza.classes.ChicagoStyleCheese;
import Factory_Method.Pizza.classes.GlamPizza;
import Factory_Method.Pizza.classes.PepperoniPizza;
import Factory_Method.Pizza.classes.Pizza;
import Factory_Method.Pizza.classes.VeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore{
	
	public ChicagoStylePizzaStore() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("cheese"))
			pizza = new ChicagoStyleCheese();
		else if(type.equals("pepperoni"))
			pizza = new PepperoniPizza();
		else if(type.equals("glam"))
			pizza = new GlamPizza();
		else if(type.equals("veggie"))
			pizza = new VeggiePizza();
		
		return pizza;
	}

}
