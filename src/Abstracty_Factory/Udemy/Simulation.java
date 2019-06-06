package Abstracty_Factory.Udemy;

import Abstracty_Factory.Udemy.client.Customer;
import Abstracty_Factory.Udemy.client.RestaurantWithAbstractFactory;
import Abstracty_Factory.Udemy.factory.DominosFoodChainFactory;
import Abstracty_Factory.Udemy.factory.KFCStyleFoodChain;

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
