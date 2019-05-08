package Abstracty_Factory.classes;

import Abstracty_Factory.Interfaces.Engine;

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
