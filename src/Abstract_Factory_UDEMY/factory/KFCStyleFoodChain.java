package Abstract_Factory_UDEMY.factory;

import Abstract_Factory_UDEMY.products.FoodMenu;
import Abstract_Factory_UDEMY.products.Furniture;
import Abstract_Factory_UDEMY.products.KFCFoodMenu;
import Abstract_Factory_UDEMY.products.KFCFurniture;

public class KFCStyleFoodChain implements FoodChainFactory{

	@Override
	public FoodMenu createFoodMenu() {
		return new KFCFoodMenu("KFC style FoodMenu");
	}

	@Override
	public Furniture createFurniture() {
		return new KFCFurniture("KFC style Furniture");
	}

}
