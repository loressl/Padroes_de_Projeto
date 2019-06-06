package Abstracty_Factory.SourceMaking.factory;

import Abstracty_Factory.SourceMaking.classes.CPU;
import Abstracty_Factory.SourceMaking.classes.EmberCPU;
import Abstracty_Factory.SourceMaking.classes.EmberMUU;
import Abstracty_Factory.SourceMaking.classes.MMU;

public class EmberToolkit extends AbstractFactory{

	@Override
	public CPU createCPU() {
		return new EmberCPU();
	}

	@Override
	public MMU createMMU() {
		return new EmberMUU();
	}

}
