package Abstracty_Factory.Udemy.factory;

import Abstracty_Factory.Udemy.products.FoodMenu;
import Abstracty_Factory.Udemy.products.Furniture;

public interface FoodChainFactory {

	public FoodMenu createFoodMenu();
	
	public Furniture createFurniture();
}
