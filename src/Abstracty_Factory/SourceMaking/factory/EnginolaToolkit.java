package Abstracty_Factory.SourceMaking.factory;

import Abstracty_Factory.SourceMaking.classes.CPU;
import Abstracty_Factory.SourceMaking.classes.EnginolaCPU;
import Abstracty_Factory.SourceMaking.classes.EnginolaMMU;
import Abstracty_Factory.SourceMaking.classes.MMU;

public class EnginolaToolkit extends AbstractFactory{

	@Override
	public CPU createCPU() {
		return new EnginolaCPU();
	}

	@Override
	public MMU createMMU() {
		return new EnginolaMMU();
	}

}
