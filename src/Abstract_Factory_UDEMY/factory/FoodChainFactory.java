package Abstract_Factory_UDEMY.factory;

import Abstract_Factory_UDEMY.products.FoodMenu;
import Abstract_Factory_UDEMY.products.Furniture;

public interface FoodChainFactory {

	public FoodMenu createFoodMenu();
	
	public Furniture createFurniture();
}
