package Abstracty_Factory.classes;

import Abstracty_Factory.Interfaces.Engine;
import Abstracty_Factory.Interfaces.Tyre;

public class CarFactory extends Factory{

	@Override
	public Engine getEngine() {
		return new CarEngine();
	}

	@Override
	public Tyre geTyre() {
		return new CarTyre();
	}

}
