package Abstract_Factory_UDEMY.client;

import Abstract_Factory_UDEMY.factory.FoodChainFactory;
import Abstract_Factory_UDEMY.products.FoodMenu;
import Abstract_Factory_UDEMY.products.Furniture;

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
