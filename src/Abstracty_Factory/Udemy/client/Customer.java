package Abstracty_Factory.Udemy.client;

public class Customer {

	private RestaurantWithAbstractFactory restaurant;
	
	public Customer(RestaurantWithAbstractFactory rFactory) {
		this.restaurant = rFactory;
	}
	
	public void visitRestaurant() {
		this.restaurant.renderShop();
		this.restaurant.getMenu().render();;
		this.restaurant.getFurniture().use();
	}
	
	public void setRestaurant(RestaurantWithAbstractFactory rFactory) {
		this.restaurant = rFactory;
	}
}
