package Factory_Method.Pizza.classes;

public class ChicagoStyleCheese extends Pizza{

	public ChicagoStyleCheese() {
		name = "Chicago Style Deep Dish and Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
