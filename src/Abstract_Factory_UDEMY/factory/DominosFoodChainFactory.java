package Abstract_Factory_UDEMY.factory;

import Abstract_Factory_UDEMY.products.DominosFoodMenu;
import Abstract_Factory_UDEMY.products.DominosFurniture;
import Abstract_Factory_UDEMY.products.FoodMenu;
import Abstract_Factory_UDEMY.products.Furniture;

public class DominosFoodChainFactory implements FoodChainFactory{

	@Override
	public FoodMenu createFoodMenu() {
		return new DominosFoodMenu("Dominos Style FoodMenu");
	}

	@Override
	public Furniture createFurniture() {
		return new DominosFurniture("Dominos Style Furniture");
	}

}
