package Abstracty_Factory.classes;

import Abstracty_Factory.Interfaces.Tyre;

public class TruckTyre implements Tyre{

	@Override
	public void design() {
		System.out.println("Designing Truck Tyre");
		
	}

	@Override
	public void manufacture() {
		System.out.println("Manufacturing Truck Tyre");
		
	}

}
