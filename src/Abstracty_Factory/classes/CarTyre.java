package Abstracty_Factory.classes;

import Abstracty_Factory.Interfaces.Tyre;

public class CarTyre implements Tyre{

	@Override
	public void design() {
		System.out.println("Designing Car Tyre");
		
	}

	@Override
	public void manufacture() {
		System.out.println("Manufacturing Car Tyre");
		
	}

}
