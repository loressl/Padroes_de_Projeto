package Factory.classes.Pizza;
/**
 * 
 * Como se fosse a factory método e pode ser extendida para as outras
 * e as outras implementar como deve seguir o fluxo
 */
public abstract class PizzaStore {
	
//	SimplePizzaFactory factory;
//	
//	public PizzaStore(SimplePizzaFactory factory) {
//		this.factory = factory;
//	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		pizza = this.createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	public abstract Pizza createPizza(String type);
}
