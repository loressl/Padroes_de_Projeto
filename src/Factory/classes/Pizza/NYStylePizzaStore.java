package Factory.classes.Pizza;

public class NYStylePizzaStore extends PizzaStore{
	
	public NYStylePizzaStore() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("cheese"))
			pizza = new NYStyleCheesePizza();
		else if(type.equals("pepperoni"))
			pizza = new PepperoniPizza();
		else if(type.equals("glam"))
			pizza = new GlamPizza();
		else if(type.equals("veggie"))
			pizza = new VeggiePizza();
		
		return pizza;
	}

}
