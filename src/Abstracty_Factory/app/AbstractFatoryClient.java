package Abstracty_Factory.app;

import java.util.Scanner;

import Abstracty_Factory.app.Interfaces.Engine;
import Abstracty_Factory.app.Interfaces.Tyre;
import Abstracty_Factory.app.classes.Factory;
import Abstracty_Factory.app.classes.UnkownVehicleException;

public class AbstractFatoryClient {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String vehicleType= in.nextLine().toLowerCase();
		
		//Get the factory instance
		Factory factory;
		try {
			factory = Factory.getFactory(vehicleType);
			
			//Get the engine from the factory
			Engine engine = factory.getEngine();
			engine.design();
			engine.manufacture();
			engine.test();
			
			//Get the tyre from the factory
			Tyre tyre = factory.geTyre();
			tyre.design();
			tyre.manufacture();
			
		}catch (UnkownVehicleException e) {
			System.out.println("Invalid vehicle type entered!");
		}
		
		in.close();

	}

}
