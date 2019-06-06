package Abstracty_Factory.SourceMaking;

import Abstracty_Factory.SourceMaking.Enum.Architecture;
import Abstracty_Factory.SourceMaking.classes.CPU;
import Abstracty_Factory.SourceMaking.factory.AbstractFactory;

public class Client {

	public static void main(String[] args) {
		AbstractFactory factory = AbstractFactory.getFactory(Architecture.EMBER);
		CPU cpu = factory.createCPU();
		
		System.out.println(cpu.hashCode());
	}

}
