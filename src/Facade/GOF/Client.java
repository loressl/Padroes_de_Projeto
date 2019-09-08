package Facade.GOF;

import Facade.GOF.facade.WeddingPlanner;

public class Client {

	public static void main(String[] args) {
		WeddingPlanner planner = new WeddingPlanner();
		planner.organize();
	}

}
