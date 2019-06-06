package Abstracty_Factory.app.classes;

import Abstracty_Factory.app.Interfaces.Engine;
import Abstracty_Factory.app.Interfaces.Tyre;

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
