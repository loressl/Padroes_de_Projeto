package Prototype.Brizeno_Modificado;

import Prototype.Brizeno_Modificado.CarPrototype.FiestaPrototype;
import Prototype.Brizeno_Modificado.CarPrototype.GolPrototype;
import Prototype.Brizeno_Modificado.CarPrototype.PalioPrototype;
import Prototype.Brizeno_Modificado.prototype.FactoryConfigurable;

public class Teste {

	public static void main(String[] args) {
		FactoryConfigurable factory = new FactoryConfigurable();
		
		System.out.println("Registering prototypes...");
		factory.registerPrototype("Palio 8", new PalioPrototype("Palio 8", 21000.00) );
		factory.registerPrototype("Gol 1", new GolPrototype("Gol 1", 40000.00));
		factory.registerPrototype("Fiesta 3", new FiestaPrototype("Fiesta 3", 55000.00));
		
		System.out.println("Creating prototypes...");
		PalioPrototype palioPrototype = (PalioPrototype) factory.create("Palio 8");
		GolPrototype golPrototype = (GolPrototype) factory.create("Gol 1");
		FiestaPrototype fiestaPrototype = (FiestaPrototype) factory.create("Fiesta 3");
		
		System.out.println("***************************************");
		System.out.println("Showing prototypes....");
		System.out.println(palioPrototype.show());
		System.out.println(golPrototype.show());
		System.out.println(fiestaPrototype.show());
		
		System.out.println("Unregistering prototypes...");
		System.out.println(factory.unregisterPrototype("Palio 8"));
		System.out.println(factory.unregisterPrototype("Fiesta 3"));
		System.out.println(factory.unregisterPrototype("Bela"));
		
		System.out.println("Clear prototypes...");
		System.out.println(factory.clear());

	}

}
