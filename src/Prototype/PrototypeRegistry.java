package Prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
	
	private Map<String, Prototype> prototypeRegistry;
	
	public PrototypeRegistry() {
		this.prototypeRegistry= new HashMap<>();
	}
	
	public void addPrototypeToRegistry(String prototypeName, Prototype prototype) {
		this.prototypeRegistry.put(prototypeName, prototype);
	}
	
	public Prototype getPrototypeCloneFromPrototypeRegistry(String prototypeName) {
		return this.prototypeRegistry.get(prototypeName).clone();
	}
}
