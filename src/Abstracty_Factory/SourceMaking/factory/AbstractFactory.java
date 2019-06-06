package Abstracty_Factory.SourceMaking.factory;

import Abstracty_Factory.SourceMaking.Enum.Architecture;
import Abstracty_Factory.SourceMaking.classes.CPU;
import Abstracty_Factory.SourceMaking.classes.MMU;

public abstract class AbstractFactory {
	
	private static final EmberToolkit EMBER_TOOLKIT = new EmberToolkit();
	private static final EnginolaToolkit ENGINOLA_TOOLKIT = new EnginolaToolkit();
	
	public static AbstractFactory getFactory(Architecture architecture) {
		AbstractFactory factory = null;
		switch (architecture) {
		case ENGINOLA:
			factory = ENGINOLA_TOOLKIT;
			break;
		case EMBER:
			factory = EMBER_TOOLKIT;
			break;
		default:
			break;
		}
		
		return factory;
	}
	
	public abstract CPU createCPU();
	
	public abstract MMU createMMU();
}
