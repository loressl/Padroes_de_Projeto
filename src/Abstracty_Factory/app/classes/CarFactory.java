package Abstracty_Factory.app.classes;

import Abstracty_Factory.app.Interfaces.Engine;
import Abstracty_Factory.app.Interfaces.Tyre;

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
