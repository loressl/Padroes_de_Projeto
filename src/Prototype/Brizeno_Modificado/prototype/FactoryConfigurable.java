package Prototype.Brizeno_Modificado.prototype;

import java.util.HashMap;

import Prototype.Brizeno_Modificado.Interface.IPrototype;

public class FactoryConfigurable {
	
	private HashMap<String, IPrototype> prototypes;
	
	public FactoryConfigurable() {
		this.prototypes = new HashMap<>();
	}
	
	public IPrototype create(String name) {
		if(this.prototypes.containsKey(name))
			return prototypes.get(name).clone();
		return null;
	}
	
	public boolean registerPrototype(String namePrototype, IPrototype prototype) {
		return (prototypes.put(namePrototype, prototype) == null) ? true: false;
	}
	
	public boolean unregisterPrototype(String namePrototype) {
		if(this.prototypes.containsKey(namePrototype)) {
			prototypes.remove(namePrototype);
			return true;
		}
		
		return false;
	}
	
	public boolean clear() {
		prototypes.clear();
		return true;
	}
}
