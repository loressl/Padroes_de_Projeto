package Abstracty_Factory.Udemy.factory;

import Abstracty_Factory.Udemy.products.FoodMenu;
import Abstracty_Factory.Udemy.products.Furniture;
import Abstracty_Factory.Udemy.products.KFCFoodMenu;
import Abstracty_Factory.Udemy.products.KFCFurniture;

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
