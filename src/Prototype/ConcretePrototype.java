package Prototype;

public class ConcretePrototype implements Prototype{
	
	private String name;
	
	public ConcretePrototype(String name) {
		this.name= name;
	}
	
	public ConcretePrototype(ConcretePrototype prototype) {
		this.name = prototype.name;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public ConcretePrototype clone() {
		return new ConcretePrototype(this);
	}
}
