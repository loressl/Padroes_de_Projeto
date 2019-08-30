package Proxy.Baeldung.classes;

import Proxy.Baeldung.interfaces.ExpensiveObject;

public class ExpensiveObjectProxy implements ExpensiveObject{

	@Override
	public void process() {
		if (object == null) {
            object = new ExpensiveObjectImpl();
        }
        object.process();
	}

	private static ExpensiveObject object;
}
