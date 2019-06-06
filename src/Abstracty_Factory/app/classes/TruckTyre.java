package Abstracty_Factory.app.classes;

import Abstracty_Factory.app.Interfaces.Tyre;

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
