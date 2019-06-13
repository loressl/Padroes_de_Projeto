package Factory_Method.Pizza.classes;

public class ChicagoStyleCheesePizza extends Pizza{
	
	public ChicagoStyleCheesePizza() {
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Thinck Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
	}
	
	public void cut() {
		System.out.println("Cutting the piza into square slices");
	}
}
