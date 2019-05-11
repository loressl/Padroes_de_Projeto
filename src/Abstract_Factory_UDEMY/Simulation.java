package Abstract_Factory_UDEMY;

import Abstract_Factory_UDEMY.client.Customer;
import Abstract_Factory_UDEMY.client.RestaurantWithAbstractFactory;
import Abstract_Factory_UDEMY.factory.DominosFoodChainFactory;
import Abstract_Factory_UDEMY.factory.KFCStyleFoodChain;

public class Simulation {

	public static void main(String[] args) {
		RestaurantWithAbstractFactory dominosChain= new RestaurantWithAbstractFactory(new DominosFoodChainFactory());
		Customer customer = new Customer(dominosChain);
		customer.visitRestaurant();
		
		System.out.println();
		
		RestaurantWithAbstractFactory kfcChain= new RestaurantWithAbstractFactory(new KFCStyleFoodChain());
		customer.setRestaurant(kfcChain);
		customer.visitRestaurant();

	}

}
