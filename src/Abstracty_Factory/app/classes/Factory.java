package Abstracty_Factory.app.classes;

import Abstracty_Factory.app.Interfaces.Engine;
import Abstracty_Factory.app.Interfaces.Tyre;

public abstract class Factory {
	
	//Singleton factory objets
	private static Factory carFactory = null;
	private static Factory truckFactory = null;
	
	public abstract Engine getEngine();
	
	public abstract Tyre geTyre();
	
	/**
	 * 
	 * Este � o m�todo factory exposto para o cliente
	 * O cliente faz a requisi��o da instance passando um tipo
	 * O cliente n�o precisa saber sobre o que e como
	 * o objeto � criado internamente
	 * @return
	 */
	public static Factory getFactory(String vehicleType) {
		
		if(vehicleType == null)
			return null;
		
		Factory factory = null;
		switch (vehicleType) {
		case "car":
			if(carFactory == null)
				carFactory = new CarFactory();
			factory= carFactory;
			break;
		case "truck":
			if(truckFactory == null)
				truckFactory = new TruckFactory();
			factory = truckFactory;
			break;
		default:
			throw new UnkownVehicleException();
		}
		
		return factory;
	}
}
