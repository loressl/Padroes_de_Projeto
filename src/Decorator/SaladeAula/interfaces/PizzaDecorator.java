package Decorator.SaladeAula.interfaces;

public abstract class PizzaDecorator implements Pizza{
	
	public PizzaDecorator(Pizza pizza) {
		this.setPizzaDecorator(pizza);
	}
	
	public void setPizzaDecorator(Pizza pizza) {
		this.decorator = pizza;
	}
	
	public void montar() {
		this.decorator.montar();
	}
	
	protected Pizza decorator;
}
