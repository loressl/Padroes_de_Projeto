package Abstracty_Factory.classes;

import Abstracty_Factory.Interfaces.Engine;
import Abstracty_Factory.Interfaces.Tyre;

public abstract class Factory {
	
	//Singleton factory objets
	private static Factory carFactory = null;
	private static Factory truckFactory = null;
	
	public abstract Engine getEngine();
	
	public abstract Tyre geTyre();
	
	/**
	 * 
	 * Este é o método factory exposto para o cliente
	 * O cliente faz a requisição da instance passando um tipo
	 * O cliente não precisa saber sobre o que e como
	 * o objeto é criado internamente
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
