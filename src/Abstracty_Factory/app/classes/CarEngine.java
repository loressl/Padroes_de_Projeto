package Abstracty_Factory.app.classes;

import Abstracty_Factory.app.Interfaces.Engine;

public class CarEngine implements Engine{

	@Override
	public void design() {
		System.out.println("Designing Car Engine");
		
	}

	@Override
	public void manufacture() {
		System.out.println("Manufacturing Car Engine");
		
	}

	@Override
	public void test() {
		System.out.println("Testining Car Engine");
		
	}

}
