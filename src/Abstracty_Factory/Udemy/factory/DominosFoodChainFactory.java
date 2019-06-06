package Abstracty_Factory.Udemy.factory;

import Abstracty_Factory.Udemy.products.DominosFoodMenu;
import Abstracty_Factory.Udemy.products.DominosFurniture;
import Abstracty_Factory.Udemy.products.FoodMenu;
import Abstracty_Factory.Udemy.products.Furniture;

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
