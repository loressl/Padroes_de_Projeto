package Abstracty_Factory.Udemy.client;

import Abstracty_Factory.Udemy.factory.FoodChainFactory;
import Abstracty_Factory.Udemy.products.FoodMenu;
import Abstracty_Factory.Udemy.products.Furniture;

public class RestaurantWithAbstractFactory {
	
	private FoodMenu menu;
	private Furniture furniture;
	
	public RestaurantWithAbstractFactory(FoodChainFactory foodChainFactory) {
		this.menu = foodChainFactory.createFoodMenu();
		this.furniture = foodChainFactory.createFurniture();
	}

	public FoodMenu getMenu() {
		return this.menu;
	}

	public Furniture getFurniture() {
		return this.furniture;
	}
	
	public void renderShop() {
		this.menu.render();
		this.furniture.use();
	}
}
