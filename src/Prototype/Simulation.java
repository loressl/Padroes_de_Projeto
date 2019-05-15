package Prototype;

public class Simulation {
	
	public static void main(String[] args) {
		ConcretePrototype original = new ConcretePrototype("Teste name");
		
		PrototypeRegistry registry = new PrototypeRegistry();
		
		registry.addPrototypeToRegistry("Origial", original);
		
		ConcretePrototype clone = (ConcretePrototype) registry.getPrototypeCloneFromPrototypeRegistry("Original");
		
		System.out.println(original);
		System.out.println(clone.getName());
	}
}
