package Proxy.Baeldung;

import Proxy.Baeldung.classes.ExpensiveObjectProxy;
import Proxy.Baeldung.interfaces.ExpensiveObject;

public class Cliente {
	public static void main(String[] args) {
		ExpensiveObject object = new ExpensiveObjectProxy();
	    object.process();
	    object.process();
	}
}
