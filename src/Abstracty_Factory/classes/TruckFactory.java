package Abstracty_Factory.classes;

import Abstracty_Factory.Interfaces.Engine;
import Abstracty_Factory.Interfaces.Tyre;

public class TruckFactory extends Factory{

	@Override
	public Engine getEngine() {
		return new TruckEngine();
	}

	@Override
	public Tyre geTyre() {
		return new TruckTyre();
	}

}
