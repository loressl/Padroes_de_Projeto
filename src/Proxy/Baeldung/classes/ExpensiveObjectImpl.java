package Proxy.Baeldung.classes;

import Proxy.Baeldung.interfaces.ExpensiveObject;

public class ExpensiveObjectImpl implements ExpensiveObject{

	public ExpensiveObjectImpl() {
		heavyInitialConfiguration();
	}
	
	@Override
	public void process() {
		System.out.println("processing complete.");
	}

	private void heavyInitialConfiguration() {
		System.out.println("Loading initial configuration...");
    }
}
