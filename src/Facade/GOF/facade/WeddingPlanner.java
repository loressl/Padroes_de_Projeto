package Facade.GOF.facade;

import Facade.GOF.classes.Hall;
import Facade.GOF.classes.Photographer;
import Facade.GOF.classes.Restaurant;
import Facade.GOF.classes.Vehicle;

public class WeddingPlanner {
	
	public WeddingPlanner() {
		hall = new Hall();
		photographer = new Photographer();
		restaurant = new Restaurant();
		vehicle = new Vehicle();
	}
	
	/*Simplified interface exposed to the client*/
	public void organize() {
		hall.book();
		restaurant.placeOrder();
		photographer.book();
		vehicle.reserve();
	}
	
	
	/*Facade class to hide the complexity*/
	private Hall hall;
	private Restaurant restaurant;
	private Photographer photographer;
	private Vehicle vehicle;
}
