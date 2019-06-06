package Abstracty_Factory.app.classes;

import Abstracty_Factory.app.Interfaces.Engine;

public class TruckEngine implements Engine{

	@Override
	public void design() {
		System.out.println("Designing Truck Engine");
		
	}

	@Override
	public void manufacture() {
		System.out.println("Manufacturing Truck Engine");
		
	}

	@Override
	public void test() {
		System.out.println("Testining Truck Engine");
		
	}

}
